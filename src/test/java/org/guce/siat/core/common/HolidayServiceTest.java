package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Holiday;
import org.guce.siat.common.service.HolidayService;
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
 * The Class HolidayServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class HolidayServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(HolidayServiceTest.class);

	/** The Constant FIND_HOLIDAY_BY_DATE_01. */
	private static final String FIND_HOLIDAY_BY_DATE_01 = "findHolidayByDate_01";

	/** The Constant FIND_HOLIDAY_BY_DATE_02. */
	private static final String FIND_HOLIDAY_BY_DATE_02 = "findHolidayByDate_02";

	/** The Constant FIND_HOLIDAY_BY_DATE_03. */
	private static final String FIND_HOLIDAY_BY_DATE_03 = "findHolidayByDate_03";

	private static final String LABEL = "Nouvel an";


	/** The holiday service. */
	@Autowired
	private HolidayService holidayService;

	/**
	 * Find holiday by date_01.
	 */
	@Test
	public void findHolidayByDate_01()
	{
		final Calendar cal1 = Calendar.getInstance();
		cal1.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.ZERO, Constants.ONE);
		final Holiday holiday = holidayService.findHolidayByDate(cal1.getTime());
		assertNotNull(holiday);
		assertTrue(LABEL.equals(holiday.getLabel()));
		LOG.info(FIND_HOLIDAY_BY_DATE_01);
	}

	/**
	 * Find holiday by date_02.
	 */
	@Test
	public void findHolidayByDate_02()
	{
		final Calendar cal1 = Calendar.getInstance();
		cal1.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.ONE, Constants.ONE);
		final Holiday holiday = holidayService.findHolidayByDate(cal1.getTime());
		assertNull(holiday);
		LOG.info(FIND_HOLIDAY_BY_DATE_02);
	}

	/**
	 * Find holiday by date_03.
	 */
	@Test
	public void findHolidayByDate_03()
	{
		final Holiday holiday = holidayService.findHolidayByDate(null);
		assertNull(holiday);
		LOG.info(FIND_HOLIDAY_BY_DATE_03);
	}

	/**
	 * Find beaweentwo dates test case1.
	 *
	 * @throws java.text.ParseException
	 */
	@Test
	public void findBeaweentwoDatesTestCase1() throws java.text.ParseException
	{
		final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		final Date beginDate = dateFormat.parse("01/01/2015");
		final Date endDate = dateFormat.parse("31/12/2015");
		final List<Holiday> holidays = holidayService.findBetweenTwoDates(beginDate, endDate);
		Assert.assertTrue(Objects.equals(holidays.size(), 8));
	}

	/**
	 * Find beaweentwo dates test case2.
	 */
	@Test
	public void findBeaweentwoDatesTestCase2()
	{

		final List<Holiday> holidays = holidayService.findBetweenTwoDates(null, null);
		Assert.assertTrue(CollectionUtils.isEmpty(holidays));
	}
}
