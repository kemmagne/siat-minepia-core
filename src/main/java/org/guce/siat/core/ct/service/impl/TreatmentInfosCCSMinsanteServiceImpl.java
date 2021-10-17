package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.TreatmentInfosCCSMinsanteDao;
import org.guce.siat.core.ct.model.TreatmentInfosCCSMinsante;
import org.guce.siat.core.ct.service.TreatmentInfosCCSMinsanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TreatmentInfosCCSMinsanteServiceImpl.
 */
@Service("treatmentInfosCCSMinsanteService")
@Transactional(readOnly = true)
public class TreatmentInfosCCSMinsanteServiceImpl extends AbstractServiceImpl<TreatmentInfosCCSMinsante> implements TreatmentInfosCCSMinsanteService {

    /**
     * The treatment order dao.
     */
    @Autowired
    private TreatmentInfosCCSMinsanteDao treatmentInfosDao;

    /**
     * Instantiates a new treatment order service impl.
     */
    public TreatmentInfosCCSMinsanteServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<TreatmentInfosCCSMinsante> getJpaDao() {
        return treatmentInfosDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<TreatmentInfosCCSMinsante> jpaDao) {
        this.treatmentInfosDao = (TreatmentInfosCCSMinsanteDao) jpaDao;

    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.TreatmentInfosCCSMinsante#findTreatmentInfosByItemFlow(org.guce.siat.common.model.ItemFlow
	 * )
     */
    @Override
    public TreatmentInfosCCSMinsante findTreatmentInfosByItemFlow(final ItemFlow itemFlow) {
        return treatmentInfosDao.findTreatmentInfosByItemFlow(itemFlow);

    }


    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.TreatmentInfosCCSMinsanteService#findTreatmentInfosByFileItem(org.guce.siat.common.model.FileItem
	 * )
     */
    @Override
    public TreatmentInfosCCSMinsante findTreatmentInfosByFileItem(final FileItem fileItem) {
        return treatmentInfosDao.findTreatmentInfosByFileItem(fileItem);
    }

}
