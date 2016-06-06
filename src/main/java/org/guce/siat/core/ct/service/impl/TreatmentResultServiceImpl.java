package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.TreatmentResultDao;
import org.guce.siat.core.ct.model.TreatmentResult;
import org.guce.siat.core.ct.service.TreatmentResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class AnalyseResultServiceImpl.
 */
@Service("treatmentResultService")
@Transactional(readOnly = true)
@PropertySources(value = @PropertySource("classpath:siat-jms.properties"))
public class TreatmentResultServiceImpl extends AbstractServiceImpl<TreatmentResult> implements TreatmentResultService
{

	/** The treatment result dao. */
	@Autowired
	private TreatmentResultDao treatmentResultDao;

	/**
	 * Instantiates a new analyse result service impl.
	 */
	public TreatmentResultServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<TreatmentResult> getJpaDao()
	{
		return treatmentResultDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<TreatmentResult> jpaDao)
	{
		this.treatmentResultDao = (TreatmentResultDao) jpaDao;
	}

	@Override
	public TreatmentResult findTreatmentResultByItemFlow(final ItemFlow itemFlow)
	{
		return treatmentResultDao.findTreatmentResultByItemFlow(itemFlow);
	}

}
