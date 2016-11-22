package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Ministry;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.model.SubDepartment;
import org.guce.siat.common.service.AdministrationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class AdministrationServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class AdministrationServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(AdministrationServiceTest.class);

	/** The Constant TEST_MINADER_SUBADMINISTRATIONS. */
	private static final String TEST_MINADER_SUBADMINISTRATIONS = "getMINADERSubAdministrationsTest";

	/** The Constant TEST_DRCQIPA_SUBADMINISTRATIONS. */
	private static final String TEST_DRCQIPA_SUBADMINISTRATIONS = "getMINADERSubAdministrationsTest";

	/** The Constant TEST_SDRPEAT_SUBADMINISTRATIONS. */
	private static final String TEST_SDRPEAT_SUBADMINISTRATIONS = "getSDRPEATSubAdministrationsTest";

	/** The Constant TEST_SRP_SUBADMINISTRATIONS. */
	private static final String TEST_SRP_SUBADMINISTRATIONS = "getSRPSubAdministrationsTest";

	/** The administration service. */
	@Autowired
	private AdministrationService administrationService;

	/**
	 * Gets the MINADER sub administrations test.
	 *
	 * test the MINADER sub administrations test
	 */
	@Test
	public void getMINADERSubAdministrationsTest()
	{
		final Administration minader = administrationService.find(1L);
		assertNotNull(minader);
		assertTrue(minader instanceof Ministry);
		final List<Administration> subAdministrations = administrationService.getSubAdministrationByAdministration(minader);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
		LOG.debug(TEST_MINADER_SUBADMINISTRATIONS);
	}

	/**
	 * test the DRCQIPA sub administrations test
	 */
	@Test
	public void getDRCQIPASubAdministrationsTest()
	{
		//Organism DRCQIPA
		final Administration organism = administrationService.find(2L);
		assertNotNull(organism);
		assertTrue(organism instanceof Organism);
		final List<Administration> subAdministrations = administrationService.getSubAdministrationByAdministration(organism);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
		LOG.debug(TEST_DRCQIPA_SUBADMINISTRATIONS);
	}

	/**
	 * Gets the SDRPEAT sub administrations test.
	 *
	 * test the SDRPEAT sub administrations test
	 */
	@Test
	public void getSDRPEATSubAdministrationsTest()
	{
		//Organism DRCQIPA
		final Administration subDepartment = administrationService.find(6L);
		assertNotNull(subDepartment);
		assertTrue(subDepartment instanceof SubDepartment);
		final List<Administration> subAdministrations = administrationService.getSubAdministrationByAdministration(subDepartment);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
		LOG.debug(TEST_SDRPEAT_SUBADMINISTRATIONS);
	}

	/**
	 * test the SRP sub administrations test
	 */
	@Test
	public void getSRPSubAdministrationsTest()
	{
		//Service SRP
		final Administration service = administrationService.find(9L);
		assertNotNull(service);
		assertTrue(service instanceof Service);
		final List<Administration> subAdministrations = administrationService.getSubAdministrationByAdministration(service);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
		LOG.debug(TEST_SRP_SUBADMINISTRATIONS);
	}

	/**
	 * Gets the MINADER recursive sub administrations test.
	 *
	 * test the MINADER recursive sub administrations test
	 */
	@Test
	public void getMINADERRecursiveSubAdministrationsTest()
	{
		final Administration minader = administrationService.find(1L);
		assertNotNull(minader);
		assertTrue(minader instanceof Ministry);
		final List<Administration> subAdministrations = administrationService
				.getRecursiveSubAdministrationByAdministration(minader);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
	}

	/**
	 * test the DRCQIPA sub administrations Recursive
	 */
	@Test
	public void getDRCQIPARecursiveSubAdministrationsTest()
	{
		//Organism DRCQIPA
		final Administration organism = administrationService.find(Long.valueOf(2));
		assertNotNull(organism);
		assertTrue(organism instanceof Organism);
		final List<Administration> subAdministrations = administrationService
				.getRecursiveSubAdministrationByAdministration(organism);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
	}

	/**
	 * Gets the SDRPEAT sub administrations test.
	 *
	 * test the SDRPEAT sub administrations Recursive
	 */
	@Test
	public void getSDRPEATRecursiveSubAdministrationsTest()
	{
		//Organism DRCQIPA
		final Administration subDepartment = administrationService.find(6L);
		assertNotNull(subDepartment);
		assertTrue(subDepartment instanceof SubDepartment);
		final List<Administration> subAdministrations = administrationService
				.getRecursiveSubAdministrationByAdministration(subDepartment);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
	}

	/**
	 * test the SRP sub administrations Recursive
	 */
	@Test
	public void getSRPRecursiveSubAdministrationsTest()
	{
		//Service SRP
		final Administration service = administrationService.find(9L);
		assertNotNull(service);
		assertTrue(service instanceof Service);
		final List<Administration> subAdministrations = administrationService
				.getRecursiveSubAdministrationByAdministration(service);
		assertTrue(CollectionUtils.isNotEmpty(subAdministrations));
	}
}
