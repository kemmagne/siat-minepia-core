package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.AnalyseResultAp;


/**
 * The Interface AnalyseResultApDao.
 */
public interface AnalyseResultApDao extends AbstractJpaDao<AnalyseResultAp>
{

	/**
	 * Find analyse result ap by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the analyse result ap
	 */
	AnalyseResultAp findAnalyseResultApByItemFlow(ItemFlow itemFlow);
}
