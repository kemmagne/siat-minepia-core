package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.TreatmentResult;


/**
 * The Interface AanalyseResultDao.
 */
public interface TreatmentResultDao extends AbstractJpaDao<TreatmentResult>
{

	/**
	 * Find treatment result by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the treatment result
	 */
	TreatmentResult findTreatmentResultByItemFlow(ItemFlow itemFlow);
}
