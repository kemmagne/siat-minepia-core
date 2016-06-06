package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.AnalyseResultDao;
import org.guce.siat.core.ct.model.AnalyseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AnalyseResultDaoImpl.
 */
@Repository("analyseResultDao")
@Transactional(propagation = Propagation.REQUIRED)
public class AnalyseResultDaoImpl extends AbstractJpaDaoImpl<AnalyseResult> implements AnalyseResultDao
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AnalyseResultDaoImpl.class);

	/**
	 * Instantiates a new analyse result dao impl.
	 */
	public AnalyseResultDaoImpl()
	{
		super();
		setClasse(AnalyseResult.class);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.AnalyseResultDao#findAnalyseResultByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public AnalyseResult findAnalyseResultByItemFlow(final ItemFlow itemFlow)
	{
		if (!Objects.equals(itemFlow, null))
		{
			final StringBuilder hqlBuilder = new StringBuilder();

			hqlBuilder.append("SELECT a FROM AnalyseResult a ");
			hqlBuilder.append("WHERE a.itemFlow.id= :itemFlowId ");

			final TypedQuery<AnalyseResult> query = entityManager.createQuery(hqlBuilder.toString(), AnalyseResult.class);

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
