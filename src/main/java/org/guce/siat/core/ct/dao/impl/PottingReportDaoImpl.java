package org.guce.siat.core.ct.dao.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.PottingReportDao;
import org.guce.siat.core.ct.model.PottingReport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ht
 */
@Repository("pottingReportDao")
@Transactional
public class PottingReportDaoImpl extends AbstractJpaDaoImpl<PottingReport> implements PottingReportDao {

    public PottingReportDaoImpl() {
        setClasse(PottingReport.class);
    }

    @Override
    public PottingReport findPottingReportByFile(File file) {

        TypedQuery<PottingReport> query = super.entityManager.createQuery("SELECT pr FROM PottingReport pr WHERE pr.file.id = :fileId ORDER BY pr.id DESC", PottingReport.class);

        query.setParameter("fileId", file.getId());

        query.setMaxResults(1);

        try {
            return query.getSingleResult();
        } catch (NoResultException nrex) {
            return null;
        }
    }

    @Override
    public PottingReport findPottingReportByAppointmentFlow(ItemFlow appointmentItemFlow) {

        TypedQuery<PottingReport> query = super.entityManager.createQuery("SELECT pr FROM PottingReport pr WHERE pr.appointmentItemFlow IS NOT NULL AND pr.appointmentItemFlow.flow.id = :appointmentItemFlowId ORDER BY pr.id DESC", PottingReport.class);

        query.setParameter("appointmentItemFlowId", appointmentItemFlow.getFlow().getId());

        query.setMaxResults(1);

        try {
            return query.getSingleResult();
        } catch (NoResultException nrex) {
            return null;
        }
    }

    @Override
    public PottingReport findPottingReportByValidationFlow(ItemFlow validationItemFlow) {

        TypedQuery<PottingReport> query = super.entityManager.createQuery("SELECT pr FROM PottingReport pr WHERE pr.validationItemFlow IS NOT NULL AND pr.validationItemFlow.flow.id = :validationItemFlowId ORDER BY pr.id DESC", PottingReport.class);

        query.setParameter("validationItemFlowId", validationItemFlow.getFlow().getId());

        query.setMaxResults(1);

        try {
            return query.getSingleResult();
        } catch (NoResultException nrex) {
            return null;
        }
    }

}
