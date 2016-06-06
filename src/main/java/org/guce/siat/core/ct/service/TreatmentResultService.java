package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentResult;


/**
 * The Interface AnalyseResultService.
 */
public interface TreatmentResultService extends AbstractService<TreatmentResult>
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
