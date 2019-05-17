package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentInfos;

/**
 * The Interface TreatmentOrderService.
 */
public interface TreatmentInfosService extends AbstractService<TreatmentInfos> {

    /**
     * Find treatment infos by item flow.
     *
     * @param itemFlow the item flow
     * @return the treatment infos
     */
    TreatmentInfos findTreatmentInfosByItemFlow(ItemFlow itemFlow);

    /**
     * Find treatment infos by file item.
     *
     * @param fileItem
     * @return the treatment infos
     */
    TreatmentInfos findTreatmentInfosByFileItem(FileItem fileItem);

}
