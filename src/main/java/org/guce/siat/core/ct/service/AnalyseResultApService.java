package org.guce.siat.core.ct.service;

import java.util.List;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.AnalyseResultAp;
import org.guce.siat.core.ct.model.EssayTestAP;


/**
 * The Interface AnalyseResultApService.
 */
public interface AnalyseResultApService extends AbstractService<AnalyseResultAp>
{


	/**
	 * Take acceptation decision and save analyse ap results.
	 *
	 * @param itemFlowsList
	 *           the item flows list
	 * @param itemFlowDatas
	 *           the item flow datas
	 * @param analyseResultAps
	 *           the analyse result aps
	 * @param essayTestAPs
	 *           the essay test a ps
	 */
	void takeAcceptationDecisionAndSaveAnalyseApResults(List<ItemFlow> itemFlowsList, List<ItemFlowData> itemFlowDatas,
			List<AnalyseResultAp> analyseResultAps, List<EssayTestAP> essayTestAPs);

	/**
	 * Find analyse result ap by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the analyse result ap
	 */
	AnalyseResultAp findAnalyseResultApByItemFlow(ItemFlow itemFlow);

}
