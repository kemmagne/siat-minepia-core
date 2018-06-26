package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.TreatmentInfos;

/**
 * The Interface TreatmentOrderDao.
 */
public interface TreatmentInfosDao extends AbstractJpaDao<TreatmentInfos> {

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
