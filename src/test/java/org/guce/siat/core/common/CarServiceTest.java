package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Car;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.CarService;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class CarServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class CarServiceTest
{
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(CarServiceTest.class);

	/** The Constant FIND_BY_ORGANISM_01. */
	private static final String FIND_BY_ORGANISM_01 = "findByOrganism_01";

	/** The Constant FIND_BY_ORGANISM_02. */
	private static final String FIND_BY_ORGANISM_02 = "findByOrganism_02";

	/** The Constant FIND_BY_ORGANISM_03. */
	private static final String FIND_BY_ORGANISM_03 = "findByOrganism_02";

	/** The car service. */
	@Autowired
	private CarService carService;

	/** The organism service. */
	@Autowired
	private OrganismService organismService;


	/**
	 * Find by organism_01.
	 */
	@Test
	public void findByOrganism_01()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.TWO));
		final List<Car> carList = carService.findByOrganism(organism);
		assertTrue(CollectionUtils.isNotEmpty(carList));
		assertTrue(carList.size() == Constants.ONE);
		assertTrue(carList.get(Constants.ZERO).getOrganism().getId() == Long.valueOf(Constants.TWO));
		LOG.info(FIND_BY_ORGANISM_01);
	}

	/**
	 * Find by organism_02.
	 */
	@Test
	public void findByOrganism_02()
	{
		final Organism organism = organismService.find(Long.valueOf(Constants.ONE));
		final List<Car> carList = carService.findByOrganism(organism);
		assertNotNull(carList);
		assertTrue(CollectionUtils.isEmpty(carList));
		LOG.info(FIND_BY_ORGANISM_02);
	}

	/**
	 * Find by organism_03.
	 */
	@Test
	public void findByOrganism_03()
	{
		final List<Car> carList = carService.findByOrganism(null);
		assertNotNull(carList);
		assertTrue(CollectionUtils.isEmpty(carList));
		LOG.info(FIND_BY_ORGANISM_03);
	}
}
