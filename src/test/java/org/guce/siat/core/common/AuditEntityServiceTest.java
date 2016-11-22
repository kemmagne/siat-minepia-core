package org.guce.siat.core.common;

import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.AuditEntity;
import org.guce.siat.common.service.AuditEntityService;
import org.guce.siat.common.service.CarService;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.filter.AuditFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class AuditEntityServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class AuditEntityServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AuditEntityServiceTest.class);

	/** The Constant FIND_BY_FILTER_01. */
	private static final String FIND_BY_FILTER_01 = "findByFilter_01";

	private static final String FIND_BY_MODEL = "findByModel";

	/** The Constant FIND_BY_FILTER_02. */
	private static final String FIND_BY_FILTER_02 = "findByFilter_02";

	/** The Constant FIND_BY_FILTER_03. */
	private static final String FIND_BY_FILTER_03 = "findByFilter_03";

	/** The Constant FIND_BY_FILTER_AND_MODEL_01. */
	private static final String FIND_BY_FILTER_AND_MODEL_01 = "findByFilterAndModel_01";

	/** The Constant FIND_BY_FILTER_AND_MODEL_02. */
	private static final String FIND_BY_FILTER_AND_MODEL_02 = "findByFilterAndModel_02";

	/** The Constant FIND_BY_FILTER_AND_MODEL_03. */
	private static final String FIND_BY_FILTER_AND_MODEL_03 = "findByFilterAndModel_03";



	/** The Constant HOURLY_TYPE. */
	private static final String HOURLY_TYPE = "HourlyType";

	/** The Constant YEAR. */
	private static final int YEAR = 2015;

	/** The audit entity service. */
	@Autowired
	private AuditEntityService auditEntityService;

	/** The car service. */
	@Autowired
	private CarService carService;

	/** The organism service. */
	@Autowired
	private OrganismService organismService;


	/**
	 * Find by filter_01. When parameter method is null we must check if the returned is not null
	 */
	@Test
	public void findByFilter_01()
	{
		final Calendar cal = Calendar.getInstance();
		final AuditFilter filter = new AuditFilter();
		cal.set(YEAR, Constants.ZERO, Constants.ONE);
		filter.setBeginDate(cal.getTime());
		cal.set(YEAR, Constants.ELEVEN, Constants.THIRTYONE);
		filter.setEndDate(cal.getTime());
		final List<AuditEntity> auditEntityList = auditEntityService.findByFilter(filter);
		assertTrue(CollectionUtils.isNotEmpty(auditEntityList));
		LOG.info(FIND_BY_FILTER_01);

	}

	/**
	 * Find by filter_02.
	 */
	@Test
	public void findByFilter_02()
	{
		final AuditFilter filter = new AuditFilter();
		final List<AuditEntity> auditEntityList = auditEntityService.findByFilter(filter);
		assertTrue(CollectionUtils.isNotEmpty(auditEntityList));
		LOG.info(FIND_BY_FILTER_02);
	}

	/**
	 * Find by filtre_03.
	 */
	@Test
	public void findByFiltre_03()
	{
		try
		{
			final AuditFilter filter = null;
			final List<AuditEntity> auditEntityList = auditEntityService.findByFilter(filter);
			assertTrue(CollectionUtils.isNotEmpty(auditEntityList));
			LOG.info(null, auditEntityList.size());
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
			LOG.info(FIND_BY_FILTER_03);
		}

	}

	/**
	 * Find by filter and model_01.
	 */
	@Test
	public void findByFilterAndModel_01()
	{
		final Calendar cal = Calendar.getInstance();
		final AuditFilter filter = new AuditFilter();
		cal.set(YEAR, Constants.ZERO, Constants.ONE);
		filter.setBeginDate(cal.getTime());
		cal.set(YEAR, Constants.ELEVEN, Constants.THIRTYONE);
		filter.setEndDate(cal.getTime());
		final List<AuditEntity> auditEntityList = auditEntityService.findByFilterAndModel(filter, HOURLY_TYPE);
		assertTrue(CollectionUtils.isNotEmpty(auditEntityList));
		LOG.info(FIND_BY_FILTER_AND_MODEL_01);
	}

	/**
	 * Find by filter and model_02.
	 */
	@Test
	public void findByFilterAndModel_02()
	{
		final AuditFilter filter = new AuditFilter();
		final List<AuditEntity> auditEntityList = auditEntityService.findByFilterAndModel(filter, null);
		assertTrue(CollectionUtils.isEmpty(auditEntityList));
		LOG.info(FIND_BY_FILTER_AND_MODEL_02);
	}

	/**
	 * Find by filter and model_03.
	 */
	@Test
	public void findByFilterAndModel_03()
	{
		try
		{
			final AuditFilter filter = null;
			final List<AuditEntity> auditEntityList = auditEntityService.findByFilterAndModel(filter, null);
			assertTrue(CollectionUtils.isNotEmpty(auditEntityList));
			LOG.info(null, auditEntityList.size());
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
			LOG.info(FIND_BY_FILTER_AND_MODEL_03);
		}
	}


	/**
	 * Find by model_01.
	 */
	@Test
	public void findByModel_01()
	{
		final List<AuditEntity> auditEntityList = auditEntityService.findByModel(HOURLY_TYPE);
		assertTrue(CollectionUtils.isNotEmpty(auditEntityList));
		LOG.info(FIND_BY_MODEL);

	}


}
