package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.AnalyseResult;


/**
 * The Interface AanalyseResultDao.
 */
public interface AnalyseResultDao extends AbstractJpaDao<AnalyseResult>
{

	/**
	 * Find analyse result by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the analyse result
	 */
	AnalyseResult findAnalyseResultByItemFlow(ItemFlow itemFlow);
}
