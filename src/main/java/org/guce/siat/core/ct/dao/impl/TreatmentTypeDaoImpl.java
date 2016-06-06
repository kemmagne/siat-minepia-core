/**
 *
 */
package org.guce.siat.core.ct.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Organism;
import org.guce.siat.core.ct.dao.TreatmentTypeDao;
import org.guce.siat.core.ct.model.TreatmentType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class TreatmentTypeDaoImpl.
 */
@Repository("treatmentTypeDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentTypeDaoImpl extends AbstractJpaDaoImpl<TreatmentType> implements TreatmentTypeDao
{

	/**
	 * Instantiates a new treatment type dao impl.
	 */
	public TreatmentTypeDaoImpl()
	{
		super();
		setClasse(TreatmentType.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.dao.TreatmentTypeDao#findByOrganisme(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<TreatmentType> findByOrganism(final Organism organism)
	{

		if (organism != null)
		{
			final String hqlString = "SELECT t FROM TreatmentType t WHERE t.organism.id = :organismId AND t.deleted = false";
			final TypedQuery<TreatmentType> query = super.entityManager.createQuery(hqlString, TreatmentType.class);
			query.setParameter("organismId", organism.getId());
			return query.getResultList();
		}
		return Collections.emptyList();
	}
}
