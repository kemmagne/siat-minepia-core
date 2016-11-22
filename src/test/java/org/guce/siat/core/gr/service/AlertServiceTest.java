package org.guce.siat.core.gr.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.FileItemService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.core.gr.model.Alert;
import org.guce.siat.core.gr.utils.filter.AlertFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class AlertServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class AlertServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AlertServiceTest.class);

	/** The Constant FIND_ALERT_FOR_RISK_MANAGMENT_01. */
	private static final String FIND_ALERT_FOR_RISK_MANAGMENT_01 = "findAlertForRiskManagment_01";

	/** The Constant FIND_ALERT_FOR_RISK_MANAGMENT_02. */
	private static final String FIND_ALERT_FOR_RISK_MANAGMENT_02 = "findAlertForRiskManagment_02";
	//
	//	/** The Constant FIND_ALERT_FOR_RISK_MANAGMENT_02. */
	//	private static final String FIND_ALERT_FOR_RISK_MANAGMENT_02 = "findAlertForRiskManagment_02";

	/** The Constant FIND_By_Filter_01. */
	private static final String FIND_By_Filter_01 = "finByFilter_01";

	/** The Constant FIND_By_Filter_02. */
	private static final String FIND_By_Filter_02 = "finByFilter_02";

	/** The Constant FIND_By_Filter_03. */
	private static final String FIND_By_Filter_03 = "finByFilter_03";

	/** The Constant FIND_By_Filter_04. */
	private static final String FIND_By_Filter_04 = "finByFilter_04";

	/** The alert service. */
	@Autowired
	private AlertService alertService;

	/** The file item service. */
	@Autowired
	private FileItemService fileItemService;

	/**
	 * Find alert for risk managment_01.
	 */
	@Test
	public void findAlertForRiskManagment_01()
	{
		final FileItem fileItem = fileItemService.find(1L);
		final List<Alert> alertList = alertService.findAlertForRiskManagment(fileItem);
		assertTrue(CollectionUtils.isEmpty(alertList));
		LOG.info(FIND_ALERT_FOR_RISK_MANAGMENT_01);
	}

	/**
	 * Find alert for risk managment_02.
	 */
	@Test
	public void findAlertForRiskManagment_02()
	{
		final FileItem fileItem = fileItemService.find(2L);
		final List<Alert> alertList = alertService.findAlertForRiskManagment(fileItem);

		assertTrue(CollectionUtils.isNotEmpty(alertList));
		assertTrue(Long.valueOf(Constants.ONE).equals(alertList.get(0).getId()));
		assertTrue(Long.valueOf(Constants.TWO).equals(alertList.get(1).getId()));
		LOG.info(FIND_ALERT_FOR_RISK_MANAGMENT_02);
	}

	/**
	 * Find by filter_01.
	 *
	 * @throws ParseException
	 *            the parse exception
	 */
	@Test
	public void findByFilter_01() throws ParseException
	{
		final Calendar calendar = Calendar.getInstance();
		calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.ONE);

		final Date beginDate = calendar.getTime();

		calendar.set(Constants.TWO_THOUSAND_AND_SIXTY, Constants.NINE, Constants.TWENTYONE);
		final Date endDate = calendar.getTime();

		final AlertFilter filter = new AlertFilter();

		filter.setBeginDate(beginDate);
		filter.setEndDate(endDate);

		final List<Alert> alertList = alertService.findByFilter(filter);
		assertTrue(CollectionUtils.isNotEmpty(alertList));
		assertEquals(4, alertList.size());
		assertTrue(Long.valueOf(Constants.ONE).equals(alertList.get(0).getId()));
		assertTrue(Long.valueOf(Constants.TWO).equals(alertList.get(1).getId()));
		assertTrue(Long.valueOf(Constants.THREE).equals(alertList.get(2).getId()));
		assertTrue(Long.valueOf(Constants.FOUR).equals(alertList.get(3).getId()));

		LOG.info(FIND_By_Filter_01);
	}

	/**
	 * Find by filter_02.
	 *
	 * @throws ParseException
	 *            the parse exception
	 */
	@Test
	public void findByFilter_02() throws ParseException
	{
		final Calendar calendar = Calendar.getInstance();

		calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.THREE);
		final Date beginDate = calendar.getTime();

		final Date endDate = null;

		final AlertFilter filter = new AlertFilter();

		filter.setBeginDate(beginDate);
		filter.setEndDate(endDate);

		final List<Alert> alertList = alertService.findByFilter(filter);
		assertTrue(CollectionUtils.isNotEmpty(alertList));
		assertEquals(2, alertList.size());
		assertTrue(Long.valueOf(Constants.THREE).equals(alertList.get(0).getId()));
		assertTrue(Long.valueOf(Constants.FOUR).equals(alertList.get(1).getId()));
		LOG.info(FIND_By_Filter_02);
	}

	/**
	 * Find by filter_03.
	 */
	@Test
	public void findByFilter_03()
	{
		final Date beginDate = null;

		final Calendar calendar = Calendar.getInstance();
		calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.TWENTYONE);

		final Date endDate = calendar.getTime();

		final AlertFilter filter = new AlertFilter();

		filter.setBeginDate(beginDate);
		filter.setEndDate(endDate);

		final List<Alert> alertList = alertService.findByFilter(filter);

		assertTrue(CollectionUtils.isNotEmpty(alertList));
		assertEquals(1, alertList.size());
		assertTrue(Long.valueOf(Constants.THREE).equals(alertList.get(0).getId()));

		LOG.info(FIND_By_Filter_03);
	}

	/**
	 * Find by filter_04.
	 */
	@Test
	public void findByFilter_04()
	{
		final Date beginDate = null;
		final Date endDate = null;
		final AlertFilter filter = new AlertFilter();

		filter.setBeginDate(beginDate);
		filter.setEndDate(endDate);

		final List<Alert> alertList = alertService.findByFilter(filter);
		assertTrue(CollectionUtils.isNotEmpty(alertList));
		assertEquals(4, alertList.size());
		assertTrue(Long.valueOf(Constants.ONE).equals(alertList.get(0).getId()));
		assertTrue(Long.valueOf(Constants.TWO).equals(alertList.get(1).getId()));
		assertTrue(Long.valueOf(Constants.THREE).equals(alertList.get(2).getId()));
		assertTrue(Long.valueOf(Constants.FOUR).equals(alertList.get(3).getId()));
		LOG.info(FIND_By_Filter_04);

	}

}
