package org.guce.siat.core.common;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Authority;
import org.guce.siat.common.service.AuthorityService;
import org.guce.siat.common.utils.enums.PositionType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class AuthorityServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class AuthorityServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AuthorityServiceTest.class);

	/** The Constant FIND_AUTHORITIES_BY_AUTHORITYLIST_01. */
	private static final String FIND_AUTHORITIES_BY_AUTHORITYLIST_01 = "findAuthoritiesByAuthorityList_01";

	/** The Constant FIND_AUTHORITIES_BY_AUTHORITYLIST_02. */
	private static final String FIND_AUTHORITIES_BY_AUTHORITYLIST_02 = "findAuthoritiesByAuthorityList_02";
	private static final String FIND_DISTINCT_AUTORITIES_BY_POSITION = "findDistinctAutoritiesByPosition";

	/** The Constant ROOT. */
	private static final String ROOT = "ROOT";

	/** The Constant ADMIN. */
	private static final String ADMIN = "ADMIN";

	/** The Constant SUPER. */
	private static final String SUPER = "SUPER";

	/** The Constant AR. */
	private static final String AR = "AR";

	/** The Constant INS. */
	private static final String INS = "INS";


	/** The Constant FIND_AUTHORITIES_BY_AUTHORITYLIST_03. */

	@Autowired
	private AuthorityService authorityService;

	/**
	 * Find authorities by authority list_01.
	 */
	@Test
	public void findAuthoritiesByAuthorityList_01()
	{
		final List<String> authorityList = Arrays.asList(ROOT, ADMIN, SUPER, AR, INS);
		final List<Authority> AuthorityList = authorityService.findAuthoritiesByAuthorityList(authorityList);
		assertTrue(CollectionUtils.isNotEmpty(AuthorityList));
		LOG.info(FIND_AUTHORITIES_BY_AUTHORITYLIST_01);
	}


	/**
	 * Find authorities by authority list_02.
	 */
	@Test
	public void findAuthoritiesByAuthorityList_02()
	{
		try
		{
			final List<String> authorityList = null;
			final List<Authority> AuthorityList = authorityService.findAuthoritiesByAuthorityList(authorityList);
			assertTrue(CollectionUtils.isEmpty(AuthorityList));
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
			LOG.info(FIND_AUTHORITIES_BY_AUTHORITYLIST_02);
		}
	}

	/**
	 * Find distinct autorities by position.
	 */
	public void findDistinctAutoritiesByPositionDirector()
	{
		final List<Authority> authorities = authorityService.findDistinctAutoritiesByPosition(PositionType.DIRECTEUR);
		assertTrue(CollectionUtils.isNotEmpty(authorities));
		LOG.info(FIND_DISTINCT_AUTORITIES_BY_POSITION);
	}

	/**
	 * Find distinct autorities by position agent.
	 */
	public void findDistinctAutoritiesByPositionAgent()
	{
		final List<Authority> authorities = authorityService.findDistinctAutoritiesByPosition(PositionType.AGENT);
		assertTrue(CollectionUtils.isNotEmpty(authorities));
		LOG.info(FIND_DISTINCT_AUTORITIES_BY_POSITION);
	}



}
