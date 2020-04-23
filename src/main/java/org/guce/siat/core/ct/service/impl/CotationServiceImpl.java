package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.apache.commons.lang3.BooleanUtils;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileFieldValue;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.FileFieldValueService;
import org.guce.siat.common.service.FileService;
import org.guce.siat.common.service.FlowService;
import org.guce.siat.common.service.ItemFlowService;
import org.guce.siat.common.utils.enums.AperakType;
import org.guce.siat.core.ct.dao.CotationDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.guce.siat.core.ct.service.CotationService;
import org.guce.siat.core.ct.util.enums.CctExportProductType;

/**
 *
 * @author tadzotsa
 */
@Service("cotationService")
@Transactional
public class CotationServiceImpl implements CotationService {

    private static final Logger LOG = LoggerFactory.getLogger(CotationServiceImpl.class);

    @Autowired
    private FileService fileService;
    @Autowired
    private ItemFlowService itemFlowService;
    @Autowired
    private FlowService flowService;
    @Autowired
    private FileFieldValueService fileFieldValueService;

    @Autowired
    private CotationDao cotationDao;

    @Override
    public void dispatch(File currentFile, User loggedUser, Flow currentFlow) {
        Step fileItemStep = currentFlow.getToStep();
        List<Flow> flowList = flowService.findFlowsByFromStepAndFileType2(fileItemStep, currentFile.getFileType());
        Flow cotationFlow = null;
        for (Flow flow : flowList) {
            if (BooleanUtils.toBoolean(flow.getIsCota())) {
                cotationFlow = flow;
                break;
            }
        }

        if (cotationFlow == null) {
            LOG.error("Cannot not determine the cotation flow : {} - {}", currentFile, fileItemStep);
            return;
        }

        User sender = loggedUser; // demander Stève ??? ...
        User assignedUserForCotation = null;

        List<File> files = fileService.findByNumeroDemandeAndBureau(currentFile, fileItemStep);
        if (!files.isEmpty()) {
            assignedUserForCotation = files.get(0).getAssignedUser();
        } else {
            FileFieldValue ffv = fileFieldValueService.findValueByFileFieldAndFile(CctExportProductType.getFileFieldCode(), currentFile);
            CctExportProductType productType;
            try {
                productType = CctExportProductType.valueOf(ffv.getValue());
            } catch (Exception ex) {
                LOG.error("Cannot map the product type to the {} enum : {} - {}", CctExportProductType.class, currentFile, ffv.getValue());
                return;
            }
            FileType fileType = currentFile.getFileType();
            Bureau bureau = currentFile.getBureau();
        }

        if (assignedUserForCotation == null) {
            LOG.error("Cannot not determine the cotation user : {} - {}", currentFile, fileItemStep);
            return;
        }

        takeDecision(currentFile, sender, assignedUserForCotation, cotationFlow);
    }

    private void takeDecision(File currentFile, User sender, User assignedUserForCotation, Flow cotationFlow) {

        List<ItemFlow> itemFlowsToAdd = new ArrayList<>();

        List<FileItem> fileItems = currentFile.getFileItemsList();
        for (FileItem fileItem : fileItems) {

            final ItemFlow itemFlow = new ItemFlow();

            itemFlow.setCreated(Calendar.getInstance().getTime());
            itemFlow.setFileItem(fileItem);
            itemFlow.setFlow(cotationFlow);
            itemFlow.setSender(sender);
            itemFlow.setSent(Boolean.FALSE);
            itemFlow.setUnread(Boolean.TRUE);
            itemFlow.setReceived(AperakType.APERAK_D.getCharCode());
            itemFlow.setAssignedUser(assignedUserForCotation);

            itemFlowsToAdd.add(itemFlow);
        }

        itemFlowService.takeDecision(itemFlowsToAdd, null);

        currentFile.setAssignedUser(assignedUserForCotation);
        fileService.update(currentFile);

        itemFlowService.sendDecisionsToDispatchCctFile(currentFile, fileItems);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findCotationAgentsByBureauAndRoleAndProductType(File currentFile) {
        return cotationDao.findCotationAgentsByBureauAndRoleAndProductType(currentFile);
    }

}
