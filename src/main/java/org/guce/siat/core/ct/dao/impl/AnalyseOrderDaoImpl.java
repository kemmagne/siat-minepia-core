/**
 *
 */
package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.AnalyseOrderDao;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class AnalyseOrderDaoImpl.
 */
@Repository("analyseOrderDao")
@Transactional(propagation = Propagation.REQUIRED)
public class AnalyseOrderDaoImpl extends AbstractJpaDaoImpl<AnalyseOrder> implements AnalyseOrderDao {

	/**
	 * The Constant LOG.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(AnalyseOrderDaoImpl.class);

	/**
	 * Instantiates a new analys Order dao impl.
	 */
	public AnalyseOrderDaoImpl() {
		super();
		setClasse(AnalyseOrder.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.AnalyseOrderDao#findByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public AnalyseOrder findByItemFlow(final ItemFlow itemFlow) {
		if (itemFlow != null) {
			try {
				final String hqlString = "FROM AnalyseOrder a WHERE a.itemFlow.id = :itemFlowId)";
				final TypedQuery<AnalyseOrder> query = super.entityManager.createQuery(hqlString, AnalyseOrder.class);
				query.setParameter("itemFlowId", itemFlow.getId());
				return query.getSingleResult();
			} catch (NoResultException | NonUniqueResultException e) {
				LOG.error(Objects.toString(e), e);
			}
		}
		return null;
	}
}
