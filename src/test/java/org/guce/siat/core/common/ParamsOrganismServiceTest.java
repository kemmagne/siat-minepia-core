package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.ParamsOrganism;
import org.guce.siat.common.service.ParamsOrganismService;
import org.guce.siat.common.service.ParamsService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.enums.ParamsCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class ServiceTestTemp.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class ParamsOrganismServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ParamsOrganismServiceTest.class);

	/** The Constant FIND_PARAMS_ORGANISM_BY_ORGANISM_01. */
	private static final String FIND_PARAMS_ORGANISM_BY_ORGANISM_01 = "findParamsOrganismByOrganism_01";

	/** The Constant FIND_PARAMS_ORGANISM_BY_ORGANISM_02. */
	private static final String FIND_PARAMS_ORGANISM_BY_ORGANISM_02 = "findParamsOrganismByOrganism_02";

	/** The Constant FIND_PARAMS_ORGANISM_BY_ORGANISM_03. */
	private static final String FIND_PARAMS_ORGANISM_BY_ORGANISM_03 = "findParamsOrganismByOrganism_03";

	/** The Constant NEGATIVE_DECISION_PERIOD. */
	private static final String NEGATIVE_DECISION_PERIOD = "NegativeDecisionsPeriod";

	/** The Constant FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_01. */
	private static final String FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_01 = "findParamsOrganismByOrganismAndParam_01";

	/** The Constant FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_02. */
	private static final String FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_02 = "findParamsOrganismByOrganismAndParam_02";

	/** The Constant FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_03. */
	private static final String FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_03 = "findParamsOrganismByOrganismAndParam_03";

	/** The params organism service. */
	@Autowired
	ParamsOrganismService paramsOrganismService;

	/** The params service. */
	@Autowired
	ParamsService paramsService;


	/**
	 * Find params organism by organism_01.
	 */
	@Test
	public void findParamsOrganismByOrganism_01()
	{
		final List<ParamsOrganism> list = paramsOrganismService.findParamsOrganismByOrganism(new Organism(Long.valueOf(1)),
				ParamsCategory.GR);
		assertTrue(list.size() == Constants.ELEVEN);
		LOG.info(FIND_PARAMS_ORGANISM_BY_ORGANISM_01);
	}

	/**
	 * Find params organism by organism_02.
	 */
	@Test
	public void findParamsOrganismByOrganism_02()
	{
		try
		{
			final List<ParamsOrganism> list = paramsOrganismService.findParamsOrganismByOrganism(null, ParamsCategory.GR);
			assertNotNull(list);
			assertTrue(CollectionUtils.isNotEmpty(list));
			LOG.info(FIND_PARAMS_ORGANISM_BY_ORGANISM_02);
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
		}
	}

	/**
	 * Find params organism by organism_03.
	 */
	@Test
	public void findParamsOrganismByOrganism_03()
	{
		final List<ParamsOrganism> list = paramsOrganismService.findParamsOrganismByOrganism(new Organism(), ParamsCategory.GR);
		assertNotNull(list);
		assertTrue(CollectionUtils.isNotEmpty(list));
		LOG.info(FIND_PARAMS_ORGANISM_BY_ORGANISM_03);
	}

	/**
	 * Find params organism by organism and param_01.
	 */
	@Test
	public void findParamsOrganismByOrganismAndParam_01()
	{
		final ParamsOrganism paramOrganism = paramsOrganismService.findParamsOrganismByOrganismAndName(new Organism(2L),
				NEGATIVE_DECISION_PERIOD);
		assertNotNull(paramOrganism);
		assertTrue(paramOrganism.getParam().getName().equals(NEGATIVE_DECISION_PERIOD));
		LOG.info(FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_01);
	}

	/**
	 * Find params organism by organism and param_02.
	 */
	@Test
	public void findParamsOrganismByOrganismAndParam_02()
	{
		final ParamsOrganism paramOrganism = paramsOrganismService.findParamsOrganismByOrganismAndName(new Organism(),
				NEGATIVE_DECISION_PERIOD);
		assertNull(paramOrganism);
		LOG.info(FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_02);
	}

	/**
	 * Find params organism by organism and param_03.
	 */
	@Test
	public void findParamsOrganismByOrganismAndParam_03()
	{
		try
		{
			final ParamsOrganism paramOrganism = paramsOrganismService.findParamsOrganismByOrganismAndName(null,
					NEGATIVE_DECISION_PERIOD);
			assertNull(paramOrganism);
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
		}
		LOG.info(FIND_PARAMS_ORGANISMBYORGANISM_AND_PARAM_03);
	}
}
