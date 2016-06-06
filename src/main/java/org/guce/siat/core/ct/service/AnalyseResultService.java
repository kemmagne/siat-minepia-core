package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.AnalyseResult;


/**
 * The Interface AnalyseResultService.
 */
public interface AnalyseResultService extends AbstractService<AnalyseResult>
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
