package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.model.ServicesItem;
import org.guce.siat.common.service.ItemService;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.service.ServiceService;
import org.guce.siat.common.service.ServicesItemService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class ServicesItemServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class ServicesItemServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ServicesItemServiceTest.class);

    /**
     * The Constant EXISTING_NSH.
     */
    private static final String EXISTING_NSH = "18069031004";

    /**
     * The Constant NON_EXISTING_NSH.
     */
    private static final String NON_EXISTING_NSH = "11111111111";

    /**
     * The Constant FIND_SERVICE_ITEM_BY_SERVICE_01.
     */
    private static final String FIND_SERVICE_ITEM_BY_SERVICE_01 = "findServicesItemByService_01";

    /**
     * The Constant SERVICE_ID.
     */
    private static final Long SERVICE_ID = 5L;
    private static final Long ORGANISM_ID = 3L;

    /**
     * The services item service.
     */
    @Autowired
    private ServicesItemService servicesItemService;

    /**
     * The item service.
     */
    @Autowired
    private ItemService itemService;

    /**
     * The organism service.
     */
    @Autowired
    private OrganismService organismService;

    /**
     * The service service.
     */
    @Autowired
    private ServiceService serviceService;

    /**
     * Find services item by service_01.
     */
    @Ignore
    @Test
    public void findServicesItemByService_01() {
        final Service service = serviceService.find(SERVICE_ID);
        final List<ServicesItem> servicesItemList = servicesItemService.findServicesItemByService(service);
        assertNotNull(servicesItemList);
        LOG.info(FIND_SERVICE_ITEM_BY_SERVICE_01);
    }

    /**
     * Find service item by services_02.
     */
    @Ignore
    @Test
    public void findServiceItemByServices_02() {
        final Service service = serviceService.find(SERVICE_ID);
        final List<ServicesItem> servicesItemList = servicesItemService.findServicesItemByService(service);
        assertTrue(CollectionUtils.isNotEmpty(servicesItemList));

    }

    /**
     * Find services item by nsh_01.
     */
    @Ignore
    @Test
    public void findServicesItemByNsh_01() {
        final List<ServicesItem> servicesItemList = servicesItemService.findServicesItemByNsh(EXISTING_NSH);
        assertTrue(CollectionUtils.isNotEmpty(servicesItemList));
    }

    /**
     * Find services item by nsh_02.
     */
    @Ignore
    @Test
    public void findServicesItemByNsh_02() {
        final List<ServicesItem> servicesItemList = servicesItemService.findServicesItemByNsh(NON_EXISTING_NSH);
        assertTrue(servicesItemList.isEmpty());
    }

    /**
     * Find services item by nsh_03.
     */
    @Ignore
    @Test
    public void findServicesItemByNsh_03() {
        final List<ServicesItem> servicesItemList = servicesItemService.findServicesItemByNsh(null);
        assertTrue(servicesItemList.isEmpty());
    }

    /**
     * Find services item by organisme_01. find serviceItem with an existing
     * organism
     */
    @Ignore
    @Test
    public void findServicesItemByOrganisme_01() {
        final Service service = serviceService.find(SERVICE_ID);
        assertNotNull(service);
        final List<ServicesItem> serviceItemList = servicesItemService.findServicesItemByOrganism(service.getSubDepartment()
                .getOrganism());
        assertTrue(!serviceItemList.isEmpty());
    }

    /**
     * Find services item by organisme_02. find serviceItem with a non existing
     * organism
     */
    @Ignore
    @Test
    public void findServicesItemByOrganisme_02() {
        final Service service = serviceService.find(SERVICE_ID);
        assertNotNull(service);
        final List<ServicesItem> serviceItemList = servicesItemService.findServicesItemByOrganism(service.getSubDepartment()
                .getOrganism());
        assertTrue(CollectionUtils.isNotEmpty(serviceItemList));
    }

    /**
     * Fetch max code by nsh_01.
     */
    @Ignore
    @Test
    public void fetchMaxCodeByNsh_01() {
        Integer maxCode = null;
        maxCode = servicesItemService.fetchMaxCodeByNsh(EXISTING_NSH);
        assertNotNull(maxCode);
    }

    /**
     * Fetch max code by nsh_02.
     */
    @Ignore
    @Test
    public void fetchMaxCodeByNsh_02() {
        Integer maxCode = null;
        maxCode = servicesItemService.fetchMaxCodeByNsh(NON_EXISTING_NSH);
        assertNull(maxCode);
    }

    /**
     * Find active services item by organisme_01.
     */
    @Ignore
    @Test
    public void findActiveServicesItemByOrganisme_01() {
        final Organism organism = organismService.find(ORGANISM_ID);
        final List<ServicesItem> servicesItemList = servicesItemService.findActiveServicesItemByOrganism(organism);
        assertNotNull(servicesItemList);
        assertTrue(CollectionUtils.isNotEmpty(servicesItemList));

    }

    /**
     * Find all active services item by organism_01.
     */
    @Ignore
    @Test
    public void findAllActiveServicesItemByOrganism_01() {
        final Organism organism = organismService.find(ORGANISM_ID);
        assertNotNull(organism);
        final List<ServicesItem> servicesItemList = servicesItemService.findAllActiveServicesItemByOrganism(organism);
        assertTrue(CollectionUtils.isNotEmpty(servicesItemList));
    }

}
