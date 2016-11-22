package org.guce.siat.core.common;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.SubDepartment;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AdministrationService;
import org.guce.siat.common.service.SubDepartmentService;
import org.guce.siat.common.service.UserService;
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
 * The Class SubDepartmentServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class SubDepartmentServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(SubDepartmentServiceTest.class);

	/** The Constant BUREAU_CENTRAl_BY_ORGANISM. */
	private static final String FIND_BY_ORGANISM = "findSubDepartmentsByOrganism";

	/** The Constant FIND_BY_ORGANISM_WITH_NULL. */
	private static final String FIND_BY_ORGANISM_WITH_NULL = "findSubDepartmentsByOrganismWithNull";

	private static final String FIND_BY_USER = "findSubDepatmentByUser";

	/** The sub department service. */
	@Autowired
	private SubDepartmentService subDepartmentService;

	/** The administration service. */
	@Autowired
	private AdministrationService administrationService;

	/** The user service. */
	@Autowired
	private UserService userService;

	/**
	 * Find sub departments by organism.
	 */
	@Test
	public void findSubDepartmentsByOrganism()
	{
		final Administration organism = administrationService.find(Long.valueOf(Constants.TWO));
		assertTrue(organism instanceof Organism);
		final List<SubDepartment> subDepartments = subDepartmentService.findSubDepartmentsByOrganism((Organism) organism);
		Assert.assertTrue(CollectionUtils.isNotEmpty(subDepartments));
		LOG.info(FIND_BY_ORGANISM);
	}

	/**
	 * Find sub departments by organism with null.
	 */
	@Test
	public void findSubDepartmentsByOrganismWithNull()
	{
		final List<SubDepartment> subDepartments = subDepartmentService.findSubDepartmentsByOrganism(null);
		Assert.assertTrue(CollectionUtils.isEmpty(subDepartments));

		LOG.info(FIND_BY_ORGANISM_WITH_NULL);
	}



	/**
	 * Find sub department by user.
	 */
	@Test
	public void findSubDepartmentByUser()
	{
		final User user = userService.find(Long.valueOf(Constants.TWENTYEIGHT));
		final SubDepartment subDepartment = subDepartmentService.findSubDepartmentByUser(user);
		Assert.assertNotNull(subDepartment);

		LOG.info(FIND_BY_USER);
	}
}
