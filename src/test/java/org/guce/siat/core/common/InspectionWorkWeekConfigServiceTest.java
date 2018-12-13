package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.HourlyType;
import org.guce.siat.common.model.InspectionWorkWeekConfig;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.HourlyTypeService;
import org.guce.siat.common.service.InspectionWorkWeekConfigService;
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
 * The Class InspectionWorkWeekConfigServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class InspectionWorkWeekConfigServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(InspectionWorkWeekConfigServiceTest.class);

    /**
     * The Constant FIND_BY_HOURLYTYPE_01.
     */
    private static final String FIND_BY_HOURLYTYPE_01 = "findByHourlyType_01";

    /**
     * The Constant FIND_BY_HOURLYTYPE_02.
     */
    private static final String FIND_BY_HOURLYTYPE_02 = "findByHourlyType_02";

    /**
     * The inspection work week config service.
     */
    @Autowired
    private InspectionWorkWeekConfigService inspectionWorkWeekConfigService;

    /**
     * The Organism service.
     */
    @Autowired
    private OrganismService OrganismService;

    @Autowired
    private HourlyTypeService hourlyTypeService;

    /**
     * Find iww config by organism_01.
     */
    @Ignore
    @Test
    public void findIWWConfigByOrganism_01() {
        final Organism organism = OrganismService.find(3L);
        final List<InspectionWorkWeekConfig> inspectionWorkWeekConfigList = inspectionWorkWeekConfigService
                .findIWWConfigByOrganism(organism);
        assertNotNull(inspectionWorkWeekConfigList);
        assertTrue(CollectionUtils.isNotEmpty(inspectionWorkWeekConfigList));
    }

    /**
     * Find iww config by organism_02.
     */
    @Ignore
    @Test
    public void findIWWConfigByOrganism_02() {
        try {
            final List<InspectionWorkWeekConfig> inspectionWorkWeekConfigList = inspectionWorkWeekConfigService
                    .findIWWConfigByOrganism(null);
            inspectionWorkWeekConfigList.isEmpty();
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
        final HourlyType hourlyType = hourlyTypeService.find(1L);
        final List<InspectionWorkWeekConfig> inspectionWorkWeekConfigList = inspectionWorkWeekConfigService
                .findByHourlyType(hourlyType);
        assertNotNull(inspectionWorkWeekConfigList);
        assertTrue(inspectionWorkWeekConfigList.size() > 0);
        LOG.info(FIND_BY_HOURLYTYPE_01);
    }

    /**
     * Find by hourly type_02.
     */
    @Ignore
    @Test
    public void findByHourlyType_02() {
        try {
            final List<InspectionWorkWeekConfig> inspectionWorkWeekConfigList = inspectionWorkWeekConfigService
                    .findByHourlyType(null);
            inspectionWorkWeekConfigList.isEmpty();
        } catch (final Exception e) {
            assertTrue(e instanceof NullPointerException);
            LOG.info(FIND_BY_HOURLYTYPE_02);

        }
    }

}
