package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.dao.CoreDao;
import org.guce.siat.common.dao.FileFieldValueDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.model.Container;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.FileUtils;
import org.guce.siat.common.utils.enums.FlowCode;
import org.guce.siat.common.utils.enums.StepCode;
import org.guce.siat.core.ct.dao.PottingReportDao;
import org.guce.siat.core.ct.model.PottingReport;
import org.guce.siat.core.ct.service.PottingReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ht
 */
@Service("pottingReportService")
@Transactional
public class PottingReportServiceImpl extends AbstractServiceImpl<PottingReport> implements PottingReportService {

    @Autowired
    private FileFieldValueDao fileFieldValueDao;

    @Autowired
    private PottingReportDao pottingReportDao;

    @Autowired
    private CoreDao coreDao;

    @Autowired
    private ItemFlowDao itemFlowDao;

    @Autowired
    private FileItemDao fileItemDao;

    @Override
    public PottingReportDao getJpaDao() {
        return pottingReportDao;
    }

    @Override
    public void setJpaDao(AbstractJpaDao<PottingReport> jpaDao) {
        pottingReportDao = (PottingReportDao) jpaDao;
    }

    @Transactional(readOnly = true)
    @Override
    public PottingReport findPottingReportByFile(File file) {
        return getJpaDao().findPottingReportByFile(file);
    }

    @Override
    public PottingReport findPottingReportByFile(File file, boolean validated) {
        return getJpaDao().findPottingReportByFile(file, validated);
    }

    @Transactional(readOnly = true)
    @Override
    public void resetAppointmentUpdates(PottingReport pottingReport, Flow currentFlow) {
        if (FlowCode.FL_CT_104.name().equals(currentFlow.getCode())) {
            pottingReport.setAppointmentDate(null);
        } else if (FlowCode.FL_CT_118.name().equals(currentFlow.getCode())) {
            pottingReport.setAppointmentDate(pottingReport.getAppointmentDateBack());
            pottingReport.setAppointmentDateBack(null);
        }
        pottingReport.setAppointmentDetails(null);
        pottingReport.setAppointmentItemFlow(null);
        pottingReport.setPottingController(null);
    }

    @Transactional(readOnly = true)
    @Override
    public void resetValdiationUpdates(PottingReport pottingReport, Flow currentFlow) {
        pottingReport.setValidationItemFlow(null);
        pottingReport.setAdditionalInformations(null);
        pottingReport.setAuthorizationDate(null);
        pottingReport.setAuthorizationNumber(null);
        pottingReport.setPottingController(null);
        pottingReport.setOtherProcductTypeDescription(null);
        pottingReport.setPottingEndDate(null);
        pottingReport.setQuality(null);
        pottingReport.setTreatmentCertDate(null);
        pottingReport.setTreatmentCertNumber(null);
    }

    @Transactional(readOnly = true)
    @Override
    public PottingReport findPottingReportByAppointmentFlow(ItemFlow appointmentItemFlow) {
        return pottingReportDao.findPottingReportByAppointmentFlow(appointmentItemFlow);
    }

    @Transactional(readOnly = true)
    @Override
    public PottingReport findPottingReportByValidationFlow(ItemFlow validationItemFlow) {
        return pottingReportDao.findPottingReportByValidationFlow(validationItemFlow);
    }

    @Override
    public void updateAfterSignature(File currentFile) {

        PottingReport pottingReport = findPottingReportByFile(currentFile, false);
        if (pottingReport == null) {
            return;
        }

        List<FileItem> fileItems = currentFile.getFileItemsList();
        if (CollectionUtils.isEmpty(fileItems)) {
            fileItems = fileItemDao.findFileItemsByFile(currentFile);
        }

        boolean pvok = StepCode.ST_CT_06.equals(fileItems.get(0).getStep().getStepCode());
        pottingReport.setValidated(pvok);
        update(pottingReport);

        File root = currentFile.getParent();

        if (root == null) {
            return;
        }

        PottingReport pottingReportRoot = findPottingReportByFile(root);
        org.springframework.beans.BeanUtils.copyProperties(pottingReport, pottingReportRoot, "id", "file");
        update(pottingReportRoot);

        FileUtils.applyModifications(currentFile, root);
        fileFieldValueDao.saveOrUpdateList(root.getFileFieldValueList());

        List<Container> modifiedContainers = currentFile.getContainers();
        if (CollectionUtils.isNotEmpty(modifiedContainers)) {

            List<Container> containers = new ArrayList<>();
            for (Container mc : modifiedContainers) {

                Container container = new Container();

                org.springframework.beans.BeanUtils.copyProperties(mc, container, "id", "file");
                container.setFile(root);

                containers.add(container);
            }

            coreDao.delete(root.getContainers());
            coreDao.save(containers);
        }
    }

}
