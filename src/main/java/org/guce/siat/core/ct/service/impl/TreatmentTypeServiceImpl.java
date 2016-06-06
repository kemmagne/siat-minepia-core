/**
 *
 */
package org.guce.siat.core.ct.service.impl;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.TreatmentTypeDao;
import org.guce.siat.core.ct.model.TreatmentType;
import org.guce.siat.core.ct.service.TreatmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class TreatmentTypeServiceImpl.
 */
@Service("treatmentTypeService")
@Transactional(readOnly = true)
public class TreatmentTypeServiceImpl extends AbstractServiceImpl<TreatmentType> implements TreatmentTypeService
{


	/** The treatment type dao. */
	@Autowired
	private TreatmentTypeDao treatmentTypeDao;

	/**
	 * Instantiates a new treatment type service impl.
	 */
	public TreatmentTypeServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.TreatmentTypeService#findByOrganisme(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<TreatmentType> findByOrganism(final Organism currentOrganism)
	{
		return treatmentTypeDao.findByOrganism(currentOrganism);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<TreatmentType> getJpaDao()
	{
		return treatmentTypeDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<TreatmentType> jpaDao)
	{
		this.treatmentTypeDao = (TreatmentTypeDao) jpaDao;
	}

}
