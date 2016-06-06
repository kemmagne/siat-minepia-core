/**
 *
 */
package org.guce.siat.core.ct.service.impl;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.LaboratoryDao;
import org.guce.siat.core.ct.model.Laboratory;
import org.guce.siat.core.ct.service.LaboratoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class LaboratoryServiceImpl.
 */
@Service("laboratoryService")
@Transactional(readOnly = true)
public class LaboratoryServiceImpl extends AbstractServiceImpl<Laboratory> implements LaboratoryService
{

	/** The laboratory dao. */
	@Autowired
	private LaboratoryDao laboratoryDao;

	/**
	 * Instantiates a new laboratory service impl.
	 */
	public LaboratoryServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<Laboratory> getJpaDao()
	{
		return laboratoryDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<Laboratory> jpaDao)
	{
		this.laboratoryDao = (LaboratoryDao) jpaDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.service.LaboratoryService#findByOrganism(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<Laboratory> findByOrganism(final Organism organism)
	{
		return laboratoryDao.findByOrganism(organism);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.guce.siat.core.ct.service.LaboratoryService#findByAdministration(org.guce.siat.common.model.Administration)
	 */
	@Override
	public List<Laboratory> findByAdministration(final Administration administration)
	{
		return laboratoryDao.findByAdministration(administration);
	}

}
