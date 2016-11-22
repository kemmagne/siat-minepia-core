package org.guce.siat.core.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.ControllerHoliday;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.ControllerHolidayService;
import org.guce.siat.common.utils.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class ControllerHolidayServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class ControllerHolidayServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ControllerHolidayServiceTest.class);

	/** The Constant FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_01. */
	private static final String FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_01 = "findControllerHolidayByControllerAndDates_01";

	/** The Constant FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_02. */
	private static final String FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_02 = "findControllerHolidayByControllerAndDates_02";

	/** The Constant FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_03. */
	private static final String FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_03 = "findControllerHolidayByControllerAndDates_03";

	/** The FIN d_ b y_ controlle r_ an d_ date s_ testcas e1. */
	private static String FIND_BY_CONTROLLER_AND_DATES_TESTCASE1 = "findByControllerAndDateTestCase1";

	/** The FIN d_ b y_ controlle r_ an d_ date s_ testcas e2. */
	private static String FIND_BY_CONTROLLER_AND_DATES_TESTCASE2 = "findByControllerAndDateTestCase2";

	/** The Constant YEAR. */
	private static final int YEAR = 2015;

	/** The controller holiday service. */
	@Autowired
	private ControllerHolidayService controllerHolidayService;


	/**
	 * Find controller holiday by controller and dates_01.
	 */
	@Test
	public void findControllerHolidayByControllerAndDates_01()
	{
		final Calendar cal = Calendar.getInstance();
		cal.set(YEAR, Constants.TWO, Constants.ONE);
		final Date bDate = cal.getTime();
		cal.set(YEAR, Constants.THREE, Constants.ONE);
		final Date eDate = cal.getTime();

		final User user = new User();
		user.setId(22L);

		final List<ControllerHoliday> controllerHolidayList = controllerHolidayService.findHolidayByControllerAndDates(user, bDate,
				eDate);

		assertTrue(CollectionUtils.isNotEmpty(controllerHolidayList));
		assertTrue(controllerHolidayList.size() == Constants.ONE);
		assertEquals(Long.valueOf(2), controllerHolidayList.get(0).getId());
		assertEquals(Long.valueOf(22), controllerHolidayList.get(0).getUser().getId());
		assertEquals(Boolean.TRUE, controllerHolidayList.get(0).getEnabled());

		LOG.info(FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_01);
	}

	/**
	 * Find controller holiday by controller and dates_02.
	 */
	@Test
	public void findControllerHolidayByControllerAndDates_02()
	{
		final Calendar cal = Calendar.getInstance();
		cal.set(YEAR, Constants.TWO, Constants.TWO);
		final Date bDate = cal.getTime();
		cal.set(YEAR, Constants.TWO, Constants.THIRTEEN);
		final Date eDate = cal.getTime();

		final User user = new User();
		user.setId(30L);

		final List<ControllerHoliday> controllerHolidayList = controllerHolidayService.findHolidayByControllerAndDates(user, bDate,
				eDate);

		assertNotNull(controllerHolidayList);
		assertTrue(controllerHolidayList.isEmpty());
		LOG.info(FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_02);
	}

	/**
	 * Find controller holiday by controller and dates_03.
	 */
	@Test
	public void findControllerHolidayByControllerAndDates_03()
	{
		final User user = new User();
		user.setId(22L);

		final List<ControllerHoliday> controllerHolidayList = controllerHolidayService.findHolidayByControllerAndDates(user, null,
				null);

		assertNotNull(controllerHolidayList);
		assertTrue(controllerHolidayList.isEmpty());
		LOG.info(FIND_CONTROLLER_HOLIDAY_BY_CONTROLLER_AND_DATE_03);
	}


	/**
	 * Find by controller and date test case1.
	 *
	 * @throws ParseException
	 *            the parse exception
	 */
	@Test
	public void findByControllerAndDateTestCase1() throws ParseException
	{
		final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		final Date beginDate = dateFormat.parse("01/01/2015");
		final Date endDate = dateFormat.parse("31/12/2015");
		final User user = new User();
		user.setId(22L);
		final List<ControllerHoliday> controllerHolidayList = controllerHolidayService.findHolidayByControllerAndDates(user,
				beginDate, endDate);

		Assert.assertTrue(CollectionUtils.isNotEmpty(controllerHolidayList));
		LOG.info(FIND_BY_CONTROLLER_AND_DATES_TESTCASE1);
	}


	/**
	 * Find by controller and date test case2.
	 *
	 * @throws ParseException
	 *            the parse exception
	 */
	@Test
	public void findByControllerAndDateTestCase2() throws ParseException
	{
		final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		final Date beginDate = dateFormat.parse("01/01/2015");
		final Date endDate = dateFormat.parse("31/12/2015");

		final List<ControllerHoliday> controllerHolidayList = controllerHolidayService.findHolidayByControllerAndDates(null,
				beginDate, endDate);

		Assert.assertTrue(CollectionUtils.isEmpty(controllerHolidayList));
		LOG.info(FIND_BY_CONTROLLER_AND_DATES_TESTCASE2);
	}
}
