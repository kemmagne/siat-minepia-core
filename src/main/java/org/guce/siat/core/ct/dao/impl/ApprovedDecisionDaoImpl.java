package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.ApprovedDecisionDao;
import org.guce.siat.core.ct.model.ApprovedDecision;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class ApprovedDecisionDaoImpl.
 */
@Repository("approvedDecisionDao")
@Transactional(propagation = Propagation.REQUIRED)
public class ApprovedDecisionDaoImpl extends AbstractJpaDaoImpl<ApprovedDecision> implements ApprovedDecisionDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ApprovedDecisionDaoImpl.class);

    /**
     * Instantiates a new analys Order dao impl.
     */
    public ApprovedDecisionDaoImpl() {
        super();
        setClasse(ApprovedDecision.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.ApprovedDecisionDao#findApprovedDecisionByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public ApprovedDecision findApprovedDecisionByItemFlow(final ItemFlow itemFlow) {
        if (itemFlow != null) {
            try {
                final TypedQuery<ApprovedDecision> query = super.entityManager.createQuery("SELECT ti FROM ApprovedDecision ti WHERE ti.itemFlow.id = :itemFlowId",
                        ApprovedDecision.class);
                query.setParameter("itemFlowId", itemFlow.getId());
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }
        }
        return null;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.ApprovedDecisionDao#findApprovedDecisionByFileItem(org.guce.siat.common.model.FileItem)
     */
    @Override
    public ApprovedDecision findApprovedDecisionByFileItem(final FileItem fileItem) {
        if (fileItem != null) {
            try {
                final TypedQuery<ApprovedDecision> query = super.entityManager.createQuery("SELECT ti FROM ApprovedDecision ti WHERE ti.itemFlow.fileItem.id = :fileItemId",
                        ApprovedDecision.class);
                query.setParameter("fileItemId", fileItem.getId());
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }
        }
        return null;
    }

}
