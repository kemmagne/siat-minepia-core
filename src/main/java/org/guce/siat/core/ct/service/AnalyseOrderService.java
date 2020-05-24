package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.AnalyseOrder;

/**
 * The Interface AnalyseOrderService.
 */
public interface AnalyseOrderService extends AbstractService<AnalyseOrder> {

    /**
     * Find by item flows.
     *
     * @param itemFlow the item flow
     * @return the analyse order
     */
    AnalyseOrder findByItemFlow(ItemFlow itemFlow);

}
