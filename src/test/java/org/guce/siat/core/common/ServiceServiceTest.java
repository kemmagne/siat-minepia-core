package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Entity;
import org.guce.siat.common.model.Ministry;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.model.SubDepartment;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.AdministrationService;
import org.guce.siat.common.service.EntityService;
import org.guce.siat.common.service.MinistryService;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.service.ServiceService;
import org.guce.siat.common.service.SubDepartmentService;
import org.guce.siat.common.service.UserService;
import org.guce.siat.common.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class ServiceServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class ServiceServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ServiceServiceTest.class);

	/** The Constant FIND_SERVICE_BY_USER_01. */
	private static final String FIND_SERVICE_BY_USER_01 = "findServiceByUser_01";

	/** The Constant FIND_SERVICE_BY_USER_02. */
	private static final String FIND_SERVICE_BY_USER_02 = "findServiceByUser_02";

	/** The Constant FIND_SERVICE_BY_USER_03. */
	private static final String FIND_SERVICE_BY_USER_03 = "findServiceByUser_03";

	/** The Constant FIND_SERVICES_BY_ORGANISM_01. */
	private static final String FIND_SERVICEs_BY_ORGANISM_01 = "findServicesByOrganism_01";

	/** The Constant FIND_SERVICES_BY_ORGANISM_02. */
	private static final String FIND_SERVICES_BY_ORGANISM_02 = "findServicesByOrganism_02";

	/** The Constant FIND_SERVICES_BY_ORGANISM_03. */
	private static final String FIND_SERVICES_BY_ORGANISM_03 = "findServicesByOrganism_03";

	/** The Constant FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_01. */
	private static final String FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_01 = "findNonAffectedServicesBySubdepartment_01";

	/** The Constant FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_02. */
	private static final String FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_02 = "findNonAffectedServicesBySubdepartment_02";

	/** The Constant FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_03. */
	private static final String FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_03 = "findNonAffectedServicesBySubdepartment_03";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_01. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_01 = "findServicesIdsByAdministration_01";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_02. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_02 = "findServicesIdsByAdministration_02";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_03. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_03 = "findServicesIdsByAdministration_03";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_04. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_04 = "findServicesIdsByAdministration_04";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_05. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_05 = "findServicesIdsByAdministration_05";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_06. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_06 = "findServicesIdsByAdministration_06";

	/** The Constant FIND_SERVICES_IDS_BY_ADMINISTRATION_07. */
	private static final String FIND_SERVICES_IDS_BY_ADMINISTRATION_07 = "findServicesIdsByAdministration_07";

	/** The user service. */
	@Autowired
	UserService userService;

	/** The administration service. */
	@Autowired
	AdministrationService administrationService;

	/** The ministry service. */
	@Autowired
	MinistryService ministryService;

	/** The organism service. */
	@Autowired
	OrganismService organismService;

	/** The sub department service. */
	@Autowired
	SubDepartmentService subDepartmentService;

	/** The service service. */
	@Autowired
	ServiceService serviceService;

	/** The entity service. */
	@Autowired
	EntityService entityService;

	/**
	 * Find service by user_01.
	 */
	@Test
	public void findServiceByUser_01()
	{
		final User user = userService.find(Long.valueOf(Constants.EIGHTY_FIVE));
		final Service service = serviceService.findServiceByUser(user);

		assertNotNull(service);
		assertTrue("SNP".equals(service.getAbreviation()));

		LOG.info(FIND_SERVICE_BY_USER_01);
	}

	/**
	 * Find service by user_02.
	 */
	@Test
	public void findServiceByUser_02()
	{
		final User user = userService.find(Long.valueOf(Constants.ONE));
		final Service service = serviceService.findServiceByUser(user);
		assertNull(service);

		LOG.info(FIND_SERVICE_BY_USER_02);
	}

	/**
	 * Find service by user_03.
	 */
	@Test
	public void findServiceByUser_03()
	{
		final Service service = serviceService.findServiceByUser(null);
		assertNull(service);

		LOG.info(FIND_SERVICE_BY_USER_03);
	}


	/**
	 * Find services by organism_01.
	 */
	@Test
	public void findServicesByOrganism_01()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.THREE));
		final List<Service> services = serviceService.findServicesByOrganism(organism);
		assertNotNull(services);
		assertTrue(CollectionUtils.isNotEmpty(services));
		assertTrue(services.size() == Long.valueOf(Constants.ONE));
		assertTrue(services.get(Constants.ZERO).getId() == Long.valueOf(Constants.FIVE));

		LOG.info(FIND_SERVICEs_BY_ORGANISM_01);
	}

	/**
	 * Find services by organism_02.
	 */
	@Test
	public void findServicesByOrganism_02()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.FOUR));
		final List<Service> services = serviceService.findServicesByOrganism(organism);
		assertNotNull(services);
		assertTrue(CollectionUtils.isEmpty(services));

		LOG.info(FIND_SERVICES_BY_ORGANISM_02);
	}

	/**
	 * Find services by organism_03.
	 */
	@Test
	public void findServicesByOrganism_03()
	{
		final List<Service> services = serviceService.findServicesByOrganism(null);
		assertNotNull(services);
		assertTrue(CollectionUtils.isEmpty(services));

		LOG.info(FIND_SERVICES_BY_ORGANISM_03);
	}

	/**
	 * Find non affected by sub department_01.
	 */
	@Test
	public void findNonAffectedBySubDepartment_01()
	{
		final SubDepartment subDepartment = subDepartmentService.find(Long.valueOf(Constants.SIX));
		final List<Service> services = serviceService.findNonAffectedServicesBySubDepartment(subDepartment);
		assertNotNull(services);
		assertTrue(CollectionUtils.isNotEmpty(services));
		assertTrue(services.size() == Long.valueOf(Constants.ONE));
		assertTrue(services.get(Constants.ZERO).getId() == Long.valueOf(Constants.THIRTEEN));

		LOG.info(FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_01);
	}


	/**
	 * Find non affected by sub department_02.
	 */
	@Test
	public void findNonAffectedBySubDepartment_02()
	{
		final SubDepartment subDepartment = subDepartmentService.find(Long.valueOf(Constants.THREE));
		final List<Service> services = serviceService.findNonAffectedServicesBySubDepartment(subDepartment);
		assertNotNull(services);
		assertTrue(CollectionUtils.isEmpty(services));

		LOG.info(FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_02);
	}

	/**
	 * Find non affected by sub department_03.
	 */
	@Test
	public void findNonAffectedBySubDepartment_03()
	{
		final List<Service> services = serviceService.findNonAffectedServicesBySubDepartment(null);
		assertNotNull(services);
		assertTrue(CollectionUtils.isEmpty(services));

		LOG.info(FIND_NON_AFFECTED_SERVICES_BY_SUBDEPARTMENT_03);
	}

	/**
	 * Find services ids by administration_01.
	 */
	@Test
	public void findServicesIdsByAdministration_01()
	{
		final Administration administration = administrationService.find(Long.valueOf(Constants.TWENTYSEVEN));
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(administration);
		assertTrue(CollectionUtils.isNotEmpty(servicesIds));
		assertTrue(servicesIds.size() == Long.valueOf(Constants.TWELVE));
		assertTrue(servicesIds.get(Constants.ZERO) == Long.valueOf(Constants.THIRTY));
		assertTrue(servicesIds.get(Constants.ONE) == Long.valueOf(Constants.FORTY));
		assertTrue(servicesIds.get(Constants.TWO) == Long.valueOf(Constants.FORTY_TWO));
		assertTrue(servicesIds.get(Constants.THREE) == Long.valueOf(Constants.FORTY_FOUR));
		assertTrue(servicesIds.get(Constants.FOUR) == Long.valueOf(Constants.FORTY_SIX));
		assertTrue(servicesIds.get(Constants.FIVE) == Long.valueOf(Constants.FORTY_EIGHT));
		assertTrue(servicesIds.get(Constants.SIX) == Long.valueOf(Constants.FIFTY));
		assertTrue(servicesIds.get(Constants.SEVEN) == Long.valueOf(Constants.FIFTY_TWO));
		assertTrue(servicesIds.get(Constants.EIGHT) == Long.valueOf(Constants.FIFTY_FOUR));
		assertTrue(servicesIds.get(Constants.NINE) == Long.valueOf(Constants.FIFTY_SIX));
		assertTrue(servicesIds.get(Constants.TEN) == Long.valueOf(Constants.FIFTY_EIGHT));
		assertTrue(servicesIds.get(Constants.ELEVEN) == Long.valueOf(Constants.SIXTY));

		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_01);
	}

	/**
	 * Find services ids by administration_02.
	 */
	@Test
	public void findServicesIdsByAdministration_02()
	{
		final Ministry ministry = ministryService.find(Long.valueOf(Constants.ONE));
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(ministry);
		assertTrue(CollectionUtils.isNotEmpty(servicesIds));
		assertTrue(servicesIds.size() == Long.valueOf(Constants.TEN));
		assertTrue(servicesIds.get(Constants.ZERO) == Long.valueOf(Constants.NINE));
		assertTrue(servicesIds.get(Constants.ONE) == Long.valueOf(Constants.ELEVEN));
		assertTrue(servicesIds.get(Constants.TWO) == Long.valueOf(Constants.THIRTEEN));
		assertTrue(servicesIds.get(Constants.THREE) == Long.valueOf(Constants.FIFTEEN));
		assertTrue(servicesIds.get(Constants.FOUR) == Long.valueOf(Constants.SEVENTEEN));
		assertTrue(servicesIds.get(Constants.FIVE) == Long.valueOf(Constants.NINETEEN));
		assertTrue(servicesIds.get(Constants.SIX) == Long.valueOf(Constants.TWENTYONE));
		assertTrue(servicesIds.get(Constants.SEVEN) == Long.valueOf(Constants.TWENTYTHREE));
		assertTrue(servicesIds.get(Constants.EIGHT) == Long.valueOf(Constants.TWENTYFIVE));
		assertTrue(servicesIds.get(Constants.NINE) == Long.valueOf(Constants.FIVE));

		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_02);
	}

	/**
	 * Find services ids by administration_03.
	 */
	@Test
	public void findServicesIdsByAdministration_03()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.TWO));
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(organism);
		assertTrue(CollectionUtils.isNotEmpty(servicesIds));
		assertTrue(servicesIds.size() == Long.valueOf(Constants.NINE));
		assertTrue(servicesIds.get(Constants.ZERO) == Long.valueOf(Constants.NINE));
		assertTrue(servicesIds.get(Constants.ONE) == Long.valueOf(Constants.ELEVEN));
		assertTrue(servicesIds.get(Constants.TWO) == Long.valueOf(Constants.THIRTEEN));
		assertTrue(servicesIds.get(Constants.THREE) == Long.valueOf(Constants.FIFTEEN));
		assertTrue(servicesIds.get(Constants.FOUR) == Long.valueOf(Constants.SEVENTEEN));
		assertTrue(servicesIds.get(Constants.FIVE) == Long.valueOf(Constants.NINETEEN));
		assertTrue(servicesIds.get(Constants.SIX) == Long.valueOf(Constants.TWENTYONE));
		assertTrue(servicesIds.get(Constants.SEVEN) == Long.valueOf(Constants.TWENTYTHREE));
		assertTrue(servicesIds.get(Constants.EIGHT) == Long.valueOf(Constants.TWENTYFIVE));

		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_03);
	}

	/**
	 * Find services ids by administration_04.
	 */
	@Test
	public void findServicesIdsByAdministration_04()
	{
		final SubDepartment subDepartment = subDepartmentService.find(Long.valueOf(Constants.FOUR));
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(subDepartment);
		assertTrue(CollectionUtils.isNotEmpty(servicesIds));
		assertTrue(servicesIds.size() == Long.valueOf(Constants.ONE));
		assertTrue(servicesIds.get(Constants.ZERO) == Long.valueOf(Constants.FIVE));

		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_04);
	}

	/**
	 * Find services ids by administration_05.
	 */
	@Test
	public void findServicesIdsByAdministration_05()
	{
		final Service service = serviceService.find(Long.valueOf(Constants.THIRTEEN));
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(service);
		assertTrue(CollectionUtils.isNotEmpty(servicesIds));
		assertTrue(servicesIds.size() == Long.valueOf(Constants.ONE));
		assertTrue(servicesIds.get(Constants.ZERO) == Long.valueOf(Constants.THIRTEEN));

		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_05);
	}

	/**
	 * Find services ids by administration_06.
	 */
	@Test
	public void findServicesIdsByAdministration_06()
	{
		final Entity entity = entityService.find(Long.valueOf(Constants.FOURTEEN));
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(entity);
		assertTrue(servicesIds.size() == Long.valueOf(Constants.ONE));
		assertTrue(servicesIds.get(Constants.ZERO) == Long.valueOf(Constants.THIRTEEN));


		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_06);
	}

	/**
	 * Find services ids by administration_07.
	 */
	@Test
	public void findServicesIdsByAdministration_07()
	{
		final List<Long> servicesIds = serviceService.findServicesIdsByAdministration(null);
		assertNotNull(servicesIds);
		assertTrue(CollectionUtils.isEmpty(servicesIds));

		LOG.info(FIND_SERVICES_IDS_BY_ADMINISTRATION_07);
	}

}
