package org.guce.siat.core.common;
//package org.guce.siat.core.ct.service;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import static org.junit.Assert.assertTrue;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import org.apache.commons.collections4.CollectionUtils;
//import org.guce.siat.common.model.Authority;
//import org.guce.siat.common.model.Organism;
//import org.guce.siat.common.model.Service;
//import org.guce.siat.common.model.User;
//import org.guce.siat.common.service.OrganismService;
//import org.guce.siat.common.service.ServiceService;
//import org.guce.siat.common.service.UserService;
//import org.guce.siat.common.utils.Constants;
//import org.guce.siat.core.common.model.Company;
//import org.guce.siat.core.common.model.Country;
//import org.guce.siat.core.common.service.CompanyService;
//import org.guce.siat.core.common.service.CountryService;
//import org.guce.siat.core.common.service.StepService;
//import org.guce.siat.core.ct.model.File;
//import org.guce.siat.core.ct.model.FileItem;
//import org.guce.siat.core.ct.model.Port;
//import org.guce.siat.core.ct.model.Step;
//import org.guce.siat.core.ct.model.TransportType;
//import org.guce.siat.core.ct.utils.fiter.FileItemFilter;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//
///**
// * The Class FileItemServiceTest.
// */
//@Transactional
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
//public class FileItemServiceTest
//{
//
//	/** The Constant LOG. */
//	private static final Logger LOGGER = LoggerFactory.getLogger(FileItemServiceTest.class);
//
//	/** The file item service. */
//	@Autowired
//	FileItemService fileItemService;
//
//	/** The user service. */
//	@Autowired
//	UserService userService;
//
//	/** The organism service. */
//	@Autowired
//	OrganismService organismService;
//
//	/** The service service. */
//	@Autowired
//	ServiceService serviceService;
//
//	/** The step service. */
//	@Autowired
//	StepService stepService;
//
//	/** The company service. */
//	@Autowired
//	CompanyService companyService;
//
//	/** The transport type service. */
//	@Autowired
//	TransportTypeService transportTypeService;
//
//	/** The country service. */
//	@Autowired
//	CountryService countryService;
//
//	/** The port service. */
//	@Autowired
//	PortService portService;
//
//	/** The returned file items. */
//	List<FileItem> returnedFileItemList;
//
//	/** The returned file item. */
//	FileItem returnedFileItem;
//
//	/** The supervisor. */
//	private User supervisor;
//
//	/** The agent. */
//	private User agent;
//
//	/** The supervisor organism. */
//	private Organism supervisorOrganism;
//
//	/** The agent service. */
//	private Service agentService;
//
//	/** The filter. */
//	private FileItemFilter emptyfilter;
//
//	/** The step filter. */
//	private FileItemFilter stepFilter;
//
//	/** The operator filter. */
//	private FileItemFilter operatorFilter;
//
//	/** The country filter. */
//	private FileItemFilter countryFilter;
//
//	/** The trans type filter. */
//	private FileItemFilter transTypeFilter;
//
//	/** The port filter. */
//	private FileItemFilter portFilter;
//
//	/** The ndp filter. */
//	private FileItemFilter ndpFilter;
//
//	/** The doc filter. */
//	private FileItemFilter docFilter;
//
//	/**
//	 * Find by filter_01.
//	 */
//	@Test
//	public void findByFilter_01()
//	{
//
//		try
//		{
//			returnedFileItemList = fileItemService.findByFilter(null, null, null, null);
//		}
//		catch (final Exception e)
//		{
//			assertTrue(e instanceof NullPointerException);
//			LOGGER.error("all parameters are null");
//		}
//	}
//
//	/**
//	 * Find by simple filter_02: User is a Supervisor.
//	 */
//	//	@Test
//	//	public void findByFilter_02()
//	//	{
//	//
//	//		final List<String> authorithies = new ArrayList<String>();
//	//		for (final GrantedAuthority auth : supervisor.getAuthorities())
//	//		{
//	//			authorithies.add(auth.getAuthority());
//	//		}
//	//		returnedFileItemList = fileItemService.findByFilter(emptyfilter, supervisor, supervisorOrganism, agentService);
//	//		assertNotNull(returnedFileItemList);
//	//		assertTrue(returnedFileItemList.size() > 0);
//	//
//	//	}
//
//
//	/**
//	 * Find by filter_03: user is an agent.
//	 */
//	//	@Test
//	//	public void findByFilter_03()
//	//	{
//	//
//	//		final List<String> authorithies = new ArrayList<String>();
//	//		for (final GrantedAuthority auth : agent.getAuthorities())
//	//		{
//	//			authorithies.add(auth.getAuthority());
//	//		}
//	//		returnedFileItemList = fileItemService.findByFilter(emptyfilter, agent, supervisorOrganism, agentService);
//	//		assertNotNull(returnedFileItemList);
//	//		assertTrue(returnedFileItemList.size() > 0);
//	//
//	//	}
//
//	/**
//	 * Find file item by service and authorities_01.
//	 */
//	@Test
//	public void findFileItemByServiceAndAuthorities_01()
//	{
//		final Service service = serviceService.find(Long.valueOf(Constants.ONE));
//
//		final User user = userService.find(19L);
//
//		final List<FileItem> fileItemList = fileItemService.findFileItemByServiceAndAuthorities(service, user);
//		assertTrue(CollectionUtils.isNotEmpty(fileItemList));
//		assertTrue(fileItemList.get(0).getFile().getService().getId() == service.getId());
//	}
//
//	/**
//	 * Find file item by service and authorities_02.
//	 */
//	@Test
//	public void findFileItemByServiceAndAuthorities_02()
//	{
//		try
//		{
//			final List<FileItem> fileItemList = fileItemService.findFileItemByServiceAndAuthorities(null, null);
//			assertNull(fileItemList);
//		}
//		catch (final Exception e)
//		{
//			assertTrue(e instanceof NullPointerException);
//		}
//	}
//
//
//	/**
//	 * Find file items by file and service and organism and authorities_01.
//	 */
//	@Test
//	public void findFileItemsByFileAndServiceAndOrganismAndAuthorities_01()
//	{
//		final Service service = serviceService.find(Long.valueOf(Constants.TWO));
//		final File file = new File(Long.valueOf(2));
//		final Organism organism = new Organism(Long.valueOf(1));
//		final Authority grantedAuthImpl = new Authority();
//		grantedAuthImpl.setId(Long.valueOf(Constants.FIVE));
//		grantedAuthImpl.setLabelFr("Agent de Recevabilité");
//		grantedAuthImpl.setRole("AR");
//
//		final Collection<Authority> grantedAuthList = new ArrayList<Authority>();
//		grantedAuthList.add(grantedAuthImpl);
//
//		//		final List<FileItem> fileItemList = fileItemService.findFileItemsByFileAndServiceAndOrganismAndAuthorities(file, service,
//		//				organism, grantedAuthList);
//		assertTrue(CollectionUtils.isNotEmpty(grantedAuthList));
//		//		assertTrue(fileItemList.get(0).getFile().getService().getId() == service.getId());
//		//		assertTrue(fileItemList.get(0).getFile().getId() == file.getId());
//		//		assertTrue(fileItemList.get(0).getFile().getService().getSubDepartment().getOrganism().getId() == organism.getId());
//
//	}
//
//	/**
//	 * Find file items by file and service and organism and authorities_02.
//	 */
//	@Test
//	public void findFileItemsByFileAndServiceAndOrganismAndAuthorities_02()
//	{
//		final Service service = new Service();
//		final File file = new File();
//		final Organism organism = new Organism();
//		final Authority grantedAuthImpl = new Authority();
//		grantedAuthImpl.setId(Long.valueOf(Constants.FIVE));
//		grantedAuthImpl.setLabelFr("Agent de Recevabilité");
//		grantedAuthImpl.setRole("AR");
//
//		final Collection<Authority> grantedAuthList = new ArrayList<Authority>();
//		grantedAuthList.add(grantedAuthImpl);
//		//		final List<FileItem> fileItemList = fileItemService.findFileItemsByFileAndServiceAndOrganismAndAuthorities(file, service,
//		//				organism, grantedAuthList);
//
//		//		assertTrue(CollectionUtils.isEmpty(fileItemList));
//
//	}
//
//
//	/**
//	 * Find file items by file_01.
//	 */
//	@Test
//	public void findFileItemsByFile_01()
//	{
//		final File file = new File(Long.valueOf(Constants.ONE));
//		final List<FileItem> fileItemList = fileItemService.findFileItemsByFile(file);
//		CollectionUtils.isNotEmpty(fileItemList);
//	}
//
//	/**
//	 * Find file items by file_02.
//	 */
//	@Test
//	public void findFileItemsByFile_02()
//	{
//		try
//		{
//			final List<FileItem> fileItemList = fileItemService.findFileItemsByFile(null);
//			CollectionUtils.isEmpty(fileItemList);
//		}
//		catch (final Exception e)
//		{
//			assertTrue(e instanceof NullPointerException);
//		}
//	}
//
//	/*-------------------------  Simple Search ------------------------- */
//
//	/**
//	 * Find by filter_04: find by step.
//	 */
//	@Test
//	public void findByFilter_04()
//	{
//		returnedFileItemList = fileItemService.findByFilter(stepFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert step", fileItem.getStep(), stepFilter.getStep());
//		}
//
//	}
//
//
//	/*-------------------------  Advanced Search ------------------------- */
//
//	/**
//	 * Find by filter_05: find by operator.
//	 */
//	@Test
//	public void findByFilter_05()
//	{
//		returnedFileItemList = fileItemService.findByFilter(operatorFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert operator", fileItem.getFile().getOperator(), operatorFilter.getOperator());
//		}
//
//	}
//
//	/**
//	 * Find by filter_06: find by transport type.
//	 */
//	@Test
//	public void findByFilter_06()
//	{
//		returnedFileItemList = fileItemService.findByFilter(transTypeFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert transport type", fileItem.getFile().getConveyance(), transTypeFilter.getTransportType());
//		}
//
//	}
//
//	/**
//	 * Find by filter_07: find by origin country.
//	 */
//	@Test
//	public void findByFilter_07()
//	{
//		returnedFileItemList = fileItemService.findByFilter(countryFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert Origin country", fileItem.getOriginCountry(), countryFilter.getOriginCountry());
//		}
//
//	}
//
//	/**
//	 * Find by filter_08: find by arrival port.
//	 */
//	@Test
//	public void findByFilter_08()
//	{
//		returnedFileItemList = fileItemService.findByFilter(portFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert arrival port", fileItem.getFile().getArrivalPort(), portFilter.getArrivalPort());
//		}
//
//	}
//
//	/**
//	 * Find by filter_09: find by product.
//	 */
//	@Test
//	public void findByFilter_09()
//	{
//		returnedFileItemList = fileItemService.findByFilter(ndpFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert Product", fileItem.getSubfamily().getNdp().getGoodsItemCode(), ndpFilter.getSubfamily());
//		}
//
//	}
//
//	/**
//	 * Find by filter_10: find by document number.
//	 */
//	@Test
//	public void findByFilter_10()
//	{
//		returnedFileItemList = fileItemService.findByFilter(docFilter, agent, supervisorOrganism, agentService);
//		assertNotNull(returnedFileItemList);
//		assertTrue(returnedFileItemList.size() > 0);
//		for (final FileItem fileItem : returnedFileItemList)
//		{
//			assertEquals("assert document", fileItem.getFile().getId(), docFilter.getFile());
//		}
//
//	}
//
//
//	/*-------------------------  Quick Search ------------------------- */
//
//	/**
//	 * Find by quich search_01 : file does not exist.
//	 */
//	@Test
//	public void findByQuichSearch_01()
//	{
//		returnedFileItem = fileItemService.findByQuickSearch(Long.valueOf(4), agent, supervisorOrganism, agentService);
//		assertNull(returnedFileItem);
//
//	}
//
//
//
//	/**
//	 * Find by quich search_02: user is a supervisor.
//	 */
//	//	@Test
//	//	public void findByQuichSearch_02()
//	//	{
//	//
//	//		final Long docNumFilter = Long.valueOf(2);
//	//		final List<String> authorithies = new ArrayList<String>();
//	//		for (final GrantedAuthority auth : supervisor.getAuthorities())
//	//		{
//	//			authorithies.add(auth.getAuthority());
//	//		}
//	//		returnedFileItem = fileItemService.findByQuickSearch(docNumFilter, supervisor, supervisorOrganism, agentService);
//	//		assertNotNull(returnedFileItem);
//	//		assertEquals("assert document number from Quick Search", returnedFileItem.getFile().getId(), docNumFilter);
//	//
//	//	}
//
//
//	/**
//	 * Find by quich search_03: user is an agent.
//	 */
//	//	@Test
//	//	public void findByQuichSearch_03()
//	//	{
//	//		final Long docNumFilter = Long.valueOf(1);
//	//		final List<String> authorithies = new ArrayList<String>();
//	//		for (final GrantedAuthority auth : agent.getAuthorities())
//	//		{
//	//			authorithies.add(auth.getAuthority());
//	//		}
//	//		returnedFileItem = fileItemService.findByQuickSearch(docNumFilter, agent, supervisorOrganism, agentService);
//	//		assertNotNull(returnedFileItem);
//	//		assertEquals("assert document number from Quick Search", returnedFileItem.getFile().getId(), docNumFilter);
//	//	}
//
//	/**
//	 * Find by quich search_04: agent and fileItem not in the same service.
//	 */
//	//	@Test
//	//	public void findByQuichSearch_04()
//	//	{
//	//
//	//		final List<String> authorithies = new ArrayList<String>();
//	//		for (final GrantedAuthority auth : agent.getAuthorities())
//	//		{
//	//			authorithies.add(auth.getAuthority());
//	//		}
//	//		returnedFileItem = fileItemService.findByQuickSearch(Long.valueOf(2), agent, supervisorOrganism, agentService);
//	//		assertNull(returnedFileItem);
//	//
//	//	}
//
//
//	/**
//	 * Sets the up.
//	 */
//	@Before
//	public void setUp()
//	{
//
//		supervisorOrganism = organismService.find(Long.valueOf(1));
//
//		agentService = serviceService.find(Long.valueOf(1));
//
//		supervisor = userService.find(Long.valueOf(10));
//
//		agent = userService.find(Long.valueOf(19));
//
//		final Step step = stepService.find(Long.valueOf(2));
//
//		final Company operator = companyService.find(Long.valueOf(1));
//
//		final Country originCountry = countryService.find("TN");
//
//		final Port arrivalPort = portService.find("RADTN");
//
//		final TransportType transportType = transportTypeService.find("TM");
//
//		final String ndp = "18069031004";
//
//		final Long numDossier = Long.valueOf(1);
//
//		emptyfilter = new FileItemFilter();
//
//		stepFilter = new FileItemFilter();
//
//		operatorFilter = new FileItemFilter();
//		countryFilter = new FileItemFilter();
//		transTypeFilter = new FileItemFilter();
//		portFilter = new FileItemFilter();
//		ndpFilter = new FileItemFilter();
//		docFilter = new FileItemFilter();
//
//		stepFilter.setStep(step);
//		operatorFilter.setOperator(operator);
//		countryFilter.setOriginCountry(originCountry);
//		transTypeFilter.setTransportType(transportType);
//		portFilter.setArrivalPort(arrivalPort);
//		ndpFilter.setSubfamily(ndp);
//		docFilter.setFile(numDossier);
//
//	}
//
//	/**
//	 * Gets the supervisor.
//	 *
//	 * @return the supervisor
//	 */
//	public User getSupervisor()
//	{
//		return supervisor;
//	}
//
//	/**
//	 * Sets the supervisor.
//	 *
//	 * @param supervisor
//	 *           the supervisor to set
//	 */
//	public void setSupervisor(final User supervisor)
//	{
//		this.supervisor = supervisor;
//	}
//
//	/**
//	 * Gets the agent.
//	 *
//	 * @return the agent
//	 */
//	public User getAgent()
//	{
//		return agent;
//	}
//
//	/**
//	 * Sets the agent.
//	 *
//	 * @param agent
//	 *           the agent to set
//	 */
//	public void setAgent(final User agent)
//	{
//		this.agent = agent;
//	}
//
//	/**
//	 * Gets the supervisor organism.
//	 *
//	 * @return the supervisorOrganism
//	 */
//	public Organism getSupervisorOrganism()
//	{
//		return supervisorOrganism;
//	}
//
//	/**
//	 * Sets the supervisor organism.
//	 *
//	 * @param supervisorOrganism
//	 *           the supervisorOrganism to set
//	 */
//	public void setSupervisorOrganism(final Organism supervisorOrganism)
//	{
//		this.supervisorOrganism = supervisorOrganism;
//	}
//
//	/**
//	 * Gets the agent service.
//	 *
//	 * @return the agentService
//	 */
//	public Service getAgentService()
//	{
//		return agentService;
//	}
//
//	/**
//	 * Sets the agent service.
//	 *
//	 * @param agentService
//	 *           the agentService to set
//	 */
//	public void setAgentService(final Service agentService)
//	{
//		this.agentService = agentService;
//	}
//
//	/**
//	 * Gets the file item service.
//	 *
//	 * @return the fileItemService
//	 */
//	public FileItemService getFileItemService()
//	{
//		return fileItemService;
//	}
//
//	/**
//	 * Sets the file item service.
//	 *
//	 * @param fileItemService
//	 *           the fileItemService to set
//	 */
//	public void setFileItemService(final FileItemService fileItemService)
//	{
//		this.fileItemService = fileItemService;
//	}
//
//	/**
//	 * Gets the user service.
//	 *
//	 * @return the userService
//	 */
//	public UserService getUserService()
//	{
//		return userService;
//	}
//
//	/**
//	 * Sets the user service.
//	 *
//	 * @param userService
//	 *           the userService to set
//	 */
//	public void setUserService(final UserService userService)
//	{
//		this.userService = userService;
//	}
//
//	/**
//	 * Gets the organism service.
//	 *
//	 * @return the organismService
//	 */
//	public OrganismService getOrganismService()
//	{
//		return organismService;
//	}
//
//	/**
//	 * Sets the organism service.
//	 *
//	 * @param organismService
//	 *           the organismService to set
//	 */
//	public void setOrganismService(final OrganismService organismService)
//	{
//		this.organismService = organismService;
//	}
//
//	/**
//	 * Gets the service service.
//	 *
//	 * @return the serviceService
//	 */
//	public ServiceService getServiceService()
//	{
//		return serviceService;
//	}
//
//	/**
//	 * Sets the service service.
//	 *
//	 * @param serviceService
//	 *           the serviceService to set
//	 */
//	public void setServiceService(final ServiceService serviceService)
//	{
//		this.serviceService = serviceService;
//	}
//
//	/**
//	 * Gets the step service.
//	 *
//	 * @return the stepService
//	 */
//	public StepService getStepService()
//	{
//		return stepService;
//	}
//
//	/**
//	 * Sets the step service.
//	 *
//	 * @param stepService
//	 *           the stepService to set
//	 */
//	public void setStepService(final StepService stepService)
//	{
//		this.stepService = stepService;
//	}
//
//	/**
//	 * Gets the company service.
//	 *
//	 * @return the companyService
//	 */
//	public CompanyService getCompanyService()
//	{
//		return companyService;
//	}
//
//	/**
//	 * Sets the company service.
//	 *
//	 * @param companyService
//	 *           the companyService to set
//	 */
//	public void setCompanyService(final CompanyService companyService)
//	{
//		this.companyService = companyService;
//	}
//
//	/**
//	 * Gets the transport type service.
//	 *
//	 * @return the transportTypeService
//	 */
//	public TransportTypeService getTransportTypeService()
//	{
//		return transportTypeService;
//	}
//
//	/**
//	 * Sets the transport type service.
//	 *
//	 * @param transportTypeService
//	 *           the transportTypeService to set
//	 */
//	public void setTransportTypeService(final TransportTypeService transportTypeService)
//	{
//		this.transportTypeService = transportTypeService;
//	}
//
//	/**
//	 * Gets the country service.
//	 *
//	 * @return the countryService
//	 */
//	public CountryService getCountryService()
//	{
//		return countryService;
//	}
//
//	/**
//	 * Sets the country service.
//	 *
//	 * @param countryService
//	 *           the countryService to set
//	 */
//	public void setCountryService(final CountryService countryService)
//	{
//		this.countryService = countryService;
//	}
//
//	/**
//	 * Gets the port service.
//	 *
//	 * @return the portService
//	 */
//	public PortService getPortService()
//	{
//		return portService;
//	}
//
//	/**
//	 * Sets the port service.
//	 *
//	 * @param portService
//	 *           the portService to set
//	 */
//	public void setPortService(final PortService portService)
//	{
//		this.portService = portService;
//	}
//
//	/**
//	 * Gets the returned file item list.
//	 *
//	 * @return the returnedFileItemList
//	 */
//	public List<FileItem> getReturnedFileItemList()
//	{
//		return returnedFileItemList;
//	}
//
//	/**
//	 * Sets the returned file item list.
//	 *
//	 * @param returnedFileItemList
//	 *           the returnedFileItemList to set
//	 */
//	public void setReturnedFileItemList(final List<FileItem> returnedFileItemList)
//	{
//		this.returnedFileItemList = returnedFileItemList;
//	}
//
//	/**
//	 * Gets the returned file item.
//	 *
//	 * @return the returnedFileItem
//	 */
//	public FileItem getReturnedFileItem()
//	{
//		return returnedFileItem;
//	}
//
//	/**
//	 * Sets the returned file item.
//	 *
//	 * @param returnedFileItem
//	 *           the returnedFileItem to set
//	 */
//	public void setReturnedFileItem(final FileItem returnedFileItem)
//	{
//		this.returnedFileItem = returnedFileItem;
//	}
//
//	/**
//	 * Gets the emptyfilter.
//	 *
//	 * @return the emptyfilter
//	 */
//	public FileItemFilter getEmptyfilter()
//	{
//		return emptyfilter;
//	}
//
//	/**
//	 * Sets the emptyfilter.
//	 *
//	 * @param emptyfilter
//	 *           the emptyfilter to set
//	 */
//	public void setEmptyfilter(final FileItemFilter emptyfilter)
//	{
//		this.emptyfilter = emptyfilter;
//	}
//
//	/**
//	 * Gets the step filter.
//	 *
//	 * @return the stepFilter
//	 */
//	public FileItemFilter getStepFilter()
//	{
//		return stepFilter;
//	}
//
//	/**
//	 * Sets the step filter.
//	 *
//	 * @param stepFilter
//	 *           the stepFilter to set
//	 */
//	public void setStepFilter(final FileItemFilter stepFilter)
//	{
//		this.stepFilter = stepFilter;
//	}
//
//	/**
//	 * Gets the operator filter.
//	 *
//	 * @return the operatorFilter
//	 */
//	public FileItemFilter getOperatorFilter()
//	{
//		return operatorFilter;
//	}
//
//	/**
//	 * Sets the operator filter.
//	 *
//	 * @param operatorFilter
//	 *           the operatorFilter to set
//	 */
//	public void setOperatorFilter(final FileItemFilter operatorFilter)
//	{
//		this.operatorFilter = operatorFilter;
//	}
//
//	/**
//	 * Gets the country filter.
//	 *
//	 * @return the countryFilter
//	 */
//	public FileItemFilter getCountryFilter()
//	{
//		return countryFilter;
//	}
//
//	/**
//	 * Sets the country filter.
//	 *
//	 * @param countryFilter
//	 *           the countryFilter to set
//	 */
//	public void setCountryFilter(final FileItemFilter countryFilter)
//	{
//		this.countryFilter = countryFilter;
//	}
//
//	/**
//	 * Gets the trans type filter.
//	 *
//	 * @return the transTypeFilter
//	 */
//	public FileItemFilter getTransTypeFilter()
//	{
//		return transTypeFilter;
//	}
//
//	/**
//	 * Sets the trans type filter.
//	 *
//	 * @param transTypeFilter
//	 *           the transTypeFilter to set
//	 */
//	public void setTransTypeFilter(final FileItemFilter transTypeFilter)
//	{
//		this.transTypeFilter = transTypeFilter;
//	}
//
//	/**
//	 * Gets the port filter.
//	 *
//	 * @return the portFilter
//	 */
//	public FileItemFilter getPortFilter()
//	{
//		return portFilter;
//	}
//
//	/**
//	 * Sets the port filter.
//	 *
//	 * @param portFilter
//	 *           the portFilter to set
//	 */
//	public void setPortFilter(final FileItemFilter portFilter)
//	{
//		this.portFilter = portFilter;
//	}
//
//	/**
//	 * Gets the ndp filter.
//	 *
//	 * @return the ndpFilter
//	 */
//	public FileItemFilter getNdpFilter()
//	{
//		return ndpFilter;
//	}
//
//	/**
//	 * Sets the ndp filter.
//	 *
//	 * @param ndpFilter
//	 *           the ndpFilter to set
//	 */
//	public void setNdpFilter(final FileItemFilter ndpFilter)
//	{
//		this.ndpFilter = ndpFilter;
//	}
//
//	/**
//	 * Gets the doc filter.
//	 *
//	 * @return the docFilter
//	 */
//	public FileItemFilter getDocFilter()
//	{
//		return docFilter;
//	}
//
//	/**
//	 * Sets the doc filter.
//	 *
//	 * @param docFilter
//	 *           the docFilter to set
//	 */
//	public void setDocFilter(final FileItemFilter docFilter)
//	{
//		this.docFilter = docFilter;
//	}
//
//}
