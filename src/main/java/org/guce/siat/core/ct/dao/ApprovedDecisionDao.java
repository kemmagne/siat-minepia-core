package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.ApprovedDecision;

/**
 * The Interface ApprovedDecisionDao.
 */
public interface ApprovedDecisionDao extends AbstractJpaDao<ApprovedDecision> {

    /**
     * Find ApprovedDecision by item flow.
     *
     * @param itemFlow the item flow
     * @return the ApprovedDecision
     */
    ApprovedDecision findApprovedDecisionByItemFlow(ItemFlow itemFlow);
    
     /**
     * Find Approved Decision by file item.
     *
     * @param fileItem
     * @return the Approved Decision
     */
    ApprovedDecision findApprovedDecisionByFileItem(FileItem fileItem);

}
