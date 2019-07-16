package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.ApprovedDecisionDao;
import org.guce.siat.core.ct.model.ApprovedDecision;
import org.guce.siat.core.ct.service.ApprovedDecisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class ApprovedDecisionServiceImpl.
 */
@Service("approvedDecisionService")
@Transactional(readOnly = true)
public class ApprovedDecisionServiceImpl extends AbstractServiceImpl<ApprovedDecision> implements ApprovedDecisionService {

    /**
     * The Approved Decision dao.
     */
    @Autowired
    private ApprovedDecisionDao approvedDecisionDao;

    /**
     * Instantiates a new ApprovedDecision service impl.
     */
    public ApprovedDecisionServiceImpl() {
        super();
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
     */
    @Override
    public AbstractJpaDao<ApprovedDecision> getJpaDao() {
        return approvedDecisionDao;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
     */
    @Override
    public void setJpaDao(final AbstractJpaDao<ApprovedDecision> jpaDao) {
        this.approvedDecisionDao = (ApprovedDecisionDao) jpaDao;

    }

    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.ApprovedDecisionService#findApprovedDecisionByItemFlow(org.guce.siat.common.model.ItemFlow
	 * )
     */
    @Override
    public ApprovedDecision findApprovedDecisionByItemFlow(final ItemFlow itemFlow) {
        return approvedDecisionDao.findApprovedDecisionByItemFlow(itemFlow);

    }


    /*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.service.ApprovedDecisionService#findApprovedDecisionByFileItem(org.guce.siat.common.model.FileItem
	 * )
     */
    @Override
    public ApprovedDecision findApprovedDecisionByFileItem(final FileItem fileItem) {
        return approvedDecisionDao.findApprovedDecisionByFileItem(fileItem);
    }

}
