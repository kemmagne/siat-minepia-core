package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.TreatmentInfosCCSMinsanteDao;
import org.guce.siat.core.ct.dao.TreatmentInfosDao;
import org.guce.siat.core.ct.model.TreatmentInfos;
import org.guce.siat.core.ct.model.TreatmentInfosCCSMinsante;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TreatmentInfosCCSMinsanteDaoImpl.
 */
@Repository("treatmentInfosCCSMinsanteDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TreatmentInfosCCSMinsanteDaoImpl extends AbstractJpaDaoImpl<TreatmentInfosCCSMinsante> implements TreatmentInfosCCSMinsanteDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(TreatmentInfosCCSMinsanteDaoImpl.class);

    /**
     * Instantiates a new analys Order dao impl.
     */
    public TreatmentInfosCCSMinsanteDaoImpl() {
        super();
        setClasse(TreatmentInfosCCSMinsante.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TreatmentInfosDao#findTreatmentInfosByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public TreatmentInfosCCSMinsante findTreatmentInfosByItemFlow(final ItemFlow itemFlow) {

        if (itemFlow == null) {
            return null;
        }

        try {
            TypedQuery<TreatmentInfosCCSMinsante> query = super.entityManager.createQuery("SELECT ti FROM TreatmentInfosCCSMinsante ti WHERE ti.itemFlow.id = :itemFlowId ORDER BY ti.id DESC", TreatmentInfosCCSMinsante.class);

            query.setParameter("itemFlowId", itemFlow.getId());
            query.setMaxResults(1);

            return query.getSingleResult();
        } catch (NoResultException e) {
            LOG.error(Objects.toString(e), e);
        }

        return null;
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TreatmentInfosDao#findTreatmentInfosByFileItem(org.guce.siat.common.model.FileItem)
     */
    @Override
    public TreatmentInfosCCSMinsante findTreatmentInfosByFileItem(final FileItem fileItem) {

        if (fileItem == null) {
            return null;
        }

        try {
            TypedQuery<TreatmentInfosCCSMinsante> query = super.entityManager.createQuery("SELECT ti FROM TreatmentInfosCCSMinsante ti WHERE ti.itemFlow.fileItem.id = :fileItemId ORDER BY ti.id DESC", TreatmentInfosCCSMinsante.class);

            query.setParameter("fileItemId", fileItem.getId());
            query.setMaxResults(1);

            return query.getSingleResult();
        } catch (NoResultException e) {
            LOG.error(Objects.toString(e), e);
        }

        return null;
    }
}
