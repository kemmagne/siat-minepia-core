package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.TreatmentResultDao;
import org.guce.siat.core.ct.model.TreatmentResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AnalyseResultDaoImpl.
 */
@Repository("treatmentResultDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentResultDaoImpl extends AbstractJpaDaoImpl<TreatmentResult> implements TreatmentResultDao
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(TreatmentResultDaoImpl.class);


	/**
	 * Instantiates a new treatment result dao impl.
	 */
	public TreatmentResultDaoImpl()
	{
		super();
		setClasse(TreatmentResult.class);
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.TreatmentResultDao#findTreatmentResultByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public TreatmentResult findTreatmentResultByItemFlow(final ItemFlow itemFlow)
	{
		if (!Objects.equals(itemFlow, null))
		{

			final StringBuilder hqlBuilder = new StringBuilder();

			hqlBuilder.append("SELECT a FROM TreatmentResult a ");
			hqlBuilder.append("WHERE a.itemFlow.id= :itemFlowId ");

			final TypedQuery<TreatmentResult> query = entityManager.createQuery(hqlBuilder.toString(), TreatmentResult.class);

			query.setParameter("itemFlowId", itemFlow.getId());

			try
			{
				return query.getSingleResult();
			}
			catch (NoResultException | NonUniqueResultException e)
			{
				LOG.error(Objects.toString(e));
			}

		}
		return null;
	}
}
