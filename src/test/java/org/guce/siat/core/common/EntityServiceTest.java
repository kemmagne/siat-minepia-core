package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.Entity;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.Service;
import org.guce.siat.common.service.AdministrationService;
import org.guce.siat.common.service.BureauService;
import org.guce.siat.common.service.EntityService;
import org.guce.siat.common.utils.enums.BureauType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class EntityServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class EntityServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(EntityServiceTest.class);

	/** The Constant FIND_BUREAU_BY_TYPE_AND_ORGANISM_01. */
	private static final String FIND_BUREAU_BY_TYPE_AND_ORGANISM_01 = "findBureauByTypeAndOrganism_01";

	/** The Constant FIND_BUREAU_BY_TYPE_AND_ORGANISM_02. */
	private static final String FIND_BUREAU_BY_TYPE_AND_ORGANISM_02 = "findBureauByTypeAndOrganism_02";

	/** The Constant FIND_ACTIVE_ENTITIES_BY_SERVICE_01. */
	private static final String FIND_ACTIVE_ENTITIES_BY_SERVICE_01 = "findActiveEntitiesByService01";

	/** The Constant FIND_ACTIVE_ENTITIES_BY_SERVICE_02. */
	private static final String FIND_ACTIVE_ENTITIES_BY_SERVICE_02 = "findActiveEntitiesByService02";

	/** The entity service. */
	@Autowired
	private EntityService entityService;

	/** The bureau service. */
	@Autowired
	private BureauService bureauService;

	@Autowired
	private AdministrationService administrationService;

	/**
	 * Find entity by type_01.
	 */



	/**
	 * Find bureau by type and organism_01.
	 */
	@Test
	public void findBureauByTypeAndOrganism_01()
	{
		final Organism organism = (Organism) administrationService.find(2L);
		final List<Bureau> entityList = bureauService.findBureauByTypeAndOrganism(BureauType.BUREAU_CENTRAL, organism);
		assertTrue(CollectionUtils.isNotEmpty(entityList));
		LOG.info(FIND_BUREAU_BY_TYPE_AND_ORGANISM_01);
	}

	/**
	 * Find bureau by type and organism_02.
	 */
	@Test
	public void findBureauByTypeAndOrganism_02()
	{
		try
		{
			final List<Bureau> entityList = bureauService.findBureauByTypeAndOrganism(null, null);
			if (entityList != null)
			{
				LOG.info(null, entityList.size());
			}
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
			LOG.info(FIND_BUREAU_BY_TYPE_AND_ORGANISM_02);
		}
	}



	/**
	 * Find active entities by service_01.
	 */
	@Test
	public void findActiveEntitiesByService_01()
	{
		final Service service = (Service) administrationService.find(5L);
		final List<Entity> entityList = entityService.findActiveEntitiesByService(service);
		assertNotNull(entityList);
		assertTrue(CollectionUtils.isNotEmpty(entityList));
		LOG.info(FIND_ACTIVE_ENTITIES_BY_SERVICE_01);
	}

	/**
	 * Find active entities by service_02.
	 */
	@Test
	public void findActiveEntitiesByService_02()
	{
		try
		{
			final List<Entity> entityList = entityService.findActiveEntitiesByService(null);
			if (entityList != null)
			{
				LOG.info(null, entityList.size());
			}
		}
		catch (final Exception e)
		{
			assertTrue(e instanceof NullPointerException);
			LOG.info(FIND_ACTIVE_ENTITIES_BY_SERVICE_02);
		}
	}

}
