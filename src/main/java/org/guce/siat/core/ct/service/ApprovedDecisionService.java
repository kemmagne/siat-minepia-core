package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.ApprovedDecision;

/**
 * The Interface ApprovedDecisionService.
 */
public interface ApprovedDecisionService extends AbstractService<ApprovedDecision> {

    /**
     * Find ApprovedDecision by item flow.
     *
     * @param itemFlow the item flow
     * @return the Approved Decisions
     */
    ApprovedDecision findApprovedDecisionByItemFlow(ItemFlow itemFlow);

    /**
     * Find ApprovedDecision by file item.
     *
     * @param fileItem
     * @return the Approved Decisions
     */
    ApprovedDecision findApprovedDecisionByFileItem(FileItem fileItem);

}
