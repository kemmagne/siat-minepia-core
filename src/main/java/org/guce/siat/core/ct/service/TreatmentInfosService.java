package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentInfos;

/**
 * The Interface TreatmentOrderService.
 */
public interface TreatmentInfosService extends AbstractService<TreatmentInfos> {

    /**
     * Find treatment order by item flow.
     *
     * @param itemFlow the item flow
     * @return the treatment order
     */
    TreatmentInfos findTreatmentInfosByItemFlow(ItemFlow itemFlow);

}

