package org.guce.siat.core.ct.dao.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.InspectionReportDao;
import org.guce.siat.core.ct.model.InspectionReport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class InspectionReportDaoImpl.
 */
@Repository("inspectionReportDao")
@Transactional(propagation = Propagation.REQUIRED)
public class InspectionReportDaoImpl extends AbstractJpaDaoImpl<InspectionReport> implements InspectionReportDao {

    /**
     * Instantiates a new inspection report dao impl.
     */
    public InspectionReportDaoImpl() {
        setClasse(InspectionReport.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.InspectionReportDao#findInspectionReportsByItemFlowList(java.util.List)
     */
    @Override
    public List<InspectionReport> findInspectionReportsByItemFlowList(List<ItemFlow> itemFlows) {
        if (CollectionUtils.isNotEmpty(itemFlows)) {
            String hql = "SELECT a FROM InspectionReport a WHERE a.itemFlow IN (:itemFlows)";

            TypedQuery<InspectionReport> query = super.entityManager.createQuery(hql, InspectionReport.class);
            query.setParameter("itemFlows", itemFlows);

            return query.getResultList();
        }
        return Collections.emptyList();

    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.InspectionReportDao#findByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public InspectionReport findByItemFlow(ItemFlow itemFlow) {

        if (itemFlow == null) {
            return null;
        }

        try {
            TypedQuery<InspectionReport> query = super.entityManager.createQuery("SELECT a FROM InspectionReport a WHERE a.itemFlow.id = :itemFlowId ORDER BY a.itemFlow.id DESC", InspectionReport.class);
            query.setParameter("itemFlowId", itemFlow.getId());
            query.setMaxResults(1);

            return query.getSingleResult();
        } catch (NoResultException e) {
            logger.info("No result in method org.​guce.​siat.​core.​ct.​model.InspectionReportDaoImpl.findByItemFlow - file number :  {} ; file item line number : {} ; item flow : {}", itemFlow.getFileItem().getFile().getNumeroDossier(), itemFlow.getFileItem().getLineNumber(), itemFlow.getFileItem().getId());
        }

        return null;
    }

    @Override
    public InspectionReport findLastInspectionReportsByFileItem(FileItem fileItem) {

        if (fileItem == null) {
            return null;
        }

        StringBuilder hqlBuilder = new StringBuilder();

        hqlBuilder.append("SELECT a FROM InspectionReport a ");
        hqlBuilder.append("WHERE a.itemFlow.fileItem.id = :fileItemId ");
        hqlBuilder.append("ORDER BY a.id DESC");

        TypedQuery<InspectionReport> query = super.entityManager.createQuery(hqlBuilder.toString(), InspectionReport.class);
        query.setParameter("fileItemId", fileItem.getId());
        query.setMaxResults(1);

        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            logger.info("No result in method org.​guce.​siat.​core.​ct.​model.InspectionReportDaoImpl.findLastInspectionReportsByFileItem - file number :  {} ; file item line number : {}", fileItem.getFile().getNumeroDossier(), fileItem.getLineNumber());
        }

        return null;
    }

}
