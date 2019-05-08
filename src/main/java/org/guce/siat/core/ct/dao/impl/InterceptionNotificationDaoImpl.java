package org.guce.siat.core.ct.dao.impl;

import java.util.Objects;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;
import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.dao.InterceptionNotificationDao;
import org.guce.siat.core.ct.model.InterceptionNotification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("interceptionNotificationDao")
@Transactional(propagation = Propagation.REQUIRED)
public class InterceptionNotificationDaoImpl extends AbstractJpaDaoImpl<InterceptionNotification> implements InterceptionNotificationDao {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(InterceptionNotificationDaoImpl.class);

    public InterceptionNotificationDaoImpl() {
        super();
        setClasse(InterceptionNotification.class);

    }

    @Override
    public InterceptionNotification findByLastItemFlow(final ItemFlow itemFlow) {
        if (!Objects.equals(itemFlow, null)) {

            final TypedQuery<InterceptionNotification> query = entityManager
                    .createQuery("SELECT i FROM InterceptionNotification i WHERE i.itemFlow.id = :itemFlowId", InterceptionNotification.class);

            query.setParameter("itemFlowId", itemFlow.getId());

            try {
                return query.getSingleResult();
            } catch (NoResultException | NonUniqueResultException e) {
                LOG.error(Objects.toString(e), e);
            }

        }
        return null;
    }

}
