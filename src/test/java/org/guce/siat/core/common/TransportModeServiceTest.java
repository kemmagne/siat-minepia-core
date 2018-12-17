package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.guce.siat.common.model.TransportMode;
import org.guce.siat.common.service.TransportModeService;
import org.guce.siat.common.utils.Constants;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class TransportModeServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class TransportModeServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(TransportModeServiceTest.class);

    /**
     * The Constant FIND_BY_MODE_TRANSPORT_CODE_01.
     */
    private static final String FIND_BY_TRANSPORT_MODE_CODE_01 = "findByTransportModeCode_01";

    /**
     * The Constant FIND_BY_MODE_TRANSPORT_CODE_02.
     */
    private static final String FIND_BY_TRANSPORT_MODE_CODE_02 = "findByTransportModeCode_02";

    /**
     * The Constant FIND_BY_MODE_TRANSPORT_CODE_03.
     */
    private static final String FIND_BY_TRANSPORT_MODE_CODE_03 = "findByTransportModeCode_03";

    /**
     * The transport mode service.
     */
    @Autowired
    TransportModeService transportModeService;

    /**
     * Find by transport mode code_01.
     */
    @Ignore
    @Test
    public void findByTransportModeCode_01() {
        final TransportMode transportMode = transportModeService.findByTransportModeCode(Long.valueOf(Constants.ONE));
        assertNotNull(transportMode);
        assertTrue(transportMode.getModeTransportCode() == Long.valueOf(Constants.ONE));

        LOG.info(FIND_BY_TRANSPORT_MODE_CODE_01);
    }

    /**
     * Find by transport mode code_02.
     */
    @Ignore
    @Test
    public void findByTransportModeCode_02() {
        final TransportMode transportMode = transportModeService.findByTransportModeCode(Long.valueOf(Constants.FIVE));
        assertNull(transportMode);

        LOG.info(FIND_BY_TRANSPORT_MODE_CODE_02);
    }

    /**
     * Transport mode service test_02.
     */
    @Ignore
    @Test
    public void findByTransportModeCode_03() {
        final TransportMode transportMode = transportModeService.findByTransportModeCode(null);
        assertNull(transportMode);

        LOG.info(FIND_BY_TRANSPORT_MODE_CODE_03);

    }
}
