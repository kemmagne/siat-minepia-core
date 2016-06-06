package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.AnalyseResultApDao;
import org.guce.siat.core.ct.model.AnalyseResultAp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AnalyseResultApDaoImpl.
 */
@Repository("analyseResultApDao")
@Transactional(propagation = Propagation.REQUIRED)
public class AnalyseResultApDaoImpl extends AbstractJpaDaoImpl<AnalyseResultAp> implements AnalyseResultApDao
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AnalyseResultApDaoImpl.class);

	/**
	 * Instantiates a new analyse type dao impl.
	 */
	public AnalyseResultApDaoImpl()
	{
		super();
		setClasse(AnalyseResultAp.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.guce.siat.core.ct.dao.AnalyseResultApDao#findAnalyseResultApByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public AnalyseResultAp findAnalyseResultApByItemFlow(final ItemFlow itemFlow)
	{
		try
		{
			if (itemFlow != null)
			{
				final StringBuilder hqlBuilder = new StringBuilder();

				hqlBuilder.append("SELECT a FROM AnalyseResultAp a ");
				hqlBuilder.append("WHERE a.itemFlow.id = :itemFlowId ");

				final TypedQuery<AnalyseResultAp> query = super.entityManager.createQuery(hqlBuilder.toString(),
						AnalyseResultAp.class);
				query.setParameter("itemFlowId", itemFlow.getId());
				return query.getSingleResult();
			}
		}
		catch (final NoResultException | NonUniqueResultException e)
		{
			LOG.info(Objects.toString(e));
		}
		return null;
	}
}
