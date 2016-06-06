/**
 *
 */
package org.guce.siat.core.ct.dao.impl;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.TypedQuery;

import org.apache.commons.collections.map.HashedMap;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Entity;
import org.guce.siat.common.model.Ministry;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.model.SubDepartment;
import org.guce.siat.core.ct.dao.LaboratoryDao;
import org.guce.siat.core.ct.model.Laboratory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class LaboratoryDaoImpl.
 */
@Repository("laboratoryDao")
@Transactional(propagation = Propagation.REQUIRED)
public class LaboratoryDaoImpl extends AbstractJpaDaoImpl<Laboratory> implements LaboratoryDao
{

	/**
	 * Instantiates a new laboratory dao impl.
	 */
	public LaboratoryDaoImpl()
	{
		super();
		setClasse(Laboratory.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.dao.LaboratoryDao#findByOrganisme(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<Laboratory> findByOrganism(final Organism organism)
	{
		if (organism != null)
		{
			final String hqlString = "SELECT l FROM Laboratory l WHERE l.service.subDepartment.organism.id= :organismId AND l.deleted = false";
			final TypedQuery<Laboratory> query = super.entityManager.createQuery(hqlString, Laboratory.class);
			query.setParameter("organismId", organism.getId());
			return query.getResultList();
		}
		return Collections.emptyList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Laboratory> findByAdministration(final Administration administration)
	{
		if (administration != null)
		{
			final StringBuilder hqlQuery = new StringBuilder();

			final Map<String, Object> params = new HashedMap();

			hqlQuery.append("SELECT l FROM Laboratory l WHERE l.deleted = false AND ");

			if (administration instanceof Ministry)
			{
				hqlQuery.append("l.service.subDepartment.organism.ministry.id = :ministryId ");
				params.put("ministryId", administration.getId());
			}
			else if (administration instanceof Organism)
			{
				hqlQuery.append("l.service.subDepartment.organism.id = :organismId ");
				params.put("organismId", administration.getId());
			}
			else if (administration instanceof SubDepartment)
			{
				hqlQuery.append("l.service.subDepartment.id = :subDepartmentId");
				params.put("subDepartmentId", administration.getId());
			}
			else if (administration instanceof Service)
			{
				hqlQuery.append("l.service.id = :serviceId");
				params.put("serviceId", administration.getId());
			}
			else if (administration instanceof Entity)
			{
				hqlQuery.append("l.service.id = :serviceId");
				params.put("serviceId", ((Entity) administration).getService().getId());
			}

			final TypedQuery<Laboratory> query = super.entityManager.createQuery(hqlQuery.toString(), Laboratory.class);

			// Set the parameters into the query
			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}

			return query.getResultList();
		}

		return Collections.emptyList();
	}
}
