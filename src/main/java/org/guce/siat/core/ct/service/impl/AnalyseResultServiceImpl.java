package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.AnalyseResultDao;
import org.guce.siat.core.ct.model.AnalyseResult;
import org.guce.siat.core.ct.service.AnalyseResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class AnalyseResultServiceImpl.
 */
@Service("analyseResultService")
@Transactional(readOnly = true)
public class AnalyseResultServiceImpl extends AbstractServiceImpl<AnalyseResult> implements AnalyseResultService
{

	/** The analyse result dao. */
	@Autowired
	private AnalyseResultDao analyseResultDao;

	/**
	 * Instantiates a new analyse result service impl.
	 */
	public AnalyseResultServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<AnalyseResult> getJpaDao()
	{
		return analyseResultDao;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<AnalyseResult> jpaDao)
	{
		this.analyseResultDao = (AnalyseResultDao) jpaDao;
	}

	@Override
	public AnalyseResult findAnalyseResultByItemFlow(final ItemFlow itemFlow)
	{
		return analyseResultDao.findAnalyseResultByItemFlow(itemFlow);
	}

}
