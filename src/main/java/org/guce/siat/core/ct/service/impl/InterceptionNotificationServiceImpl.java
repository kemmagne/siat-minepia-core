package org.guce.siat.core.ct.service.impl;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.core.ct.dao.InterceptionNotificationDao;
import org.guce.siat.core.ct.model.InterceptionNotification;
import org.guce.siat.core.ct.service.InterceptionNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author tadzotsa
 */
@Service("interceptionNotificationService")
@Transactional(readOnly = true)
@PropertySources(value = @PropertySource("classpath:global-config.properties"))
public class InterceptionNotificationServiceImpl extends AbstractServiceImpl<InterceptionNotification> implements InterceptionNotificationService {

    @Autowired
    private InterceptionNotificationDao interceptionNotificationDao;

    public InterceptionNotificationServiceImpl() {
        super();
    }

    @Override
    public AbstractJpaDao<InterceptionNotification> getJpaDao() {
        return interceptionNotificationDao;
    }

    @Override
    public void setJpaDao(AbstractJpaDao<InterceptionNotification> jpaDao) {
        this.interceptionNotificationDao = (InterceptionNotificationDao) jpaDao;
    }

    @Override
    public InterceptionNotification findByLastItemFlow(final ItemFlow itemFlow) {
        return interceptionNotificationDao.findByLastItemFlow(itemFlow);
    }

}

