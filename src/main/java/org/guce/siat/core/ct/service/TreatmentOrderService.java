package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentOrder;


/**
 * The Interface TreatmentOrderService.
 */
public interface TreatmentOrderService extends AbstractService<TreatmentOrder>
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
