package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.Flow;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.enums.FlowCode;
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
    private PottingReportDao pottingReportDao;

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

    @Override
    public PottingReport findPottingReportByAppointmentFlow(ItemFlow appointmentItemFlow) {
        return pottingReportDao.findPottingReportByAppointmentFlow(appointmentItemFlow);
    }

    @Override
    public PottingReport findPottingReportByValidationFlow(ItemFlow validationItemFlow) {
        return pottingReportDao.findPottingReportByValidationFlow(validationItemFlow);
    }

}
