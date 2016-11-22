package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Authority;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.service.AuthorityService;
import org.guce.siat.common.service.FileTypeService;
import org.guce.siat.common.service.StepService;
import org.guce.siat.common.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



/**
 * The Class CountryServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class StepServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(StepServiceTest.class);

	/** The Constant FIND_BY_AUTHORITY_01. */
	private static final String FIND_BY_AUTHORITY_01 = "findByAuthority_01";

	/** The Constant FIND_BY_AUTHORITY_02. */
	private static final String FIND_BY_AUTHORITY_02 = "findByAuthority_02";

	/** The Constant FIND_BY_AUTHORITY_03. */
	private static final String FIND_BY_AUTHORITY_03 = "findByAuthority_03";


	/** The step service. */
	@Autowired
	private StepService stepService;

	/** The authority service. */
	@Autowired
	private AuthorityService authorityService;

	/** The file type service. */
	@Autowired
	private FileTypeService fileTypeService;

	/**
	 * Find by authority_01.
	 */
	@Test
	public void findByAuthority_01()
	{
		final Authority authority = authorityService.find(Long.valueOf(Constants.TWELVE));
		final List<Step> steps = stepService.findByAuthority(authority);
		assertTrue(CollectionUtils.isNotEmpty(steps));
		assertTrue(steps.size() == Long.valueOf(Constants.SEVEN));
		assertTrue(steps.get(Constants.ZERO).getId() == Long.valueOf(Constants.TWO));
		assertTrue(steps.get(Constants.ONE).getId() == Long.valueOf(Constants.TEN));
		assertTrue(steps.get(Constants.TWO).getId() == Long.valueOf(Constants.SIXTEEN));
		assertTrue(steps.get(Constants.THREE).getId() == Long.valueOf(Constants.TWENTY));
		assertTrue(steps.get(Constants.FOUR).getId() == Long.valueOf(Constants.TWENTYTWO));
		assertTrue(steps.get(Constants.FIVE).getId() == Long.valueOf(Constants.TWENTYFOUR));
		assertTrue(steps.get(Constants.SIX).getId() == Long.valueOf(Constants.ONE_HUNDRED_AND_FOUR));

		LOG.info(FIND_BY_AUTHORITY_01);
	}

	/**
	 * Find by authority_02.
	 */
	@Test
	public void findByAuthority_02()
	{
		final Authority authority = authorityService.find(Long.valueOf(Constants.FIVE));
		final List<Step> steps = stepService.findByAuthority(authority);
		assertNotNull(steps);
		assertTrue(CollectionUtils.isEmpty(steps));

		LOG.info(FIND_BY_AUTHORITY_02);
	}

	/**
	 * Find by authority_03.
	 */
	@Test
	public void findByAuthority_03()
	{
		final List<Step> steps = stepService.findByAuthority(null);
		assertNotNull(steps);
		assertTrue(CollectionUtils.isEmpty(steps));

		LOG.info(FIND_BY_AUTHORITY_03);
	}




}
