/**
 *
 */
package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.AnalyseOrderDao;
import org.guce.siat.core.ct.model.AnalyseOrder;
import org.guce.siat.core.ct.service.AnalyseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 * The Class AnalyseOrderServiceImpl.
 */
@Service("analyseOrderService")
@Transactional(readOnly = true)
public class AnalyseOrderServiceImpl extends AbstractServiceImpl<AnalyseOrder> implements AnalyseOrderService
{


	/** The analyse Order dao. */
	@Autowired
	private AnalyseOrderDao analyseOrderDao;


	/**
	 * Instantiates a new analyse Order service impl.
	 */
	public AnalyseOrderServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<AnalyseOrder> getJpaDao()
	{
		return analyseOrderDao;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<AnalyseOrder> jpaDao)
	{
		this.analyseOrderDao = (AnalyseOrderDao) jpaDao;
	}

	/* (non-Javadoc)
	 * @see org.guce.siat.core.ct.service.AnalyseOrderService#findByItemFlow(org.guce.siat.common.model.ItemFlow)
	 */
	@Override
	public AnalyseOrder findByItemFlow(ItemFlow itemFlow)
	{
		return analyseOrderDao.findByItemFlow(itemFlow);
	}
	
}
