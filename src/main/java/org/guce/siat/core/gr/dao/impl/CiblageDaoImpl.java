package org.guce.siat.core.gr.dao.impl;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemFieldValue;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.core.gr.dao.CiblageDao;
import org.guce.siat.core.gr.model.Ciblage;
import org.guce.siat.core.gr.utils.filter.CiblageFilter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class CiblageDaoImpl.
 */
@Repository("ciblageDao")
@Transactional(propagation = Propagation.REQUIRED)
public class CiblageDaoImpl extends AbstractJpaDaoImpl<Ciblage> implements CiblageDao
{

	/**
	 * Instantiates a new ciblage dao impl.
	 */
	public CiblageDaoImpl()
	{
		super();
		setClasse(Ciblage.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.CiblageDao#findByFilter(org.guce.siat.core.gr.utils.filter.CiblageFilter)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Ciblage> findByFilter(final CiblageFilter filter)
	{
		if (filter != null)
		{
			final Map<String, Object> params = new HashMap<String, Object>();

			final StringBuilder sqlBuilder = new StringBuilder();

			Boolean firstConditionAdded = false;
			sqlBuilder.append("SELECT * FROM CIBLAGE ");

			if (filter.getBeginDate() != null && filter.getEndDate() == null)
			{
				if (!firstConditionAdded)
				{
					sqlBuilder.append(" WHERE startDate >= TO_DATE(:beginDate,'");
					sqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					sqlBuilder.append("')");
					firstConditionAdded = true;
				}
				else
				{
					sqlBuilder.append(" AND startDate >= TO_DATE(:beginDate,'");
					sqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					sqlBuilder.append("')");

				}
				params.put("beginDate", DateUtils.formatSimpleDateForOracle(filter.getBeginDate()));
			}

			if (filter.getBeginDate() == null && filter.getEndDate() != null)
			{
				if (!firstConditionAdded)
				{
					sqlBuilder.append(" WHERE endDate < :endDate");
					firstConditionAdded = true;
				}
				else
				{
					sqlBuilder.append(" AND endDate <:endDate");
				}
				params.put("endDate", DateUtils.addDays(filter.getEndDate(), 1));
			}
			if (filter.getBeginDate() != null && filter.getEndDate() != null)
			{
				if (!firstConditionAdded)
				{
					sqlBuilder.append(" WHERE startDate >= :beginDate");
					sqlBuilder.append(" AND endDate <:endDate");
					firstConditionAdded = true;
				}
				else
				{
					sqlBuilder.append(" AND startDate >= :beginDate");
					sqlBuilder.append(" AND endDate <:endDate");
					firstConditionAdded = true;
				}
				params.put("beginDate", filter.getBeginDate());
				params.put("endDate", DateUtils.addDays(filter.getEndDate(), 1));
			}

			final Query query = super.entityManager.createNativeQuery(sqlBuilder.toString(), Ciblage.class);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();

		}

		return Collections.emptyList();


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.CiblageDao#findCiblageforRiskManagment(org.guce.siat.common.model.FileItem,
	 * java.util.Map)
	 */
	@Override
	public List<Ciblage> findCiblageforRiskManagment(final FileItem fileItem,
			final Map<String, FileItemFieldValue> fileItemFieldValuesMap)
	{
		if (fileItem != null && fileItem.getSubfamily() != null)
		{
			final Map<String, Object> params = new HashMap<String, Object>();
			final StringBuilder hqlBuilder = new StringBuilder();

			hqlBuilder.append("SELECT c FROM Ciblage c WHERE (c.servicesItem.id = :serviceItemId  ");

			if (fileItemFieldValuesMap != null)
			{
				if (fileItemFieldValuesMap.get(Constants.PAYS_ORIGINE_CODE) != null)
				{
					hqlBuilder.append("OR c.countryId = :countryId ");
					params.put("countryId", fileItemFieldValuesMap.get(Constants.PAYS_ORIGINE_CODE).getValue());
				}

				if (fileItemFieldValuesMap.get(Constants.MARQUE) != null)
				{
					hqlBuilder.append("OR c.brand = :brand ");
					params.put("brand", fileItemFieldValuesMap.get(Constants.MARQUE).getValue());
				}

				if (fileItemFieldValuesMap.get(Constants.FABRICANT) != null)
				{
					hqlBuilder.append("OR c.manufacturer = :manufacturer ");
					params.put("manufacturer", fileItemFieldValuesMap.get(Constants.FABRICANT).getValue());
				}

				if (fileItemFieldValuesMap.get(Constants.MODELE) != null)
				{
					hqlBuilder.append("OR c.model = :model ");
					params.put("model", fileItemFieldValuesMap.get(Constants.MODELE).getValue());
				}

			}
			hqlBuilder.append("OR c.company.id = :company ");
			hqlBuilder.append("OR c.servicesItem.nsh = :nsh ");
			hqlBuilder.append(") AND ");
			hqlBuilder.append("(c.startDate <= TO_DATE(:startDate,'");
			hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD);
			hqlBuilder.append("') AND c.endDate >= ");
			hqlBuilder.append(" TO_DATE(:endDate,'");
			hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD);
			hqlBuilder.append("')) ");

			final TypedQuery<Ciblage> query = super.entityManager.createQuery(hqlBuilder.toString(), Ciblage.class);

			params.put("serviceItemId", fileItem.getSubfamily().getId());
			params.put("company", fileItem.getFile().getClient().getId());
			params.put("nsh", fileItem.getSubfamily().getNsh());
			params.put("startDate", DateUtils.formatSimpleDate(new Date()));
			params.put("endDate", DateUtils.formatSimpleDate(new Date()));

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}
			return query.getResultList();
		}

		return Collections.emptyList();
	}

	/* (non-Javadoc)
	 * @see org.guce.siat.core.gr.dao.CiblageDao#findByOrganism(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<Ciblage> findByOrganism(Organism organism)
	{
		if(organism != null){
			TypedQuery<Ciblage> query=entityManager.createQuery("SELECT c FROM Ciblage c WHERE c.organism= :organism",Ciblage.class);
			query.setParameter("organism", organism);
			return query.getResultList();
		}
		return Collections.emptyList();
	}
}
