package org.guce.siat.core.ct.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.core.ct.model.TreatmentCompany;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class TreatmentCompanyServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class TreatmentCompanyServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(TreatmentCompanyServiceTest.class);

    /**
     * The Constant FIND_BY_ORGANISME_01.
     */
    private static final String FIND_BY_ORGANISME_01 = "findByOrganisme_01";

    /**
     * The Constant FIND_BY_ORGANISME_02.
     */
    private static final String FIND_BY_ORGANISME_02 = "findByOrganisme_02";

    /**
     * The Constant FIND_BY_ORGANISME_03.
     */
    private static final String FIND_BY_ORGANISME_03 = "findByOrganisme_03";

    /**
     * The Constant FIND_BY_ORGANISME_04.
     */
    private static final String FIND_BY_ORGANISME_04 = "findByOrganisme_04";

    /**
     * The Constant CODE.
     */
    private static final String CODE = "TC-Minipea";

    /**
     * The Constant LABEL_FR.
     */
    private static final String LABEL_FR = "Treatment company-Service CCT-Minepia";

    /**
     * The treatment company service.
     */
    @Autowired
    private TreatmentCompanyService treatmentCompanyService;

    /**
     * The organism service.
     */
    @Autowired
    private OrganismService organismService;

    /**
     * Find by organism_01.
     */
    @Ignore
    @Test
    public void findByOrganism_01() {
        final Organism organism = organismService.find(Long.valueOf(Constants.TWENTYEIGHT));
        final List<TreatmentCompany> treatmentCompanies = treatmentCompanyService.findByOrganism(organism);
        assertTrue(CollectionUtils.isNotEmpty(treatmentCompanies));
        assertTrue(treatmentCompanies.size() == Constants.ONE);
        assertEquals(CODE, treatmentCompanies.get(Constants.ZERO).getCode());
        assertEquals(LABEL_FR, treatmentCompanies.get(Constants.ZERO).getLabelFr());
        LOG.info(FIND_BY_ORGANISME_01);
    }

    /**
     * Find by organism_02.
     */
    @Ignore
    @Test
    public void findByOrganism_02() {
        final Organism organism = organismService.find(Long.valueOf(Constants.FIFTEEN));
        final List<TreatmentCompany> treatmentCompanies = treatmentCompanyService.findByOrganism(organism);
        assertNotNull(treatmentCompanies);
        assertTrue(CollectionUtils.isEmpty(treatmentCompanies));
        LOG.info(FIND_BY_ORGANISME_02);
    }

    /**
     * Find by organism_03.
     */
    @Ignore
    @Test
    public void findByOrganism_03() {
        final List<TreatmentCompany> treatmentCompanies = treatmentCompanyService.findByOrganism(null);
        assertNotNull(treatmentCompanies);
        assertTrue(CollectionUtils.isEmpty(treatmentCompanies));
        LOG.info(FIND_BY_ORGANISME_03);
    }

    /**
     * Test find by organisme_04.
     */
    @Ignore
    @Test
    public void findByOrganism_04() {
        final Organism organism = organismService.find(Long.valueOf(Constants.SIXTY_THREE));/* deleted = true */
        final List<TreatmentCompany> treatmentCompanies = treatmentCompanyService.findByOrganism(organism);
        assertNotNull(treatmentCompanies);
        assertTrue(CollectionUtils.isEmpty(treatmentCompanies));
        LOG.info(FIND_BY_ORGANISME_04);
    }
}

