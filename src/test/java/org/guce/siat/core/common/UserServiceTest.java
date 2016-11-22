package org.guce.siat.core.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.service.ServiceService;
import org.guce.siat.common.service.UserService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.common.utils.enums.PositionType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class UserServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class UserServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(UserServiceTest.class);

	/** The Constant USERNAME. */
	private static final String USERNAME = "ROOT";

	/** The Constant ROLE. */
	private static final String ROOT = "ROOT";

	/** The Constant ADMIN_MIN. */
	private static final String ADMIN_MIN = "ADMIN_MIN";

	/** The admin org. */
	private static String ADMIN_ORG = "ADMIN_ORG";

	/** The Constant MAIL. */
	private static final String MAIL = "ct-root@siat.com";

	/** The Constant FIND_BY_LOGIN_01. */
	private static final String FIND_BY_LOGIN_01 = "findByLogin_01";

	/** The Constant FIND_ACTIVE_USERS_BY_ROLE. */
	private static final String FIND_ACTIVE_USERS_BY_ROLE = "findActiveUsersByRole";

	/** The user service. */
	@Autowired
	private UserService userService;

	/** The organism service. */
	@Autowired
	private OrganismService organismService;

	/** The service service. */
	@Autowired
	private ServiceService serviceService;


	/**
	 * Find by login_01.
	 */
	@Test
	public void findByLogin_01()
	{
		final User user = userService.findByLogin(USERNAME);
		assertNotNull(user);
		LOG.info(FIND_BY_LOGIN_01);
	}

	/**
	 * Find active users by role.
	 */
	@Test
	public void findActiveUsersByRole()
	{
		final List<User> userList = userService.findUsersByAuthorities(ROOT);
		assertNotNull(CollectionUtils.isNotEmpty(userList));
		assertTrue(userList.size() == Constants.ONE);
		assertFalse(userList.get(0).getDeleted());
		assertTrue(userList.get(0).getAccountNonExpired());
		assertTrue(userList.get(0).getAccountNonLocked());
		LOG.info(FIND_ACTIVE_USERS_BY_ROLE);
	}

	/**
	 * Find active users by roles.
	 */
	@Test
	public void findActiveUsersByRoles()
	{
		final String[] roles =
		{ ROOT, ADMIN_MIN, ADMIN_ORG };
		final List<User> userList = userService.findUsersByAuthorities(roles);
		assertTrue(CollectionUtils.isNotEmpty(userList));

		LOG.info(FIND_ACTIVE_USERS_BY_ROLE);
	}

	/**
	 * Find by mail.
	 */
	@Test
	public void findByMail()
	{
		final User user = userService.findByMail(MAIL);
		assertNotNull(user);
		LOG.info(user.getEmail());
	}

	/**
	 * Find users by administration and positions.
	 */
	@Test
	public void findUsersByAdministrationAndOnePosition()
	{
		final Organism organism = organismService.find(2L);
		assertNotNull(organism);
		final List<User> usersList = userService.findUsersByAdministrationAndPositions(organism, PositionType.ADMINISTRATEUR);
		assertTrue(usersList.size() == Constants.ONE);
	}


	/**
	 * Find users by administration and two positions.
	 */
	@Test
	public void findUsersByAdministrationAndTwoPositions()
	{
		final Organism organism = organismService.find(2L);
		assertNotNull(organism);
		final List<User> usersList = userService.findUsersByAdministrationAndPositions(organism, PositionType.ADMINISTRATEUR,
				PositionType.DIRECTEUR);
		assertTrue(usersList.size() == Constants.TWO);
	}

	/**
	 * Find controleurs by service.
	 */
	@Test
	public void findControleursByService()
	{
		final Service service = serviceService.find(5L);
		assertNotNull(service);
		final List<User> controllers = userService.findControleursByService(service);
		assertTrue(CollectionUtils.isNotEmpty(controllers));
	}
}
