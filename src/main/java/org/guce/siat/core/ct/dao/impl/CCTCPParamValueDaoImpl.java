package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.CCTCPParamValueDao;
import org.guce.siat.core.ct.model.CCTCPParamValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class CCTCPParamValueDaoImpl.
 */
@Repository("cCTCPParamValueDao")
@Transactional(propagation = Propagation.REQUIRED)
public class CCTCPParamValueDaoImpl extends AbstractJpaDaoImpl<CCTCPParamValue> implements CCTCPParamValueDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CCTCPParamValueDaoImpl.class);

    /**
     * Instantiates a new cCTCPParamValue Dao impl.
     */
    public CCTCPParamValueDaoImpl() {
        super();
        setClasse(CCTCPParamValue.class);
    }

    /*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.CCTCPParamValueDao#findCCTCPParamValueByItemFlow(org.guce.siat.common.model.ItemFlow)
     */
    @Override
    public CCTCPParamValue findCCTCPParamValueByItemFlow(final ItemFlow itemFlow) {
        if (itemFlow != null) {
            try {
                final TypedQuery<CCTCPParamValue> query = super.entityManager.createQuery("SELECT ti FROM CCTCPParamValue ti WHERE ti.itemFlow.id = :itemFlowId",
                        CCTCPParamValue.class);
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
	 * @see org.guce.siat.core.ct.dao.CCTCPParamValueDao#findCCTCPParamValueByFileItem(org.guce.siat.common.model.FileItem)
     */
    @Override
    public CCTCPParamValue findCCTCPParamValueByFileItem(final FileItem fileItem) {
        if (fileItem != null) {
            try {
                final TypedQuery<CCTCPParamValue> query = super.entityManager.createQuery("SELECT ti FROM CCTCPParamValue ti WHERE ti.itemFlow.fileItem.id = :fileItemId",
                        CCTCPParamValue.class);
                query.setParameter("fileItemId", fileItem.getId());
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }
        }
        return null;
    }

}
