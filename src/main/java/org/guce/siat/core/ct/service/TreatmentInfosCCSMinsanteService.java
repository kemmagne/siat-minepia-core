package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.TreatmentInfosCCSMinsante;

/**
 * The Interface TreatmentInfosCCSMinsanteService.
 */
public interface TreatmentInfosCCSMinsanteService extends AbstractService<TreatmentInfosCCSMinsante> {

    /**
     * Find treatment infos by item flow.
     *
     * @param itemFlow the item flow
     * @return the treatment infos
     */
    TreatmentInfosCCSMinsante findTreatmentInfosByItemFlow(ItemFlow itemFlow);

    /**
     * Find treatment infos by file item.
     *
     * @param fileItem
     * @return the treatment infos
     */
    TreatmentInfosCCSMinsante findTreatmentInfosByFileItem(FileItem fileItem);

}
