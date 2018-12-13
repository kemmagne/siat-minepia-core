package org.guce.siat.core.common;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Administration;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.AdministrationService;
import org.guce.siat.common.service.BureauService;
import org.guce.siat.common.utils.enums.BureauType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class BureauServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class BureauServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(BureauServiceTest.class);

    /**
     * The Constant BUREAU_CENTRAl_BY_ORGANISM.
     */
    private static final String BUREAU_CENTRAl_BY_ORGANISM = "findBureauCentralByOrganism";

    /**
     * The Constant BUREAU_REGIONAL_BY_ORGANISM.
     */
    private static final String BUREAU_REGIONAL_BY_ORGANISM = "findBureauRegionalByOrganism";

    /**
     * The Constant BUREAU_WITH_NULL_ORGANISM.
     */
    private static final String BUREAU_WITH_NULL_ORGANISM = "findBureauWithNullOrganism";

    /**
     * The bureau service.
     */
    @Autowired
    BureauService bureauService;

    /**
     * The administration service.
     */
    @Autowired
    AdministrationService administrationService;

    /**
     * Find bureau central by organism.
     */
    @Ignore
    @Test
    public void findBureauCentralByOrganism() {
        final Administration organism = administrationService.find(2L);
        assertTrue(organism instanceof Organism);
        final List<Bureau> bureaus = bureauService.findBureauByTypeAndOrganism(BureauType.BUREAU_CENTRAL, (Organism) organism);
        assertTrue(CollectionUtils.isNotEmpty(bureaus));
        LOG.info(BUREAU_CENTRAl_BY_ORGANISM);
    }

    /**
     * Find bureau regional by organism.
     */
    @Ignore
    @Test
    public void findBureauRegionalByOrganism() {
        final Administration organism = administrationService.find(28L);
        assertTrue(organism instanceof Organism);
        final List<Bureau> bureaus = bureauService.findBureauByTypeAndOrganism(BureauType.BUREAU_REGIONAL, (Organism) organism);
        assertTrue(CollectionUtils.isEmpty(bureaus));
        LOG.info(BUREAU_REGIONAL_BY_ORGANISM);
    }

    /**
     * Find bureau with null organism.
     */
    @Ignore
    @Test
    public void findBureauWithNullOrganism() {
        final List<Bureau> bureaus = bureauService.findBureauByTypeAndOrganism(BureauType.BUREAU_REGIONAL, null);
        assertTrue(CollectionUtils.isEmpty(bureaus));
        LOG.info(BUREAU_WITH_NULL_ORGANISM);
    }
}
