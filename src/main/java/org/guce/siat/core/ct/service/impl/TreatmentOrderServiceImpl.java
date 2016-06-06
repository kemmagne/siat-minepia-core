package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.TreatmentOrderDao;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.guce.siat.core.ct.service.TreatmentOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class TreatmentOrderServiceImpl.
 */
@Service("treatmentOrderService")
@Transactional(readOnly = true)
public class TreatmentOrderServiceImpl extends AbstractServiceImpl<TreatmentOrder> implements TreatmentOrderService
{

	/** The treatment order dao. */
	@Autowired
	private TreatmentOrderDao treatmentOrderDao;

	/**
	 * Instantiates a new treatment order service impl.
	 */
	public TreatmentOrderServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<TreatmentOrder> getJpaDao()
	{
		return treatmentOrderDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<TreatmentOrder> jpaDao)
	{
		this.treatmentOrderDao = (TreatmentOrderDao) jpaDao;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.guce.siat.core.ct.service.TreatmentOrderService#findTreatmentOrderByItemFlow(org.guce.siat.common.model.ItemFlow
	 * )
	 */
	@Override
	public TreatmentOrder findTreatmentOrderByItemFlow(final ItemFlow itemFlow)
	{
		return treatmentOrderDao.findTreatmentOrderByItemFlow(itemFlow);

	}

}
