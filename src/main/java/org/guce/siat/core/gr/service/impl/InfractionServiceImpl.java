package org.guce.siat.core.gr.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.model.Infraction;
import org.guce.siat.core.gr.dao.InfractionDao;
import org.guce.siat.core.gr.service.InfractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class InfractionServiceImpl.
 */
@Service("infractionService")
@Transactional(readOnly = true)
public class InfractionServiceImpl extends AbstractServiceImpl<Infraction> implements InfractionService
{

	/** The infraction dao. */
	@Autowired
	private InfractionDao infractionDao;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<Infraction> getJpaDao()
	{
		return infractionDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<Infraction> jpaDao)
	{
		this.infractionDao = (InfractionDao) jpaDao;

	}

	/**
	 * Gets the infraction dao.
	 *
	 * @return the infraction dao
	 */
	public InfractionDao getInfractionDao()
	{
		return infractionDao;
	}

	/**
	 * Sets the infraction dao.
	 *
	 * @param infractionDao
	 *           the new infraction dao
	 */
	public void setInfractionDao(final InfractionDao infractionDao)
	{
		this.infractionDao = infractionDao;
	}

}
