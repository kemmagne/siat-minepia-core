package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.TreatmentOrder;


/**
 * The Interface TreatmentOrderDao.
 */
public interface TreatmentOrderDao extends AbstractJpaDao<TreatmentOrder>
{

	/**
	 * Find treatment order by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the treatment order
	 */
	TreatmentOrder findTreatmentOrderByItemFlow(ItemFlow itemFlow);
}
