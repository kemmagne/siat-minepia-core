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
import org.guce.siat.core.ct.dao.TreatmentOrderDao;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TreatmentOrderDaoImpl.
 */
@Repository("treatmentOrderDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentOrderDaoImpl extends AbstractJpaDaoImpl<TreatmentOrder> implements TreatmentOrderDao {

	/**
	 * The Constant LOG.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(TreatmentOrderDaoImpl.class);

	/**
	 * Instantiates a new analys Order dao impl.
	 */
	public TreatmentOrderDaoImpl() {
		super();
		setClasse(TreatmentOrder.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.dao.TreatmentOrderDao#findTreatmentOrderByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public TreatmentOrder findTreatmentOrderByItemFlow(final ItemFlow itemFlow) {
		if (itemFlow != null) {
			try {
				final StringBuilder hqlBuilder = new StringBuilder();

				hqlBuilder.append("FROM TreatmentOrder a ");
				hqlBuilder.append("WHERE a.itemFlow.id = :itemFlowId ");

				final TypedQuery<TreatmentOrder> query = super.entityManager.createQuery(hqlBuilder.toString(), TreatmentOrder.class);
				query.setParameter("itemFlowId", itemFlow.getId());
				return query.getSingleResult();
			} catch (NoResultException | NonUniqueResultException e) {
				LOG.error(Objects.toString(e), e);
			}
		}
		return null;
	}
}
