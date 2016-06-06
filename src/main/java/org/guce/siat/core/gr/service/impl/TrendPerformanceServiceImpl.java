/**
 *
 */
package org.guce.siat.core.gr.service.impl;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.filter.AuditFilter;
import org.guce.siat.core.gr.dao.TrendPerformanceDao;
import org.guce.siat.core.gr.model.TrendPerformance;
import org.guce.siat.core.gr.service.TrendPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class TrendPerformanceServiceImpl.
 */
@Service("trendPerformanceService")
@Transactional(readOnly = true)
public class TrendPerformanceServiceImpl extends AbstractServiceImpl<TrendPerformance> implements TrendPerformanceService
{

	/** The trend performance dao. */
	@Autowired
	private TrendPerformanceDao trendPerformanceDao;



	/**
	 * Instantiates a new trend performance service impl.
	 */
	public TrendPerformanceServiceImpl()
	{
		super();
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<TrendPerformance> getJpaDao()
	{
		return trendPerformanceDao;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<TrendPerformance> jpaDao)
	{
		this.trendPerformanceDao = (TrendPerformanceDao) jpaDao;
	}






	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.TrendPerformanceService#findTrendPerformanceByUsers(java.util.List,
	 * org.guce.siat.common.utils.filter.AuditFilter)
	 */
	@Override
	public List<TrendPerformance> findTrendPerformanceByUsers(final List<User> users, final AuditFilter filter)
	{
		return trendPerformanceDao.findTrendPerformanceByUsers(users, filter);
	}
}
