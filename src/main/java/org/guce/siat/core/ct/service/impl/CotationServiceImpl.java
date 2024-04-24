package org.guce.siat.core.ct.service.impl;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.FileTypeDao;
import org.guce.siat.common.dao.FlowDao;
import org.guce.siat.common.dao.ParamsDao;
import org.guce.siat.common.dao.TransferDao;
import org.guce.siat.common.dao.UserAuthorityFileTypeDao;
import org.guce.siat.common.dao.UserDao;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.ControllerHoliday;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.MinistryFileType;
import org.guce.siat.common.model.Params;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.Transfer;
import org.guce.siat.common.model.User;
import org.guce.siat.common.model.UserAuthority;
import org.guce.siat.common.service.ControllerHolidayService;
import org.guce.siat.common.service.FileFieldValueService;
import org.guce.siat.common.service.ItemFlowService;
import org.guce.siat.common.service.UserAuthorityFileTypeService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.enums.AperakType;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.common.utils.enums.ParamsCategory;
import org.guce.siat.core.ct.dao.CotationDao;
import org.guce.siat.core.ct.service.CotationService;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 *
 * @author tadzotsa
 */
@Service("cotationService")
@Transactional
public class CotationServiceImpl implements CotationService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * the cotation param format
     *
     * 0 : the bureau code
     *
     * 1 : the product type
     */
    private static final String COTATION_PARAM_FORMAT = "cotation.{0}.{1}";

    @Autowired
    private FileFieldValueService fileFieldValueService;
    @Autowired
    private ItemFlowService itemFlowService;

    @Autowired
    private UserDao userDao;
    @Autowired
    private FlowDao flowDao;
    @Autowired
    private FileDao fileDao;
    @Autowired
    private TransferDao transferDao;
    @Autowired
    private FileTypeDao fileTypeDao;
    @Autowired
    private FileItemDao fileItemDao;
    @Autowired
    private CotationDao cotationDao;
    @Autowired
    private ParamsDao paramsDao;
    @Autowired
    private ControllerHolidayService controllerHolidayService;

    @Autowired
    private UserAuthorityFileTypeDao UserAuthorityFileTypeDao;
    
    
    @Autowired
    private UserAuthorityFileTypeService userAuthorityFileTypeService;

    @Override
    public void dispatch(File currentFile, Flow currentFlow) {

        MinistryFileType ministryFileType = fileTypeDao.findMinistryFileType(currentFile.getFileType().getCode(), currentFile.getDestinataire());
        if (ministryFileType == null) {
            return;
        } else if (!BooleanUtils.toBoolean(ministryFileType.getAutomaticCotationAllowed())) {
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
            logger.error("Cannot determine the cotation flow : {} - {}", currentFile, cotationStep);
            return;
        }

        User sender = userDao.getUserByLogin(Constants.SYSTEM_USER_LOGIN);
        User assignedUser = null;

        Transfer existingTransfer = transferDao.findLastByNumeroDemandeAndBureau(currentFile.getNumeroDemande(), currentFile.getBureau());
        if (existingTransfer != null) {
            assignedUser = existingTransfer.getAssignedUser();
            assignedUser = checkUser(assignedUser, currentFile);
        }

        if (assignedUser == null) {
            if(currentFile.getFileType().getCode().equals(FileTypeCode.ATM_MINEPIA)){
                assignedUser = findUserForCotationMinepia(currentFile);
            }else{
                 assignedUser = findUserForCotation(currentFile);
            }
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
    }

    @Override
    public void automaticQuotation(File currentFile, Flow currentFlow, User loggedUser) {

        MinistryFileType ministryFileType = fileTypeDao.findMinistryFileType(currentFile.getFileType().getCode(), currentFile.getDestinataire());
        if (ministryFileType == null) {
            return;
        } else if (!BooleanUtils.toBoolean(ministryFileType.getAutomaticCotationAllowed())) {
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
            logger.error("Cannot determine the cotation flow : {} - {}", currentFile, cotationStep);
            return;
        }

        User sender = userDao.getUserByLogin(Constants.SYSTEM_USER_LOGIN);
        if (loggedUser == null) {
            loggedUser = sender;
            if (loggedUser != null) {
                loggedUser.setAdministration(currentFile.getBureau());
            }
        }
        User assignedUser = null;

        Transfer existingTransfer = transferDao.findLastByNumeroDemandeAndBureau(currentFile.getNumeroDemande(), currentFile.getBureau());
        if (existingTransfer != null) {
            assignedUser = existingTransfer.getAssignedUser();
            assignedUser = checkUser(assignedUser, currentFile);
        }

       if (assignedUser == null) {
             assignedUser = findUserForCotation(currentFile);
            
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
    }

    private synchronized User findUserForCotationMinepia(File currentFile){
        List<User> controllers =  new ArrayList<>();
        List<UserAuthority> userAuthority =  UserAuthorityFileTypeDao.findUserAuthorityByFileType(currentFile.getFileType());
       if(userAuthority != null && !userAuthority.isEmpty()){
        logger.info("find user for cotation for fileType : {}", currentFile.getFileType());
           for(UserAuthority ua : userAuthority){
            if(ua.getAuthorityGranted().getRole().trim().equalsIgnoreCase("RT".trim())){
                ControllerHoliday controllerHoliday = controllerHolidayService.findHolidayByController(ua.getUser());
                if(controllerHoliday == null || new Date().after(controllerHoliday.getToDate())){
                 controllers.add(ua.getUser());
                }
            }
        }
        return !controllers.isEmpty() ? controllers.get(new Random().nextInt(controllers.size())) : null;
       }
       return null;
    }
    
    private synchronized User findUserForCotation(File currentFile) {
        FileFieldValue ffv = fileFieldValueService.findValueByFileFieldAndFile(CctExportProductType.getFileFieldCode(), currentFile);
        CctExportProductType productType;
        try {
            productType = CctExportProductType.valueOf(ffv.getValue());
        } catch (Exception ex) {
            logger.error("Cannot map the product type to the {} enum : {} - {}", CctExportProductType.class, currentFile, ffv.getValue());
            logger.error(null, ex);
            return null;
        }
        Bureau bureau = currentFile.getBureau();
        List<User> potentialUsers = cotationDao.findUsersForCotation(bureau, productType);
        if (potentialUsers.isEmpty()) {
            logger.error("There's not potential users for cotation : bureau {}, product type {}", bureau, productType);
            return null;
        }
        Collections.sort(potentialUsers, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return new BigDecimal(user1.getId()).compareTo(new BigDecimal(user2.getId()));
            }
        });
        String cotationStringParam = MessageFormat.format(COTATION_PARAM_FORMAT, bureau.getCode(), productType.name());
        Params params = paramsDao.findParamsByName(cotationStringParam);
        final Long assignedUserId;
        if (params != null) {
            List<Long> potential = new ArrayList<>();
            for (User pu : potentialUsers) {
                potential.add(pu.getId());
            }
            String cotationString = params.getValue();
            logger.info("cotation string for file {}, bureau {} and product type {} : {}", currentFile, bureau, productType, cotationString);
            Set<String> assignedSet = StringUtils.commaDelimitedListToSet(cotationString);
            Set<Long> assigned = new HashSet<>();
            for (String as : assignedSet) {
                assigned.add(Long.parseLong(as));
            }
            List<Long> remaningList = new ArrayList<>(CollectionUtils.subtract(potential, assigned));
            if (!remaningList.isEmpty()) {
                Collections.sort(remaningList, new Comparator<Long>() {
                    @Override
                    public int compare(Long o1, Long o2) {
                        return o1.compareTo(o2);
                    }
                });
                assignedUserId = remaningList.get(0);
                assigned.add(assignedUserId);
            } else {
                assignedUserId = potential.get(0);
                assigned = Collections.singleton(potential.get(0));
            }
            params.setValue(StringUtils.collectionToCommaDelimitedString(assigned));
            paramsDao.update(params);
        } else {
            params = new Params();
            params.setParamsCategory(ParamsCategory.GN);
            params.setName(cotationStringParam);
            assignedUserId = potentialUsers.get(0).getId();
            params.setValue(assignedUserId.toString());
            paramsDao.save(params);
        }

        User assignedUser = userDao.find(assignedUserId);

        return assignedUser;
    }

    private synchronized User findUserForAutomaticQuotation(File currentFile, Flow cotationFlow, User loggedUser) {
        Bureau bureau = currentFile.getBureau();
        List<User> potentialUsers = userAuthorityFileTypeService.findUserByFileTypeAndStepAuthorities(currentFile.getFileType(), cotationFlow.getToStep(), currentFile, loggedUser);
        if (potentialUsers.isEmpty()) {
            logger.error("There's not potential users for cotation : file type: {} bureau {}", currentFile.getFileType().getCode().name(), bureau);
            return null;
        }
        Collections.sort(potentialUsers, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return new BigDecimal(user1.getId()).compareTo(new BigDecimal(user2.getId()));
            }
        });
        String cotationStringParam = MessageFormat.format(COTATION_PARAM_FORMAT, currentFile.getFileType().getCode().name(), bureau.getCode());
        Params params = paramsDao.findParamsByName(cotationStringParam);
        final Long assignedUserId;
        if (params != null) {
            List<Long> potential = new ArrayList<>();
            for (User pu : potentialUsers) {
                //Remove all disabled users
                if(pu.getEnabled() && !pu.getDeleted() && pu.getAccountNonExpired() && pu.getAccountNonLocked() && pu.getCredentialsNonExpired()) {
                    potential.add(pu.getId());
                }
            }
            String cotationString = params.getValue();
            logger.info("cotation string for file {}, file type {} bureau {} : {}", currentFile, currentFile.getFileType().getCode().name(), bureau, cotationString);
            Set<String> assignedSet = StringUtils.commaDelimitedListToSet(cotationString);
            Set<Long> assigned = new HashSet<>();
            for (String as : assignedSet) {
                assigned.add(Long.parseLong(as));
            }
            List<Long> remaningList = new ArrayList<>(CollectionUtils.subtract(potential, assigned));
            if (!remaningList.isEmpty()) {
                Collections.sort(remaningList, new Comparator<Long>() {
                    @Override
                    public int compare(Long o1, Long o2) {
                        return o1.compareTo(o2);
                    }
                });
                assignedUserId = remaningList.get(0);
                assigned.add(assignedUserId);
            } else {
                assignedUserId = potential.get(0);
                assigned = Collections.singleton(potential.get(0));
            }
            params.setValue(StringUtils.collectionToCommaDelimitedString(assigned));
            paramsDao.update(params);
        } else {
            params = new Params();
            params.setParamsCategory(ParamsCategory.GN);
            params.setName(cotationStringParam);
            assignedUserId = potentialUsers.get(0).getId();
            params.setValue(assignedUserId.toString());
            paramsDao.save(params);
        }

        User assignedUser = userDao.find(assignedUserId);

        return assignedUser;
    }

    private User checkUser(User user, File currentFile) {

        if (user == null) {
            return null;
        }

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
        fileDao.update(currentFile);

        itemFlowService.sendDecisionsToDispatchCctFile(currentFile, fileItems);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile) {
        return cotationDao.findCotationAgentsByBureauAndRoleAndProductType(currentFile);
    }

}
