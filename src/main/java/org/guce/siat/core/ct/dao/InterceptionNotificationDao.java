package org.guce.siat.core.ct.dao;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.ct.model.InterceptionNotification;

/**
 *
 * @author tadzotsa
 */
public interface InterceptionNotificationDao extends AbstractJpaDao<InterceptionNotification> {

    InterceptionNotification findByLastItemFlow(ItemFlow itemFlow);

}

