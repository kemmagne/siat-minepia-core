package org.guce.siat.core.ct.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.AnalyseType;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AnalyseTypeService;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.utils.Constants;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class AnalyseTypeServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class AnalyseTypeServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(AnalyseTypeServiceTest.class);

    /**
     * The Constant FIND_BY_ORGANISM_01.
     */
    private static final String FIND_BY_ORGANISM_01 = "findByOrganism_01";

    /**
     * The Constant FIND_BY_ORGANISM_02.
     */
    private static final String FIND_BY_ORGANISM_02 = "findByOrganism_02";

    /**
     * The Constant FIND_BY_ORGANISM_03.
     */
    private static final String FIND_BY_ORGANISM_03 = "findByOrganism_03";

    /**
     * The analyse type service.
     */
    @Autowired
    AnalyseTypeService analyseTypeService;

    /**
     * The organism service.
     */
    @Autowired
    OrganismService organismService;

    /**
     * Find by organism_01.
     */
    @Ignore
    @Test
    public void findByOrganism_01() {
        final Organism organism = organismService.find(Long.valueOf(Constants.TWENTYEIGHT));
        List<AnalyseType> analyseTypes = new ArrayList<AnalyseType>();
        analyseTypes = analyseTypeService.findByAdministration(organism);
        assertTrue(CollectionUtils.isNotEmpty(analyseTypes));
        assertTrue(analyseTypes.size() == Constants.ONE);
        assertTrue(analyseTypes.get(Constants.ZERO).getId() == Long.valueOf(Constants.THREE));
        LOG.info(FIND_BY_ORGANISM_01);
    }

    /**
     * Find by organism_02.
     */
    @Ignore
    @Test
    public void findByOrganism_02() {
        final Organism organism = organismService.find(Long.valueOf(Constants.FOUR));
        List<AnalyseType> analyseTypes = new ArrayList<AnalyseType>();
        analyseTypes = analyseTypeService.findByAdministration(organism);
        assertNotNull(analyseTypes);
        assertTrue(CollectionUtils.isEmpty(analyseTypes));
        LOG.info(FIND_BY_ORGANISM_02);
    }

    /**
     * Find by organism_03.
     */
    @Ignore
    @Test
    public void findByOrganism_03() {
        final List<AnalyseType> analyseTypes = analyseTypeService.findByAdministration(null);
        assertNotNull(analyseTypes);
        assertTrue(CollectionUtils.isEmpty(analyseTypes));
        LOG.info(FIND_BY_ORGANISM_03);
    }
}

