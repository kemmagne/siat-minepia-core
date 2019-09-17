package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.CCTCPParamValue;

/**
 * The Interface CCTCPParamValueService.
 */
public interface CCTCPParamValueService extends AbstractService<CCTCPParamValue> {

    /**
     * Find CCTCPParamValue by item flow.
     *
     * @param itemFlow the item flow
     * @return the Approved Decisions
     */
    CCTCPParamValue findCCTCPParamValueByItemFlow(ItemFlow itemFlow);

    /**
     * Find CCTCPParamValue by file item.
     *
     * @param fileItem
     * @return the Approved Decisions
     */
    CCTCPParamValue findCCTCPParamValueByFileItem(FileItem fileItem);

}
