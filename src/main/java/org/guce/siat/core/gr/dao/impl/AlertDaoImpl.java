/**
 *
 */
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
import org.guce.siat.core.gr.dao.AlertDao;
import org.guce.siat.core.gr.model.Alert;
import org.guce.siat.core.gr.utils.filter.AlertFilter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AlertDaoImpl.
 */
@Repository("alertDao")
@Transactional(propagation = Propagation.REQUIRED)
public class AlertDaoImpl extends AbstractJpaDaoImpl<Alert> implements AlertDao
{

	/**
	 * Instantiates a new alert dao impl.
	 */
	public AlertDaoImpl()
	{
		super();
		setClasse(Alert.class);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.AlertDao#findByFilter(org.guce.siat.core.gr.utils.filter.AlertFilter)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Alert> findByFilter(final AlertFilter filter)
	{
		if (filter != null)
		{
			final Map<String, Object> params = new HashMap<String, Object>();

			final StringBuilder queryString = new StringBuilder();

			Boolean firstConditionAdded = false;
			queryString.append("SELECT * FROM Alert ");

			if (filter.getBeginDate() != null && filter.getEndDate() == null)
			{
				if (!firstConditionAdded)
				{
					queryString.append(" WHERE startDate >= TO_DATE(:beginDate,'");
					queryString.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					queryString.append("')");
					firstConditionAdded = true;
				}
				else
				{
					queryString.append(" AND startDate >= TO_DATE(:beginDate,'");
					queryString.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					queryString.append("')");
				}
				params.put("beginDate", DateUtils.formatSimpleDateForOracle(filter.getBeginDate()));
			}

			if (filter.getBeginDate() == null && filter.getEndDate() != null)
			{
				if (!firstConditionAdded)
				{
					queryString.append(" WHERE endDate <:endDate");
					firstConditionAdded = true;
				}
				else
				{
					queryString.append(" AND endDate <:endDate");

				}
				params.put("endDate", DateUtils.addDays(filter.getEndDate(), 1));
			}
			if (filter.getBeginDate() != null && filter.getEndDate() != null)
			{
				if (!firstConditionAdded)
				{
					queryString.append(" WHERE startDate >= :beginDate");
					queryString.append(" AND endDate :endDate");

					firstConditionAdded = true;
				}
				else
				{
					queryString.append(" AND startDate >= :beginDate");
					queryString.append(" AND endDate <:endDate");
					firstConditionAdded = true;
				}
				params.put("beginDate", DateUtils.formatSimpleDateForOracle(filter.getBeginDate()));
				params.put("endDate", DateUtils.addDays(filter.getEndDate(), 1));
			}

			final Query query = super.entityManager.createNativeQuery(queryString.toString(), Alert.class);

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
	 * @see org.guce.siat.core.gr.dao.AlertDao#findAlertForRiskManagment(org.guce.siat.common.model.FileItem,
	 * java.util.Map)
	 */
	@Override
	public List<Alert> findAlertForRiskManagment(final FileItem fileItem,
			final Map<String, FileItemFieldValue> fileItemFieldValuesMap)
	{
		if (fileItem != null && fileItem.getSubfamily() != null)
		{
			final Map<String, Object> params = new HashMap<String, Object>();
			final StringBuilder hqlBuilder = new StringBuilder();

			hqlBuilder.append("SELECT a FROM Alert a WHERE (a.servicesItem.id =:serviceItemId  ");

			if (fileItemFieldValuesMap != null)
			{
				if (fileItemFieldValuesMap.get(Constants.PAYS_ORIGINE_CODE) != null)
				{
					hqlBuilder.append("OR a.countryId =:countryId ");
					params.put("countryId", fileItemFieldValuesMap.get(Constants.PAYS_ORIGINE_CODE).getValue());
				}

				if (fileItemFieldValuesMap.get(Constants.MARQUE) != null)
				{
					hqlBuilder.append("OR a.brand =:brand ");
					params.put("brand", fileItemFieldValuesMap.get(Constants.MARQUE).getValue());
				}

				if (fileItemFieldValuesMap.get(Constants.FABRICANT) != null)
				{
					hqlBuilder.append("OR a.manufacturer =:manufacturer ");
					params.put("manufacturer", fileItemFieldValuesMap.get(Constants.FABRICANT).getValue());
				}

				if (fileItemFieldValuesMap.get(Constants.MODELE) != null)
				{
					hqlBuilder.append("OR a.model =:model ");
					params.put("model", fileItemFieldValuesMap.get(Constants.MODELE).getValue());
				}
			}
			hqlBuilder.append(") AND ");
			hqlBuilder.append("(a.startDate <= TO_DATE(:startDate,'");
			hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD);
			hqlBuilder.append("') AND a.endDate >= ");
			hqlBuilder.append(" TO_DATE(:endDate,'");
			hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD);
			hqlBuilder.append("')) ");

			final TypedQuery<Alert> query = super.entityManager.createQuery(hqlBuilder.toString(), Alert.class);

			params.put("serviceItemId", fileItem.getSubfamily().getId());
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.dao.AlertDao#findByOrganism(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<Alert> findByOrganism(Organism organism)
	{
		if (organism != null)
		{
			TypedQuery<Alert> query = entityManager.createQuery(
					"SELECT a FROM Alert a WHERE a.servicesItem.service.subDepartment.organism= :organism", Alert.class);
			query.setParameter("organism", organism);
			return query.getResultList();
		}
		return Collections.emptyList();
	}
}
