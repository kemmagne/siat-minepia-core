package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Appointment;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AppointmentService;
import org.guce.siat.common.service.ServiceService;
import org.guce.siat.common.service.UserService;
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
 * The Class AppointmentServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class AppointmentServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(AppointmentServiceTest.class);

    /**
     * The Constant FIND_APPOINTMENTS_BY_INSPECTOR_LIST_01.
     */
    private static final String FIND_APPOINTMENTS_BY_INSPECTOR_LIST_01 = "findAppointmentsByInspectorList_01";

    /**
     * The Constant FIND_APPOINTMENTS_BY_INSPECTOR_LIST_02.
     */
    private static final String FIND_APPOINTMENTS_BY_INSPECTOR_LIST_02 = "findAppointmentsByInspectorList_02";

    /**
     * The appointment service.
     */
    @Autowired
    private AppointmentService appointmentService;

    /**
     * The user service.
     */
    @Autowired
    private UserService userService;

    /**
     * The service service.
     */
    @Autowired
    private ServiceService serviceService;

    /**
     * Find appointments by inspector list_01.
     */
    @Ignore
    @Test
    public void findAppointmentsByInspectorList_01() {
        final Service service = serviceService.find(Long.valueOf(Constants.THIRTY));
        final List<User> controllers = userService.findInspectorsByService(service);
        final List<Appointment> appointments = appointmentService.findAppointmentsByControllerList(controllers);
        assertTrue(CollectionUtils.isNotEmpty(appointments));
        assertTrue(appointments.size() == Long.valueOf(Constants.ONE));
        assertTrue(appointments.get(Constants.ZERO).getCar().getId() == Long.valueOf(Constants.FOUR));

        LOG.info(FIND_APPOINTMENTS_BY_INSPECTOR_LIST_01);
    }

    /**
     * Find appointments by inspector list_02.
     */
    @Ignore
    @Test
    public void findAppointmentsByInspectorList_02() {
        final Service service = serviceService.find(Long.valueOf(Constants.FIVE));
        final List<User> inspectors = userService.findInspectorsByService(service);
        final List<Appointment> appointments = appointmentService.findAppointmentsByControllerList(inspectors);
        assertNotNull(appointments);
        assertTrue(CollectionUtils.isEmpty(appointments));

        LOG.info(FIND_APPOINTMENTS_BY_INSPECTOR_LIST_02);
    }

}

