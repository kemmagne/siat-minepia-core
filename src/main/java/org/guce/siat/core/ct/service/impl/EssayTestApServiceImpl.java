package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.EssayTestAPDao;
import org.guce.siat.core.ct.model.EssayTestAP;
import org.guce.siat.core.ct.service.EssayTestApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class EssayTestApServiceImpl.
 */
@Service("essayTestApService")
@Transactional(readOnly = true)
public class EssayTestApServiceImpl extends AbstractServiceImpl<EssayTestAP> implements EssayTestApService
{

	/** The essay test ap dao. */
	@Autowired
	private EssayTestAPDao essayTestAPDao;

	/**
	 * Instantiates a new essay test ap service impl.
	 */
	public EssayTestApServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<EssayTestAP> getJpaDao()
	{
		return essayTestAPDao;

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<EssayTestAP> jpaDao)
	{
		this.essayTestAPDao = (EssayTestAPDao) jpaDao;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.EssayTestApService#findByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public EssayTestAP findByItemFlow(final ItemFlow itemFlow)
	{
		return essayTestAPDao.findByItemFlow(itemFlow);
	}
}
