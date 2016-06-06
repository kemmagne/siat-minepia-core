package org.guce.siat.core.ct.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.TypedQuery;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.ct.dao.TreatmentCompanyDao;
import org.guce.siat.core.ct.model.TreatmentCompany;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class TreatmentCompanyDaoImpl.
 */
@Repository("treatmentCompanyDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentCompanyDaoImpl extends AbstractJpaDaoImpl<TreatmentCompany> implements TreatmentCompanyDao
{

	/**
	 * Instantiates a new treatment company dao impl.
	 */
	public TreatmentCompanyDaoImpl()
	{
		super();
		setClasse(TreatmentCompany.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.dao.TreatmentCompanyDao#findByOrganisme(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<TreatmentCompany> findByOrganisme(final Organism organism)
	{
		if (organism != null)
		{
			final String hqlString = "SELECT t FROM TreatmentCompany t WHERE t.service.subDepartment.organism.id= :organismId AND t.deleted = 0";
			final TypedQuery<TreatmentCompany> query = super.entityManager.createQuery(hqlString, TreatmentCompany.class);
			query.setParameter("organismId", organism.getId());
			return query.getResultList();
		}
		return Collections.emptyList();
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.LaboratoryDao#findByAdministration(java.util.List)
	 */
	@Override
	public List<TreatmentCompany> findByAdministration(final List<Long> services)
	{
		if (!CollectionUtils.isEmpty(services))
		{
			final String hql = "SELECT t FROM TreatmentCompany t WHERE t.service.id IN (:servicesIds) AND t.deleted = false";
			final TypedQuery<TreatmentCompany> query = super.entityManager.createQuery(hql, TreatmentCompany.class);
			query.setParameter("servicesIds", services);
			return query.getResultList();
		}
		return Collections.emptyList();
	}
}
