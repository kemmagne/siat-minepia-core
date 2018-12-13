/**
 *
 */
package org.guce.siat.core.ct.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.core.ct.model.TreatmentType;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * The Class TreatmentTypeServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class TreatmentTypeServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(TreatmentTypeServiceTest.class);

    /**
     * The Constant TEST_FIND_BY_ORGANISME_01.
     */
    private static final String TEST_FIND_BY_ORGANISM_01 = "testFindByOrganism_01";

    /**
     * The Constant TEST_FIND_BY_ORGANISME_02.
     */
    private static final String TEST_FIND_BY_ORGANISM_02 = "testFindByOrganism_02";

    /**
     * The Constant TEST_FIND_BY_ORGANISME_03.
     */
    private static final String TEST_FIND_BY_ORGANISM_03 = "testFindByOrganism_03";

    /**
     * The Constant TEST_FIND_BY_ORGANISME_04.
     */
    private static final String TEST_FIND_BY_ORGANISM_04 = "testFindByOrganism_04";

    /**
     * The Constant LABEL_EN.
     */
    private static final String LABEL_EN = "Treatment Type DDPIA";

    /**
     * The Constant LABEL_FR.
     */
    private static final String LABEL_FR = "Type Traitement DDPIA";

    /**
     * The treatment type service.
     */
    @Autowired
    TreatmentTypeService treatmentTypeService;

    /**
     * The organism service.
     */
    @Autowired
    OrganismService organismService;

    /**
     * Test find by organism_01.
     */
    @Ignore
    @Test
    public void findByOrganism_01() {
        final Organism organism = organismService.find(Long.valueOf(Constants.THIRTYTHREE));
        final List<TreatmentType> treatmentTypes = treatmentTypeService.findByOrganism(organism);
        assertTrue(CollectionUtils.isNotEmpty(treatmentTypes));
        assertTrue(treatmentTypes.size() == Constants.ONE);
        assertEquals(LABEL_FR, treatmentTypes.get(Constants.ZERO).getLabelFr());
        assertEquals(LABEL_EN, treatmentTypes.get(Constants.ZERO).getLabelEn());
        LOG.info(TEST_FIND_BY_ORGANISM_01);
    }

    /**
     * Test find by organisme_02.
     */
    @Ignore
    @Test
    public void findByOrganism_02() {
        final Organism organism = organismService.find(Long.valueOf(Constants.FIFTEEN));
        final List<TreatmentType> treatmentTypes = treatmentTypeService.findByOrganism(organism);
        assertNotNull(treatmentTypes);
        assertTrue(CollectionUtils.isEmpty(treatmentTypes));
        assertTrue(treatmentTypes.size() == Constants.ZERO);
        LOG.info(TEST_FIND_BY_ORGANISM_02);
    }

    /**
     * Test find by organisme_03.
     */
    @Ignore
    @Test
    public void findByOrganism_03() {
        final List<TreatmentType> treatmentTypes = treatmentTypeService.findByOrganism(null);
        assertNotNull(treatmentTypes);
        assertTrue(CollectionUtils.isEmpty(treatmentTypes));
        assertTrue(treatmentTypes.size() == Constants.ZERO);
        LOG.info(TEST_FIND_BY_ORGANISM_03);
    }

    /**
     * Test find by organisme_04.
     */
    @Ignore
    @Test
    public void findByOrganism_04() {
        final Organism organism = organismService.find(Long.valueOf(Constants.THIRTYONE));/* deleted = true */
        final List<TreatmentType> treatmentTypes = treatmentTypeService.findByOrganism(organism);
        assertNotNull(treatmentTypes);
        assertTrue(CollectionUtils.isEmpty(treatmentTypes));
        assertTrue(treatmentTypes.size() == Constants.ZERO);
        LOG.info(TEST_FIND_BY_ORGANISM_04);
    }

}

