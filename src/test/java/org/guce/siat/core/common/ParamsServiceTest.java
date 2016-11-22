package org.guce.siat.core.common;

import java.util.List;

import javax.persistence.NoResultException;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Params;
import org.guce.siat.common.service.ParamsService;
import org.guce.siat.common.utils.enums.ParamsCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class ParamsServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class ParamsServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ServiceServiceTest.class);

	/** The Constant FIND_SERVICE_BY_USER_01. */
	private static final String FIND_WITH_EXIST_PARAM_NAME = "findWithExistParamName";

	/** The Constant FIND_WITH_EXIST_PARAM_NAME. */
	private static final String FIND_WITH_NOT_EXIST_PARAM_NAME = "findWithNotExistParamName";

	/** The Constant FIND_BY_CATEGORY_GN. */
	private static final String FIND_BY_CATEGORY_GN = "findByCategoryGN";

	/** The Constant FIND_BY_CATEGORY_GR. */
	private static final String FIND_BY_CATEGORY_GR = "findByCategoryGR";

	/** The Constant EXIST_PARAM_NAME. */
	static final String EXIST_PARAM_NAME = "NegativeDecisionsPeriod";


	/** The Constant NOT_EXIST_PARAM_NAME. */
	static final String NOT_EXIST_PARAM_NAME = "Negative@DECISIONS@Period";

	/** The params service. */
	@Autowired
	private ParamsService paramsService;

	/**
	 * Find params by name.
	 */
	@Test
	public void findWithExistParamName()
	{
		final Params param = paramsService.findParamsByName(EXIST_PARAM_NAME);
		Assert.assertNotNull(param);
		LOG.info(FIND_WITH_EXIST_PARAM_NAME);
	}

	/**
	 * Find with not exist param name.
	 */
	@Test
	public void findWithNotExistParamName()
	{
		try
		{
			paramsService.findParamsByName(NOT_EXIST_PARAM_NAME);
		}
		catch (final Exception e)
		{
			Assert.assertTrue(e.getCause() instanceof NoResultException);
		}


		LOG.info(FIND_WITH_NOT_EXIST_PARAM_NAME);
	}

	/**
	 * Find params by category.
	 */
	@Test
	public void findParamsByCategoryGN()
	{
		final List<Params> params = paramsService.findParamsByCategory(ParamsCategory.GN);
		Assert.assertTrue(CollectionUtils.isNotEmpty(params));
		LOG.info(FIND_BY_CATEGORY_GN);
	}

	/**
	 * Find params by category.
	 */
	@Test
	public void findParamsByCategoryGR()
	{
		final List<Params> params = paramsService.findParamsByCategory(ParamsCategory.GR);
		Assert.assertTrue(CollectionUtils.isNotEmpty(params));
		LOG.info(FIND_BY_CATEGORY_GR);
	}
}
