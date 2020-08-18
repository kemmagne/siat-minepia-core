package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.lang3.BooleanUtils;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.FileTypeDao;
import org.guce.siat.common.dao.FlowDao;
import org.guce.siat.common.dao.TransferDao;
import org.guce.siat.common.dao.UserDao;
import org.guce.siat.common.mail.MailConstants;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.MinistryFileType;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.Transfer;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.FileFieldValueService;
import org.guce.siat.common.service.FileService;
import org.guce.siat.common.service.ItemFlowService;
import org.guce.siat.common.service.MailService;
import org.guce.siat.common.utils.enums.AperakType;
import org.guce.siat.core.ct.dao.CotationDao;
import org.guce.siat.core.ct.service.CotationService;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tadzotsa
 */
@Service("cotationService")
@Transactional
public class CotationServiceImpl implements CotationService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private FileService fileService;
    @Autowired
    private FileFieldValueService fileFieldValueService;
    @Autowired
    private ItemFlowService itemFlowService;
    @Autowired
    private MailService mailService;

    @Autowired
    private UserDao userDao;
    @Autowired
    private FlowDao flowDao;
    @Autowired
    private TransferDao transferDao;
    @Autowired
    private FileTypeDao fileTypeDao;

    /**
     * The file item dao.
     */
    @Autowired
    private FileItemDao fileItemDao;
    @Autowired
    private CotationDao cotationDao;

    @Override
    public void dispatch(File currentFile, Flow currentFlow) {

        MinistryFileType ministryFileType = fileTypeDao.findMinistryFileType(currentFile.getFileType().getCode(), currentFile.getDestinataire());
        if (!BooleanUtils.toBoolean(ministryFileType.getAutomaticCotationAllowed())) {
            return;
        }

        List<FileItem> fileItems = currentFile.getFileItemsList();
        if (fileItems == null) {
            fileItems = fileItemDao.findFileItemsByFile(currentFile);
        }

        if (currentFlow == null) {
            currentFlow = itemFlowService.findLastItemFlowByFileItem(fileItems.get(0)).getFlow();
        }

        if (!flowDao.findBeforeCotationStepFlows(currentFile).contains(currentFlow)) {
            return;
        }

        Step cotationStep = currentFlow.getToStep();
        List<Flow> flowList = flowDao.findFlowsByFromStepAndFileType2(cotationStep, currentFile.getFileType());
        Flow cotationFlow = null;
        for (Flow flow : flowList) {
            if (BooleanUtils.toBoolean(flow.getIsCota())) {
                cotationFlow = flow;
                break;
            }
        }

        if (cotationFlow == null) {
            logger.error("Cannot not determine the cotation flow : {} - {}", currentFile, cotationStep);
            return;
        }

        Step treatmentStep = cotationFlow.getToStep();
        User sender = userDao.getUserByLogin("SYSTEM");
        User assignedUser = null;

        Transfer existingTransfer = transferDao.findLastByNumeroDemandeAndBureau(currentFile.getNumeroDemande(), currentFile.getBureau());
        if (existingTransfer != null) {
            assignedUser = existingTransfer.getAssignedUser();
            assignedUser = checkUser(assignedUser, currentFile);
        }

        if (assignedUser == null) {
            List<File> files = fileService.findByNumeroDemandeAndBureau(currentFile, treatmentStep);
            assignedUser = !files.isEmpty() ? files.get(0).getAssignedUser() : null;
            assignedUser = checkUser(assignedUser, currentFile);
        }

        if (assignedUser == null) {
            FileFieldValue ffv = fileFieldValueService.findValueByFileFieldAndFile(CctExportProductType.getFileFieldCode(), currentFile);
            CctExportProductType productType;
            try {
                productType = CctExportProductType.valueOf(ffv.getValue());
            } catch (Exception ex) {
                logger.error("Cannot map the product type to the {} enum : {} - {}", CctExportProductType.class, currentFile, ffv.getValue());
                return;
            }
            Bureau bureau = currentFile.getBureau();
            assignedUser = cotationDao.findUserForCotation(productType, bureau);
        }

        if (assignedUser == null) {
            logger.error("Cannot not determine the user to assign the file : {} - {}", currentFile, cotationStep);
            return;
        }

        takeDecision(currentFile, fileItems, sender, assignedUser, cotationFlow);

        Transfer transfer = new Transfer();

        transfer.setAssignedUser(assignedUser);
        transfer.setFile(currentFile);
        transfer.setNumeroDemande(currentFile.getNumeroDemande());
        transfer.setUser(sender);

        transferDao.save(transfer);

        // notification
    }

    private User checkUser(User user, File currentFile) {

        if (!BooleanUtils.toBoolean(user.getEnabled())) {
            logger.warn("The user {} has been disabled. The file {} cannot assigned to him/he", user, currentFile);
            return null;
        }

        if (BooleanUtils.toBoolean(user.getDeleted())) {
            logger.warn("The user {} has been deleted. The file {} cannot assigned to him/he", user, currentFile);
            return null;
        }

        return user;
    }

    private void takeDecision(File currentFile, List<FileItem> fileItems, User sender, User assignedUser, Flow cotationFlow) {

        List<ItemFlow> itemFlowsToAdd = new ArrayList<>();

        for (FileItem fileItem : fileItems) {

            final ItemFlow itemFlow = new ItemFlow();

            itemFlow.setCreated(Calendar.getInstance().getTime());
            itemFlow.setFileItem(fileItem);
            itemFlow.setFlow(cotationFlow);
            itemFlow.setSender(sender);
            itemFlow.setSent(Boolean.FALSE);
            itemFlow.setUnread(Boolean.TRUE);
            itemFlow.setReceived(AperakType.APERAK_D.getCharCode());
            itemFlow.setAssignedUser(assignedUser);

            itemFlowsToAdd.add(itemFlow);
        }

        itemFlowService.takeDecision(itemFlowsToAdd, null);

        currentFile.setAssignedUser(assignedUser);
        fileService.update(currentFile);

        itemFlowService.sendDecisionsToDispatchCctFile(currentFile, fileItems);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile) {
        return cotationDao.findCotationAgentsByBureauAndRoleAndProductType(currentFile);
    }

    private void notify(User user, File file) {

        Map<String, String> map = new HashMap<>();
        String object = "";

        if (Locale.FRENCH.getLanguage().toUpperCase().equals(user.getPreferedLanguage())) {
//            object = ResourceBundle.getBundle(ControllerConstants.Bundle.LOCAL_BUNDLE_NAME, Locale.FRANCE).getString(ControllerConstants.Bundle.Messages.OBJECT_MAIL_NOTIFICATION_RECEPT_FOLDER);
//            map.put(MailConstants.VMF, EMAIL_BODY_NOTIFICATION_FR);
        } else if (Locale.ENGLISH.getLanguage().toUpperCase().equals(user.getPreferedLanguage())) {
//            object = ResourceBundle.getBundle(ControllerConstants.Bundle.LOCAL_BUNDLE_NAME, Locale.ENGLISH).getString(ControllerConstants.Bundle.Messages.OBJECT_MAIL_NOTIFICATION_RECEPT_FOLDER);
//            map.put(MailConstants.VMF, EMAIL_BODY_NOTIFICATION_EN);
        }

        map.put(MailConstants.SUBJECT, object);
        map.put("firstName", user.getFirstName());
        map.put(MailConstants.FROM, mailService.getFromValue());
        map.put(MailConstants.EMAIL, user.getEmail());
        map.put("referenceSiat", file.getReferenceSiat());

        mailService.sendMail(map);
    }

}
