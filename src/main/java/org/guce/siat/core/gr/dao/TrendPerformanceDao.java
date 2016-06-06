package org.guce.siat.core.gr.dao;

import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.User;
import org.guce.siat.common.utils.filter.AuditFilter;
import org.guce.siat.core.gr.model.TrendPerformance;





/**
 * The Interface TrendPerformanceDao.
 */
public interface TrendPerformanceDao extends AbstractJpaDao<TrendPerformance>
{




	/**
	 * Find trend performance by users.
	 *
	 * @param users
	 *           the users
	 * @param filter
	 *           the filter
	 * @return the list
	 */
	List<TrendPerformance> findTrendPerformanceByUsers(List<User> users, AuditFilter filter);


}
