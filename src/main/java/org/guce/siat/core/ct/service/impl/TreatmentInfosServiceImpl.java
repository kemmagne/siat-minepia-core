package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.TreatmentInfosDao;
import org.guce.siat.core.ct.model.TreatmentInfos;
import org.guce.siat.core.ct.service.TreatmentInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TreatmentOrderServiceImpl.
 */
@Service("treatmentInfosService")
@Transactional(readOnly = true)
public class TreatmentInfosServiceImpl extends AbstractServiceImpl<TreatmentInfos> implements TreatmentInfosService {

    /**
     * The treatment order dao.
     */
    @Autowired
    private TreatmentInfosDao treatmentInfosDao;

    /**
     * Instantiates a new treatment order service impl.
     */
    public TreatmentInfosServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<TreatmentInfos> getJpaDao() {
        return treatmentInfosDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<TreatmentInfos> jpaDao) {
        this.treatmentInfosDao = (TreatmentInfosDao) jpaDao;

    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.TreatmentInfosService#findTreatmentInfosByItemFlow(org.guce.siat.common.model.ItemFlow
	 * )
     */
    @Override
    public TreatmentInfos findTreatmentInfosByItemFlow(final ItemFlow itemFlow) {
        return treatmentInfosDao.findTreatmentInfosByItemFlow(itemFlow);

    }

}

