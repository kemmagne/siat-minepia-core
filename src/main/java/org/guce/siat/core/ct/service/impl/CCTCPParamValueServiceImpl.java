package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.CCTCPParamValueDao;
import org.guce.siat.core.ct.model.CCTCPParamValue;
import org.guce.siat.core.ct.service.CCTCPParamValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class CCTCPParamValueServiceImpl.
 */
@Service("cCTCPParamValueService")
@Transactional(readOnly = true)
public class CCTCPParamValueServiceImpl extends AbstractServiceImpl<CCTCPParamValue> implements CCTCPParamValueService {

    /**
     * The Approved Decision dao.
     */
    @Autowired
    private CCTCPParamValueDao cCTCPParamValueDao;

    /**
     * Instantiates a new CCTCPParamValue service impl.
     */
    public CCTCPParamValueServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<CCTCPParamValue> getJpaDao() {
        return cCTCPParamValueDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<CCTCPParamValue> jpaDao) {
        this.cCTCPParamValueDao = (CCTCPParamValueDao) jpaDao;

    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.CCTCPParamValueService#findCCTCPParamValueByItemFlow(org.guce.siat.common.model.ItemFlow
	 * )
     */
    @Override
    public CCTCPParamValue findCCTCPParamValueByItemFlow(final ItemFlow itemFlow) {
        return cCTCPParamValueDao.findCCTCPParamValueByItemFlow(itemFlow);

    }


    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.CCTCPParamValueService#findCCTCPParamValueByFileItem(org.guce.siat.common.model.FileItem
	 * )
     */
    @Override
    public CCTCPParamValue findCCTCPParamValueByFileItem(final FileItem fileItem) {
        return cCTCPParamValueDao.findCCTCPParamValueByFileItem(fileItem);
    }

}
