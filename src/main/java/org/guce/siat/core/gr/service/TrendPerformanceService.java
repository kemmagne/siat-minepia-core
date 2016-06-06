package org.guce.siat.core.gr.service;

import java.util.List;

import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.common.utils.filter.AuditFilter;
import org.guce.siat.core.gr.model.TrendPerformance;




/**
 * The Interface TrendPerformanceService.
 */
public interface TrendPerformanceService extends AbstractService<TrendPerformance>
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
