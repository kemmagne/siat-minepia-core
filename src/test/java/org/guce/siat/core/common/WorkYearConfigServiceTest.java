package org.guce.siat.core.common;

import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.HourlyType;
import org.guce.siat.common.model.WorkYearConfig;
import org.guce.siat.common.service.WorkYearConfigService;
import org.guce.siat.common.utils.Constants;
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
 * The Class WorkYearConfigServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class WorkYearConfigServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(WorkYearConfigServiceTest.class);

    /**
     * The Constant FIND_WORK_YEAR_CONFIG_BY_YEAR_01.
     */
    private static final String FIND_WORK_YEAR_CONFIG_BY_YEAR_01 = "findWorkYearConfigByYear_01";

    /**
     * The Constant FIND_WORK_YEAR_CONFIG_BY_YEAR_02.
     */
    private static final String FIND_WORK_YEAR_CONFIG_BY_YEAR_02 = "findWorkYearConfigByYear_02";

    /**
     * The Constant FIND_BY_HOURLY_TYPE.
     */
    private static final String FIND_BY_HOURLY_TYPE = "findByHourlyType";

    /**
     * The Constant DELETE_WORK_YEAR_CONFIG_BY_YEAR.
     */
    private static final String DELETE_WORK_YEAR_CONFIG_BY_YEAR = "deleteWorkYearConfigByYear";

    /**
     * The Constant FIND_BETWEEN_TWO_DATES_TEST_CASE1.
     */
    private static final String FIND_BETWEEN_TWO_DATES_TEST_CASE1 = "findBetweenTwoDatesTestCase1";

    /**
     * The Constant FIND_BETWEEN_TWO_DATES_TEST_CASE2.
     */
    private static final String FIND_BETWEEN_TWO_DATES_TEST_CASE2 = "findBetweenTwoDatesTestCase2";

    /**
     * The work year config service.
     */
    @Autowired
    private WorkYearConfigService workYearConfigService;

    /**
     * Find work year config by year_01.
     */
    @Ignore
    @Test
    public void findWorkYearConfigByYear_01() {
        final List<WorkYearConfig> workYearconfigList = workYearConfigService
                .findWorkYearConfigByYear(Constants.TWO_THOUSAND_AND_FIFTEEN);
        assertTrue(CollectionUtils.isNotEmpty(workYearconfigList));
        LOG.info(FIND_WORK_YEAR_CONFIG_BY_YEAR_01);
    }

    /**
     * Find work year config by year_02.
     */
    @Ignore
    @Test
    public void findWorkYearConfigByYear_02() {
        final List<WorkYearConfig> workYearconfigList = workYearConfigService.findWorkYearConfigByYear(null);
        assertTrue(CollectionUtils.isEmpty(workYearconfigList));
        LOG.info(FIND_WORK_YEAR_CONFIG_BY_YEAR_02);
    }

    /**
     * Find by hourly type_01.
     */
    @Ignore
    @Test
    public void findByHourlyType() {
        final HourlyType hourlyType = new HourlyType();
        hourlyType.setId(Long.valueOf(1));
        final List<WorkYearConfig> workYearConfigList = workYearConfigService.findByHourlyType(hourlyType);
        assertTrue(CollectionUtils.isNotEmpty(workYearConfigList));
        LOG.info(FIND_BY_HOURLY_TYPE);
    }

    /**
     * Delete work year config by year.
     */
    @Ignore
    @Test
    public void deleteWorkYearConfigByYear() {
        List<WorkYearConfig> workYearConfigList = workYearConfigService
                .findWorkYearConfigByYear(Constants.TWO_THOUSAND_AND_FIFTEEN);
        assertTrue(CollectionUtils.isNotEmpty(workYearConfigList));
        workYearConfigService.deleteWorkYearConfigByYear(Constants.TWO_THOUSAND_AND_FIFTEEN);
        workYearConfigList = workYearConfigService.findWorkYearConfigByYear(Constants.TWO_THOUSAND_AND_FIFTEEN);
        assertTrue(CollectionUtils.isEmpty(workYearConfigList));
        LOG.info(DELETE_WORK_YEAR_CONFIG_BY_YEAR);
    }

    /**
     * Find between two dates test case1.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
    @Test
    public void findBetweenTwoDatesTestCase1() throws ParseException {
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final Date beginDate = dateFormat.parse("01/01/2015");
        final Date endDate = dateFormat.parse("31/12/2015");
        final List<WorkYearConfig> workYearConfigList = workYearConfigService.findBetweenTwoDates(beginDate, endDate);

        Assert.assertTrue(workYearConfigList.size() == Constants.TWO);
        LOG.info(FIND_BETWEEN_TWO_DATES_TEST_CASE1);

    }

    /**
     * Find between two dates test case1.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
    @Test
    public void findBetweenTwoDatesTestCase2() throws ParseException {
        final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        final Date beginDate = dateFormat.parse("01/01/2015");
        final Date endDate = dateFormat.parse("31/12/2015");
        final List<WorkYearConfig> workYearConfigList = workYearConfigService.findBetweenTwoDates(endDate, beginDate);

        Assert.assertTrue(CollectionUtils.isEmpty(workYearConfigList));

        LOG.info(FIND_BETWEEN_TWO_DATES_TEST_CASE2);
    }

}
