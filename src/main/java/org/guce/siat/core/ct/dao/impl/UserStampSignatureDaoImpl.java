package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.dao.TreatmentInfosCCSMinsanteDao;
import org.guce.siat.core.ct.dao.TreatmentInfosDao;
import org.guce.siat.core.ct.dao.UserStampSignatureDao;
import org.guce.siat.core.ct.model.TreatmentInfos;
import org.guce.siat.core.ct.model.TreatmentInfosCCSMinsante;
import org.guce.siat.core.ct.model.UserStampSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class UserStampSignatureDaoImpl.
 */
@Repository("userStampSignatureDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserStampSignatureDaoImpl extends AbstractJpaDaoImpl<UserStampSignature> implements UserStampSignatureDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserStampSignatureDaoImpl.class);

    /**
     * Instantiates a new analys Order dao impl.
     */
    public UserStampSignatureDaoImpl() {
        super();
        setClasse(UserStampSignature.class);
    }

    @Override
    public UserStampSignature findUserStampSignatureByUser(User user) {
        if (user == null) {
            return null;
        }
        try {
            TypedQuery<UserStampSignature> query = super.entityManager.createQuery("SELECT uss FROM UserStampSignature uss WHERE uss.user.id = :userId ORDER BY uss.id DESC", UserStampSignature.class);
            query.setParameter("userId", user.getId());
            query.setMaxResults(1);
            return query.getSingleResult();
        } catch (NoResultException e) {
            LOG.error(Objects.toString(e), e);
        }

        return null;
    }

    
}
