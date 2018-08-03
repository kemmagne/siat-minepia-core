package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.core.ct.model.InterceptionNotification;

/**
 *
 * @author tadzotsa
 */
public interface InterceptionNotificationService extends AbstractService<InterceptionNotification> {

    InterceptionNotification findByLastItemFlow(ItemFlow itemFlow);

}

