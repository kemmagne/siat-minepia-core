package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.ParamCCTCPDao;
import org.guce.siat.core.ct.model.ParamCCTCP;
import org.guce.siat.core.ct.service.ParamCCTCPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class ParamCCTCPServiceImpl.
 */
@Service("paramCCTCPService")
@Transactional(readOnly = true)
public class ParamCCTCPServiceImpl extends AbstractServiceImpl<ParamCCTCP> implements ParamCCTCPService {

    /**
     * The Approved Decision dao.
     */
    @Autowired
    private ParamCCTCPDao paramCCTCPDao;

    /**
     * Instantiates a new ParamCCTCP service impl.
     */
    public ParamCCTCPServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<ParamCCTCP> getJpaDao() {
        return paramCCTCPDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<ParamCCTCP> jpaDao) {
        this.paramCCTCPDao = (ParamCCTCPDao) jpaDao;

    }

    @Override
    public ParamCCTCP findParamCCTCPByAdministration(Administration administration) {
        return paramCCTCPDao.findParamCCTCPByAdministration(administration);
    }

    @Override
    public ParamCCTCP findParamCCTCPDefault() {
        return paramCCTCPDao.findParamCCTCPDefault();
    }
    
    

}
