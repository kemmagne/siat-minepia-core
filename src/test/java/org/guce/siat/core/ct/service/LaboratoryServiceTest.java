package org.guce.siat.core.ct.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.core.ct.model.Laboratory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class LaboratoryServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class LaboratoryServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(LaboratoryServiceTest.class);

	private static final String FIND_BY_ORGANISM_01 = "findByOrganisme_01";

	private static final String FIND_BY_ORGANISM_02 = "findByOrganisme_02";

	private static final String FIND_BY_ORGANISM_03 = "findByOrganisme_03";


	/** The laboratory service. */
	@Autowired
	private LaboratoryService laboratoryService;

	/** The organism service. */
	@Autowired
	private OrganismService organismService;


	/**
	 * Find by organisme_01.
	 */
	@Test
	public void findByOrganisme_01()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.SIXTY_THREE));
		final List<Laboratory> laboratories = laboratoryService.findByOrganism(organism);
		assertTrue(CollectionUtils.isNotEmpty(laboratories));
		assertTrue(laboratories.size() == Constants.ONE);
		assertTrue(laboratories.get(Constants.ZERO).getId() == Long.valueOf(Constants.SEVENTY_EIGHT));
		LOG.info(FIND_BY_ORGANISM_01);
	}

	/**
	 * Find by organisme_02.
	 */
	@Test
	public void findByOrganisme_02()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.TWO));
		final List<Laboratory> laboratories = laboratoryService.findByOrganism(organism);
		assertNotNull(laboratories);
		assertTrue(CollectionUtils.isEmpty(laboratories));

		LOG.info(FIND_BY_ORGANISM_02);
	}

	/**
	 * Find by organisme_03.
	 */
	@Test
	public void findByOrganisme_03()
	{
		final List<Laboratory> laboratories = laboratoryService.findByOrganism(null);
		assertNotNull(laboratories);
		assertTrue(CollectionUtils.isEmpty(laboratories));

		LOG.info(FIND_BY_ORGANISM_03);
	}
}
