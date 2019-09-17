package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Administration;
import org.guce.siat.core.ct.dao.ParamCCTCPDao;
import org.guce.siat.core.ct.model.ParamCCTCP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class ParamCCTCPDaoImpl.
 */
@Repository("paramCCTCPDao")
@Transactional(propagation = Propagation.REQUIRED)
public class ParamCCTCPDaoImpl extends AbstractJpaDaoImpl<ParamCCTCP> implements ParamCCTCPDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ParamCCTCPDaoImpl.class);

    /**
     * Instantiates a new ParamCCTCP dao impl.
     */
    public ParamCCTCPDaoImpl() {
        super();
        setClasse(ParamCCTCP.class);
    }

    @Override
    public ParamCCTCP findParamCCTCPByAdministration(Administration administration) {
        if (administration != null) {
            try {
                final TypedQuery<ParamCCTCP> query = super.entityManager.createQuery("SELECT ti FROM ParamCCTCP ti WHERE ti.administration.id = :administration",
                        ParamCCTCP.class);
                query.setParameter("administration", administration.getId());
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }
        }
        return null;
    }

    @Override
    public ParamCCTCP findParamCCTCPDefault() {
        try {
            final TypedQuery<ParamCCTCP> query = super.entityManager.createQuery("SELECT ti FROM ParamCCTCP ti WHERE ti.id = :id",
                    ParamCCTCP.class);
            query.setParameter("id", Long.valueOf(1));
            return query.getSingleResult();
        } catch (NoResultException | NonUniqueResultException e) {
            LOG.error(Objects.toString(e), e);
        }
        return null;
    }

}
