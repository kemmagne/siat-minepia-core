package org.guce.siat.core.common;

import org.guce.siat.common.service.MailService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class MailServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class MailServiceTest {

    private static final Logger LOG = LoggerFactory.getLogger(MailServiceTest.class);

    @Autowired
    private MailService mailServicve;

    /**
     * Gets the from.
     *
     * test the from
     */
    @Ignore
    @Test
    public void getFrom() {
        Assert.assertNotNull(mailServicve.getFromValue());
        LOG.debug(mailServicve.getFromValue());
    }

}
