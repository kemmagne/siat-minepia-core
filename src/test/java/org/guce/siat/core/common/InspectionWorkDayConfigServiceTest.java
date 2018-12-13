package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.HourlyType;
import org.guce.siat.common.model.InspectionWorkDayConfig;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.HourlyTypeService;
import org.guce.siat.common.service.InspectionWorkDayConfigService;
import org.guce.siat.common.service.OrganismService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class InspectionWorkDayConfigServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class InspectionWorkDayConfigServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(InspectionWorkDayConfigServiceTest.class);

    /**
     * The Constant FIND_INSPECTION_WORK_DAY_CONFIG_BY_HOURLYTYPE_01.
     */
    private static final String FIND_INSPECTION_WORK_DAY_CONFIG_BY_HOURLYTYPE_01 = "findInspectionWorkDayConfigByHourlyType_01";

    /**
     * The Constant HOURLY_TYPE_ID.
     */
    private static final Long HOURLY_TYPE_ID = 1L;

    /**
     * The Constant ORGANISM_ID.
     */
    private static final Long ORGANISM_ID = 2L;
    /**
     * The inspection work day config service.
     */
    @Autowired
    private InspectionWorkDayConfigService inspectionWorkDayConfigService;

    /**
     * The hourly type service.
     */
    @Autowired
    private HourlyTypeService hourlyTypeService;

    /**
     * The organism service.
     */
    @Autowired
    private OrganismService organismService;

    /**
     * Find inspection work day config by hourly type_01.
     */
    @Ignore
    @Test
    public void findInspectionWorkDayConfigByHourlyType_01() {
        final HourlyType hourlyType = hourlyTypeService.find(1L);
        final List<InspectionWorkDayConfig> InspectionWorkDayConfigList = inspectionWorkDayConfigService
                .findInspectionWorkDayConfigByHourlyType(hourlyType);
        assertNotNull(InspectionWorkDayConfigList);
        assertTrue(CollectionUtils.isNotEmpty(InspectionWorkDayConfigList));
        LOG.info(FIND_INSPECTION_WORK_DAY_CONFIG_BY_HOURLYTYPE_01);
    }

    /**
     * Find inspection work day config by hourly type_02.
     */
    @Ignore
    @Test
    public void findInspectionWorkDayConfigByHourlyType_02() {
        try {
            final List<InspectionWorkDayConfig> InspectionWorkDayConfigList = inspectionWorkDayConfigService
                    .findInspectionWorkDayConfigByHourlyType(null);
            assertTrue(CollectionUtils.isEmpty(InspectionWorkDayConfigList));
        } catch (final Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    /**
     * Find inspection work day config by hourly type and organism_01.
     */
    @Ignore
    @Test
    public void findInspectionWorkDayConfigByHourlyTypeAndOrganism_01() {
        final HourlyType hourlyType = hourlyTypeService.find(HOURLY_TYPE_ID);
        final Organism organism = organismService.find(ORGANISM_ID);
        final List<InspectionWorkDayConfig> InspectionWorkDayConfigList = inspectionWorkDayConfigService
                .findInspectionWorkDayConfigByHourlyTypeAndOrganism(hourlyType, organism);
        assertTrue(CollectionUtils.isNotEmpty(InspectionWorkDayConfigList));
    }

    /**
     * Find inspection work day config by hourly type and organism_02.
     */
    @Ignore
    @Test
    public void findInspectionWorkDayConfigByHourlyTypeAndOrganism_02() {
        try {
            final List<InspectionWorkDayConfig> InspectionWorkDayConfigList = inspectionWorkDayConfigService
                    .findInspectionWorkDayConfigByHourlyTypeAndOrganism(null, null);
            assertTrue(CollectionUtils.isNotEmpty(InspectionWorkDayConfigList));
        } catch (final Exception e) {
            assertTrue(e instanceof NullPointerException);
        }
    }

    /**
     * Find by hourly type_01.
     */
    @Ignore
    @Test
    public void findByHourlyType_01() {
        final HourlyType hourlyType = hourlyTypeService.find(HOURLY_TYPE_ID);
        final List<InspectionWorkDayConfig> InspectionWorkDayConfigList = inspectionWorkDayConfigService
                .findInspectionWorkDayConfigByHourlyType(hourlyType);
        assertTrue(CollectionUtils.isNotEmpty(InspectionWorkDayConfigList));

    }

}
