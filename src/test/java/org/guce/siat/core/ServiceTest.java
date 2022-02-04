//package org.guce.siat.core;
//
//
//import org.guce.siat.common.service.MinistryService;
//import org.guce.siat.common.service.ServicesItemService;
//import org.guce.siat.common.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//
////@RunWith(SpringJUnit4ClassRunner.class)
///**
// * The Class ServiceTest.
// */
////@ContextConfiguration("classpath:spring-config.xml")
//public class ServiceTest
//{
//
//	//private static final Logger LOG = LoggerFactory.getLogger(ServiceTest.class);
//
//	/** The ministry service. */
//	@Autowired
//	MinistryService ministryService;
//
//	/** The user service. */
//	@Autowired
//	UserService userService;
//
//	/** The services item service. */
//	@Autowired
//	ServicesItemService servicesItemService;
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
//	//	@Test
//	//	public void manipulateAOPTest() {
//	//		Ministry ministry = new Ministry();
//	//		ministry.setLabel("Ministère du Commerce");
//	//		iMinistryService.save(ministry);
//	//		ministry = new Ministry();
//	//		ministry.setId(22);
//	//		iMinistryService.delete(ministry);
//	//	}
//
//
//	//		@Test
//	//		public void startProcess() throws Exception {
//	//			List<Ministry> ministries = ministryService.findAll();
//	//			for (Iterator<Ministry> iterator = ministries.iterator(); iterator.hasNext();) {
//	//				Ministry ministry = iterator.next();
//	//				LOG.info("Ministry : {}", ministry.getLabel());
//	//			}
//	//		}
//
//	//	@Test
//	//	public void createUserTest()
//	//	{
//	//		final User user = new User();
//	//		final Authority Authority = new Authority(1);
//	//		final Set<Authority> authorityImpls = new HashSet<Authority>();
//	//		authorityImpls.add(Authority);
//	//		user.setEmail("amine.ayed@businessdecision.com");
//	//		user.setPassword("root");
//	//		user.setLogin("root");
//	//		user.setFirstName("admin");
//	//		user.setLastName("admin");
//	//		user.setGrantedAuthorities(authorityImpls);
//	//		userService.createUser(user);
//	//
//	//	}
//
//	//		@Test
//	//		public void createMinistry()
//	//		{
//	//			final Ministry ministry = new Ministry();
//	//
//	//			ministry.setLabel("1yddsfrts98vv");
//	//			ministry.setLabelEn("2rrfsyd2vtt");
//	//			//ministry.setId(27);
//	//			ministryService.deleteById(40);
//	//		}
//
//
//
//	//	@Test
//	//	public void LoadUser() {
//	//
//	//		UserDetails user = userManagement.getUserByName("root");
//	//		for (Iterator iterator = user.getAuthorities().iterator(); iterator.hasNext();) {
//	//			GrantedAuthority type = (GrantedAuthority) iterator.next();
//	//
//	//		}
//	//	}
//
//	//	@Test (expected = AccessDeniedException.class)
//	//	public void login() {
//	//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//	//        authorities.add(new Authority(1));
//	//        Authentication authToken = new UsernamePasswordAuthenticationToken ("root", "123456");
//	//        Authentication result = authenticationManager.authenticate(authToken);
//	//        SecurityContextHolder.getContext().setAuthentication(result);
//	//	}
//	//
//	//	@Test
//	//	public void getServiceItems()
//	//	{
//	//
//	//		final List<ServicesItem> servItemList = servicesItemService.findServicesItemByService((long) 2);
//	//
//	//		for (final ServicesItem servicesItem : servItemList)
//	//		{
//	//			LOG.info("service items : {}", servicesItem.getItem().getId());
//	//		}
//	//
//	//	}
//}
