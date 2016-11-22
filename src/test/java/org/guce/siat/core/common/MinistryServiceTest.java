package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.dao.exception.DAOException;
import org.guce.siat.common.model.Ministry;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.MinistryService;
import org.guce.siat.common.service.UserService;
import org.guce.siat.common.service.exception.BusinessException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class MinistryServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
@Transactional
public class MinistryServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(MinistryServiceTest.class);

	/** The Constant TEST_MINADER_SUBADMINISTRATIONS. */
	private static final String FIND_MINISTRY_BY_USER = "findMinistryByUser";

	/** The Constant HAS_MINISTRY_AFFECTED. */
	private static final String HAS_MINISTRY_AFFECTED = "hasMinistryAffected";

	/** The Constant HAS_GENERAl_SECRETARY_AFEECTED. */
	private static final String HAS_GENERAl_SECRETARY_AFEECTED = "MINADER a déja un secrtaire général affecté ";

	/** The Constant HAS_MINISTRY_WITH_NULL. */
	private static final String HAS_MINISTRY_WITH_NULL = "hasMinistyWithNull";

	/** The Constant HAS_GENERAl_SECRETARY_AFEECTED_WITH_NULL. */
	private static final String HAS_GENERAl_SECRETARY_AFEECTED_WITH_NULL = "hasSGAffectedWITHnull";

	/** The Constant MINISTRIES_HASNT_ADMIN. */
	private static final String MINISTRIES_HASNT_ADMIN = "ministriesHasNtAdmin";

	/** The ministry service. */
	@Autowired
	private MinistryService ministryService;

	/** The user service. */
	@Autowired
	private UserService userService;
	@PersistenceContext
	EntityManager em;

	/**
	 * Find ministry by user.
	 */
	@Test
	public void findMinistryByUser()
	{
		final User user = userService.find(10L);
		final Ministry ministry = ministryService.findMinistryByUser(user);
		assertNotNull(ministry);
		assertTrue(ministry.getId() == 27L);
		LOG.info(FIND_MINISTRY_BY_USER);

	}

	/**
	 * Minepia has minister affected.
	 */
	@Test
	public void minepiaHasMinisterAffected()
	{
		final Ministry minader = ministryService.find(1L);
		assertTrue(ministryService.hasMinisterAffected(minader));
		LOG.info(HAS_MINISTRY_AFFECTED);
	}

	/**
	 * Minepia has general secitary affected.
	 */
	@Test
	public void minepiaHasGeneralSecitaryAffected()
	{
		final Ministry minader = ministryService.find(1L);
		assertTrue(ministryService.hasSGAffected(minader));
		LOG.info(HAS_GENERAl_SECRETARY_AFEECTED);
	}

	/**
	 * Checks for ministy with null.
	 */
	@Test
	public void hasMinistyWithNull()
	{
		try
		{
			ministryService.hasMinisterAffected(null);
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof BusinessException);
			assertTrue(e.getCause() instanceof DAOException);
			assertTrue(e.getCause().getCause() instanceof NullPointerException);
		}
		LOG.info(HAS_MINISTRY_WITH_NULL);
	}

	/**
	 * Checks for sg affected with null.
	 */
	@Test
	public void hasSGAffectedWithNull()
	{
		try
		{
			ministryService.hasSGAffected(null);
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof BusinessException);
			assertTrue(e.getCause() instanceof DAOException);
			assertTrue(e.getCause().getCause() instanceof NullPointerException);
		}
		LOG.info(HAS_GENERAl_SECRETARY_AFEECTED_WITH_NULL);
	}

	/**
	 * Find minitries hasnt admin.
	 */
	@Test
	public void findMinitriesHasntAdmin()
	{
		final List<Ministry> ministries = ministryService.findMinistryHasntAdmin();
		assertTrue(CollectionUtils.isEmpty(ministries));
		LOG.info(MINISTRIES_HASNT_ADMIN);
	}

}
