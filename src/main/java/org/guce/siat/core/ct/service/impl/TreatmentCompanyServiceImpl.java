package org.guce.siat.core.ct.service.impl;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.TreatmentCompanyDao;
import org.guce.siat.core.ct.model.TreatmentCompany;
import org.guce.siat.core.ct.service.TreatmentCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class TreatmentCompanyServiceImpl.
 */
@Service("treatmentCompanyService")
@Transactional(readOnly = true)
public class TreatmentCompanyServiceImpl extends AbstractServiceImpl<TreatmentCompany> implements TreatmentCompanyService
{

	/** The treatment company dao. */
	@Autowired
	private TreatmentCompanyDao treatmentCompanyDao;

	/**
	 * Instantiates a new treatment company service impl.
	 */
	public TreatmentCompanyServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TreatmentCompanyService#findByOrganisme(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<TreatmentCompany> findByOrganism(final Organism organism)
	{
		return treatmentCompanyDao.findByOrganisme(organism);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<TreatmentCompany> getJpaDao()
	{
		return treatmentCompanyDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<TreatmentCompany> jpaDao)
	{
		this.treatmentCompanyDao = (TreatmentCompanyDao) jpaDao;

	}

	/* (non-Javadoc)
	 * @see org.guce.siat.core.ct.service.TreatmentCompanyService#findByAdministration(java.util.List)
	 */
	@Override
	public List<TreatmentCompany> findByAdministration(List<Long> servicesIds) {
		
		return treatmentCompanyDao.findByAdministration(servicesIds);
	}
}
