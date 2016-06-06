package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.EssayTestAP;


/**
 * The Interface EssayTestApService.
 */
public interface EssayTestApService extends AbstractService<EssayTestAP>
{

	/**
	 * Find by item flow.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @return the essay test ap
	 */
	EssayTestAP findByItemFlow(ItemFlow itemFlow);

}
