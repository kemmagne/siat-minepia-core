package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.TreatmentInfosDao;
import org.guce.siat.core.ct.model.TreatmentInfos;
import org.guce.siat.core.ct.model.TreatmentOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TreatmentOrderDaoImpl.
 */
@Repository("treatmentInfosDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentInfosDaoImpl extends AbstractJpaDaoImpl<TreatmentInfos> implements TreatmentInfosDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(TreatmentInfosDaoImpl.class);

    /**
     * Instantiates a new analys Order dao impl.
     */
    public TreatmentInfosDaoImpl() {
        super();
        setClasse(TreatmentInfos.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TreatmentInfosDao#findTreatmentInfosByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public TreatmentInfos findTreatmentInfosByItemFlow(final ItemFlow itemFlow) {
        if (itemFlow != null) {
            try {
                final TypedQuery<TreatmentInfos> query = super.entityManager.createQuery("SELECT ti FROM TreatmentInfos ti WHERE ti.itemFlow.id = :itemFlowId",
                        TreatmentInfos.class);
                query.setParameter("itemFlowId", itemFlow.getId());
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }
        }
        return null;
    }
}

