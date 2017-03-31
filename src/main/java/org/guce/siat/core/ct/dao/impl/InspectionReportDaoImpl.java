package org.guce.siat.core.ct.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.InspectionReportDao;
import org.guce.siat.core.ct.model.InspectionReport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	 * The Constant LOG.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(InspectionReportDaoImpl.class);

	/**
	 * Instantiates a new inspection report dao impl.
	 */
	public InspectionReportDaoImpl() {
		super();
		setClasse(InspectionReport.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.InspectionReportDao#findInspectionReportsByItemFlowList(java.util.List)
	 */
	@Override
	public List<InspectionReport> findInspectionReportsByItemFlowList(final List<ItemFlow> itemFlows) {
		if (CollectionUtils.isNotEmpty(itemFlows)) {
			final String hql = "SELECT a FROM InspectionReport a WHERE a.itemFlow IN (:itemFlows)";

			final TypedQuery<InspectionReport> query = super.entityManager.createQuery(hql, InspectionReport.class);
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
	public InspectionReport findByItemFlow(final ItemFlow itemFlow) {
		try {
			if (itemFlow != null) {
				final String hql = "SELECT a FROM InspectionReport a WHERE a.itemFlow.id = :itemFlowId ";
				final TypedQuery<InspectionReport> query = super.entityManager.createQuery(hql, InspectionReport.class);
				query.setParameter("itemFlowId", itemFlow.getId());
				return query.getSingleResult();
			}
		} catch (final NoResultException | NonUniqueResultException e) {
			LOG.info(Objects.toString(e), e);
		}
		return null;
	}

	@Override
	public InspectionReport findLastInspectionReportsByFileItem(final FileItem fileItem) {
		try {
			if (fileItem != null) {
				final StringBuilder hqlBuilder = new StringBuilder();

				hqlBuilder.append("SELECT a FROM InspectionReport a ");
				hqlBuilder.append("WHERE a.fileItem.id = :fileItemId ");
				hqlBuilder.append("ORDER BY a.reportDate ASC");

				final TypedQuery<InspectionReport> query = super.entityManager.createQuery(hqlBuilder.toString(),
						InspectionReport.class);
				query.setParameter("fileItemId", fileItem.getId());
				return query.getSingleResult();
			}
		} catch (final NoResultException | NonUniqueResultException e) {
			LOG.info(Objects.toString(e), e);
		}
		return null;
	}

}
