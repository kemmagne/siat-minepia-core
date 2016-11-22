package org.guce.siat.core.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Delegation;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.DelegationService;
import org.guce.siat.common.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class DelegationServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class DelegationServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(DelegationServiceTest.class);

	/** The Constant FIND_DELEGATION_DATE_BY_USER_01. */
	private static final String FIND_DELEGATION_DATE_BY_USER_01 = "findDelegationDateByUsers_01";

	/** The Constant FIND_DELEGATION_BY_USER_AND_LOGGEDUSER_02. */
	private static final String FIND_DELEGATION_BY_USER_AND_LOGGEDUSER_02 = "findDelegationByUserAndCurrentDate_02";

	/** The Constant FIND_DELEGATION_BY_USER_AND_CURRENT_DATE. */
	private static final String FIND_DELEGATION_BY_USER_AND_CURRENT_DATE = "findDelegationByUserAndCurrentDate";


	/** The Constant YEAR. */
	private static final int YEAR = 2015;

	/** The delegation service. */
	@Autowired
	private DelegationService delegationService;

	/**
	 * Gets the delegation service.
	 *
	 * @return the delegationService
	 */
	public DelegationService getDelegationService()
	{
		return delegationService;
	}

	/**
	 * Sets the delegation service.
	 *
	 * @param delegationService
	 *           the delegationService to set
	 */
	public void setDelegationService(final DelegationService delegationService)
	{
		this.delegationService = delegationService;
	}

	/**
	 * Find delegation date by users_01.
	 */
	@Test
	public void findDelegationDateByUsers_01()
	{
		final User toUser = new User();
		toUser.setId(Long.valueOf(20));
		final Calendar cal = Calendar.getInstance();
		cal.set(YEAR, Constants.ZERO, Constants.ONE);
		final Date bDate = cal.getTime();
		cal.set(YEAR, Constants.ELEVEN, Constants.THIRTYONE);
		final Date eDate = cal.getTime();
		final List<Delegation> delegationList = delegationService.findDelegationByDateByFromUsers(toUser, bDate, eDate);

		assertTrue(delegationList.size() == Constants.ONE);
		assertEquals(Long.valueOf(1), delegationList.get(0).getId());
		assertEquals(Long.valueOf(20), delegationList.get(0).getFromUser().getId());
		assertEquals(Long.valueOf(30), delegationList.get(0).getToUser().getId());
		LOG.info(FIND_DELEGATION_DATE_BY_USER_01);
	}

	/**
	 * Find delegation date by users_02.
	 */
	@Test
	public void findDelegationDateByUsers_02()
	{
		final User toUser = new User();
		final Calendar cal = Calendar.getInstance();
		cal.set(YEAR, Constants.ZERO, Constants.ONE);
		final Date bDate = cal.getTime();
		cal.set(YEAR, Constants.ELEVEN, Constants.THIRTYONE);
		final Date eDate = cal.getTime();
		final List<Delegation> delegationList = delegationService.findDelegationByDateByFromUsers(toUser, bDate, eDate);

		assertTrue(delegationList.isEmpty());
		LOG.info(FIND_DELEGATION_BY_USER_AND_LOGGEDUSER_02);
	}


	/**
	 * Find delegation by user and current date. Assert for each delegation returned that it's delegation.toUser id is
	 * equal to the parametre id and the current date is in between delegation.beginDate and delegation.endDate
	 */
	@Test
	public void findDelegationByUserAndCurrentDate()
	{
		final User user = new User();
		user.setId(Long.valueOf(49));

		final List<Delegation> delegationList = delegationService.findDelegationByUserAndCurrentDate(user);

		assertTrue(CollectionUtils.isNotEmpty(delegationList));
		assertEquals(Long.valueOf(2), delegationList.get(0).getId());
		assertEquals(Long.valueOf(2), delegationList.get(0).getFromUser().getId());
		assertEquals(Long.valueOf(49), delegationList.get(0).getToUser().getId());
		LOG.info(FIND_DELEGATION_BY_USER_AND_CURRENT_DATE);
	}

}
