package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.AnalyseOrder;




/**
 * The Interface AnalysePartDao.
 */
public interface AnalyseOrderDao extends AbstractJpaDao<AnalyseOrder>
{

	/**
	 * Find by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the analyse order
	 */
	AnalyseOrder findByItemFlow(ItemFlow itemFlow);
}
