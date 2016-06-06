/**
 *
 */
package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.AnalysePartDao;
import org.guce.siat.core.ct.model.AnalysePart;
import org.guce.siat.core.ct.service.AnalysePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class AnalysePartServiceImpl.
 */
@Service("analysePartService")
@Transactional(readOnly = true)
public class AnalysePartServiceImpl extends AbstractServiceImpl<AnalysePart> implements AnalysePartService
{


	/** The analyse part dao. */
	@Autowired
	private AnalysePartDao analysePartDao;


	/**
	 * Instantiates a new analyse part service impl.
	 */
	public AnalysePartServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<AnalysePart> getJpaDao()
	{
		return analysePartDao;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<AnalysePart> jpaDao)
	{
		this.analysePartDao = (AnalysePartDao) jpaDao;
	}

}
