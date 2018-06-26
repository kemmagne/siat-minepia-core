package org.guce.siat.core.ct.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.dao.ItemFlowDataDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.ItemFlowData;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.AnalyseResultApDao;
import org.guce.siat.core.ct.dao.EssayTestAPDao;
import org.guce.siat.core.ct.model.AnalyseResultAp;
import org.guce.siat.core.ct.model.EssayTestAP;
import org.guce.siat.core.ct.service.AnalyseResultApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class AnalyseResultApServiceImpl.
 */
@Service("analyseResultApService")
@Transactional(readOnly = true)
public class AnalyseResultApServiceImpl extends AbstractServiceImpl<AnalyseResultAp> implements AnalyseResultApService {

    /**
     * The analyse result ap dao.
     */
    @Autowired
    private AnalyseResultApDao analyseResultApDao;

    /**
     * The item flow dao.
     */
    @Autowired
    private ItemFlowDao itemFlowDao;

    /**
     * The item flow data dao.
     */
    @Autowired
    private ItemFlowDataDao itemFlowDataDao;

    /**
     * The essay test ap dao.
     */
    @Autowired
    private EssayTestAPDao essayTestAPDao;

    /**
     * The file item dao.
     */
    @Autowired
    private FileItemDao fileItemDao;

    /**
     * Instantiates a new analyse result ap service impl.
     */
    public AnalyseResultApServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.AnalyseResultApService#takeAcceptationDecisionAndSaveAnalyseApResults(java.util.
	 * List, java.util.List, java.util.List, java.util.List)
     */
    @Override
    public void takeAcceptationDecisionAndSaveAnalyseApResults(final List<ItemFlow> itemFlowsList,
            final List<ItemFlowData> itemFlowDatas, final List<AnalyseResultAp> analyseResultAps,
            final List<EssayTestAP> essayTestAPs) {

        final List<FileItem> fileItemList = new ArrayList<FileItem>();

        for (final ItemFlow itemFlow : itemFlowsList) {
            final ItemFlow item = itemFlowDao.save(itemFlow);
            for (final ItemFlowData flowData : itemFlowDatas) {
                final ItemFlowData itemFlowData = new ItemFlowData();
                itemFlowData.setDataType(flowData.getDataType());
                itemFlowData.setValue(flowData.getValue());
                itemFlowData.setItemFlow(item);
                itemFlowDataDao.save(itemFlowData);
            }

            // Set draft = true to be updated
            itemFlow.getFileItem().setDraft(Boolean.TRUE);
            fileItemList.add(itemFlow.getFileItem());
        }

        // Update fileItems : Set draft = true
        fileItemDao.saveOrUpdateList(fileItemList);

        for (final EssayTestAP essayTestAP : essayTestAPs) {
            essayTestAPDao.save(essayTestAP);
        }
        if (CollectionUtils.isNotEmpty(analyseResultAps)) {
            for (final AnalyseResultAp analyseResultAp : analyseResultAps) {
                analyseResultApDao.save(analyseResultAp);
            }
        }
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<AnalyseResultAp> getJpaDao() {
        return analyseResultApDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<AnalyseResultAp> jpaDao) {
        this.analyseResultApDao = (AnalyseResultApDao) jpaDao;
    }

    /**
     * Sets the item flow dao.
     *
     * @param itemFlowDao the new item flow dao
     */
    public void setItemFlowDao(final ItemFlowDao itemFlowDao) {
        this.itemFlowDao = itemFlowDao;
    }

    /**
     * Sets the item flow data dao.
     *
     * @param itemFlowDataDao the new item flow data dao
     */
    public void setItemFlowDataDao(final ItemFlowDataDao itemFlowDataDao) {
        this.itemFlowDataDao = itemFlowDataDao;
    }

    /**
     * Sets the essay test ap dao.
     *
     * @param essayTestAPDao the new essay test ap dao
     */
    public void setEssayTestAPDao(final EssayTestAPDao essayTestAPDao) {
        this.essayTestAPDao = essayTestAPDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.AnalyseResultApService#findAnalyseResultApByItemFlow(org.guce.siat.common.model.
	 * ItemFlow)
     */
    @Override
    public AnalyseResultAp findAnalyseResultApByItemFlow(final ItemFlow itemFlow) {
        return analyseResultApDao.findAnalyseResultApByItemFlow(itemFlow);
    }

}
