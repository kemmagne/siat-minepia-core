package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.CCTCPParamValue;

/**
 * The Interface CCTCPParamValueDao.
 */
public interface CCTCPParamValueDao extends AbstractJpaDao<CCTCPParamValue> {

    /**
     * Find CCTCPParamValue by item flow.
     *
     * @param itemFlow the item flow
     * @return the CCTCPParamValue
     */
    CCTCPParamValue findCCTCPParamValueByItemFlow(ItemFlow itemFlow);
    
     /**
     * Find Approved Decision by file item.
     *
     * @param fileItem
     * @return the Approved Decision
     */
    CCTCPParamValue findCCTCPParamValueByFileItem(FileItem fileItem);

}
