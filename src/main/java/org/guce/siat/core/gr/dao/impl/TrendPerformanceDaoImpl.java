/**
 *
 */
package org.guce.siat.core.gr.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.DateUtils;
import org.guce.siat.common.utils.filter.AuditFilter;
import org.guce.siat.core.gr.dao.TrendPerformanceDao;
import org.guce.siat.core.gr.model.TrendPerformance;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * The Class TrendPerformanceDaoImpl.
 */
@Repository("trendPerformanceDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TrendPerformanceDaoImpl extends AbstractJpaDaoImpl<TrendPerformance> implements TrendPerformanceDao
{
	/**
	 * Instantiates a new trend performance dao impl.
	 */
	public TrendPerformanceDaoImpl()
	{
		super();
		setClasse(TrendPerformance.class);
	}





	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.dao.TrendPerformanceDao#findTrendPerformanceByUsers(java.util.List,
	 * org.guce.siat.common.utils.filter.AuditFilter)
	 */
	@Override
	public List<TrendPerformance> findTrendPerformanceByUsers(final List<User> users, final AuditFilter filter)
	{
		if (users != null)
		{

			final List<Long> userIds = new ArrayList<Long>();
			for (final User user : users)
			{
				userIds.add(user.getId());
			}

			final Map<String, Object> params = new HashMap<String, Object>();

			final StringBuilder hqlBuilder = new StringBuilder();

			hqlBuilder.append("SELECT t FROM TrendPerformance t ");

			hqlBuilder.append("WHERE t.user.id IN (:userIds) ");

			if (filter != null)
			{

				if (filter.getBeginDate() != null && filter.getEndDate() == null)
				{
					hqlBuilder.append(" AND t.itemFlow.created >= TO_DATE(:createdDate,'");
					hqlBuilder.append(DateUtils.PATTERN_YYYY_MM_DD_HH24_MI_SS);
					hqlBuilder.append("')");
					params.put("createdDate", DateUtils.formatSimpleDateForOracle(filter.getBeginDate()));
				}

				if (filter.getBeginDate() == null && filter.getEndDate() != null)
				{
					hqlBuilder.append(" AND t.itemFlow.created <:createDate");
					params.put("createDate",DateUtils.addDays(filter.getEndDate(),1));
				}

				if (filter.getBeginDate() != null && filter.getEndDate() != null)
				{
					hqlBuilder.append(" AND t.itemFlow.created >= :fromDate");
					hqlBuilder.append(" AND t.itemFlow.created <:toDate");
		
					params.put("fromDate", filter.getBeginDate());
					params.put("toDate", DateUtils.addDays(filter.getEndDate(),1));
				}
			}
			final TypedQuery<TrendPerformance> query = super.entityManager
					.createQuery(hqlBuilder.toString(), TrendPerformance.class);

			params.put("userIds", userIds);

			for (final Entry<String, Object> entry : params.entrySet())
			{
				query.setParameter(entry.getKey(), entry.getValue());
			}

			return query.getResultList();
		}
		return Collections.emptyList();
	}
}
