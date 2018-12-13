package org.guce.siat.core.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Ministry;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.model.User;
import org.guce.siat.common.service.MinistryService;
import org.guce.siat.common.service.OrganismService;
import org.guce.siat.common.service.UserService;
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
 * The Class OrganismServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class OrganismServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(OrganismServiceTest.class);

    /**
     * The Constant FIND_ORGANISM_BY_USER__01.
     */
    private static final String FIND_ORGANISM_BY_USER__01 = "findOrganismByUserAndService_01";

    /**
     * The Constant FIND_ORGANISM_BY_USER__02.
     */
    private static final String FIND_ORGANISM_BY_USER__02 = "findOrganismByUserAndService_02";

    /**
     * The Constant FIND_ORGANISM_BY_USER__03.
     */
    private static final String FIND_ORGANISM_BY_USER__03 = "findOrganismByUserAndService_03";

    /**
     * The Constant FIND_ORGANISM_BY_MINISTRY__01.
     */
    private static final String FIND_ORGANISM_BY_MINISTRY_01 = "findOrganismByMinistry_01";

    /**
     * The Constant FIND_ORGANISM_BY_MINISTRY__02.
     */
    private static final String FIND_ORGANISM_BY_MINISTRY_02 = "findOrganismByMinistry_02";

    /**
     * The Constant FIND_ORGANISM_BY_MINISTRY__03.
     */
    private static final String FIND_ORGANISM_BY_MINISTRY_03 = "findOrganismByMinistry_03";

    /**
     * The Constant HAS_DIRECTOR_AFFECTED_01.
     */
    private static final String HAS_DIRECTOR_AFFECTED_01 = "hasDirectorAffected_01";

    /**
     * The Constant HAS_DIRECTOR_AFFECTED_02.
     */
    private static final String HAS_DIRECTOR_AFFECTED_02 = "hasDirectorAffected_02";

    /**
     * The Constant HAS_DIRECTOR_AFFECTED_03.
     */
    private static final String HAS_DIRECTOR_AFFECTED_03 = "hasDirectorAffected_03";

    /**
     * The Constant FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_01.
     */
    private static final String FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_01 = "findOrganismNotHaveAdminByMinistry_01";

    /**
     * The Constant FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_02.
     */
    private static final String FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_02 = "findOrganismNotHaveAdminByMinistry_02";

    /**
     * The Constant FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_03.
     */
    private static final String FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_03 = "findOrganismNotHaveAdminByMinistry_03";

    /**
     * The organism service.
     */
    @Autowired
    private OrganismService organismService;

    /**
     * The user service.
     */
    @Autowired
    private UserService userService;

    /**
     * The ministry service.
     */
    @Autowired
    private MinistryService ministryService;

    /**
     * Find organism by user_01.
     */
    @Ignore
    @Test
    public void findOrganismByUser_01() {
        final User user = userService.find(Long.valueOf(Constants.ONE));
        final Organism organism = organismService.findOrganismByUser(user);
        assertNull(organism);

        LOG.info(FIND_ORGANISM_BY_USER__01);
    }

    /**
     * Find organism by user_02.
     */
    @Ignore
    @Test
    public void findOrganismByUser_02() {
        final User user = userService.find(Long.valueOf(Constants.FOUR));
        final Organism organism = organismService.findOrganismByUser(user);
        assertNotNull(organism);
        assertTrue(organism.getId() == Long.valueOf(Constants.THIRTYONE));

        LOG.info(FIND_ORGANISM_BY_USER__02);
    }

    /**
     * Find organism by user_03.
     */
    @Ignore
    @Test
    public void findOrganismByUser_03() {
        final Organism organism = organismService.findOrganismByUser(null);
        assertNull(organism);

        LOG.info(FIND_ORGANISM_BY_USER__03);
    }

    /**
     * Find organisms by ministry_01.
     */
    @Ignore
    @Test
    public void findOrganismsByMinistry_01() {
        final Ministry ministry = ministryService.find(Long.valueOf(Constants.ONE));
        final List<Organism> organisms = organismService.findOrganismsByMinistry(ministry);
        assertTrue(CollectionUtils.isNotEmpty(organisms));
        assertTrue(organisms.size() == Constants.TWO);
        assertTrue(organisms.get(Constants.ZERO).getId() == Long.valueOf(Constants.TWO));
        assertTrue(organisms.get(Constants.ONE).getId() == Long.valueOf(Constants.THREE));

        LOG.info(FIND_ORGANISM_BY_MINISTRY_01);
    }

    /**
     * Find organisms by ministry_02.
     */
    @Ignore
    @Test
    public void findOrganismsByMinistry_02() {
        final Ministry ministry = ministryService.find(Long.valueOf(Constants.TWO));
        final List<Organism> organisms = organismService.findOrganismsByMinistry(ministry);
        assertNotNull(organisms);
        assertTrue(CollectionUtils.isEmpty(organisms));

        LOG.info(FIND_ORGANISM_BY_MINISTRY_02);
    }

    /**
     * Find organisms by ministry_03.
     */
    @Ignore
    @Test
    public void findOrganismsByMinistry_03() {
        final List<Organism> organisms = organismService.findOrganismsByMinistry(null);
        assertTrue(CollectionUtils.isEmpty(organisms));

        LOG.info(FIND_ORGANISM_BY_MINISTRY_03);
    }

    /**
     * Checks for director affected_01.
     */
    @Ignore
    @Test
    public void hasDirectorAffected_01() {
        final Organism organism = organismService.find(Long.valueOf(Constants.TWO));
        final boolean hasDirectorAffected = organismService.hasDirectorAffected(organism);
        assertTrue(hasDirectorAffected);

        LOG.info(HAS_DIRECTOR_AFFECTED_01);
    }

    /**
     * Checks for director affected_02.
     */
    @Ignore
    @Test
    public void hasDirectorAffected_02() {
        final Organism oraganism = organismService.find(Long.valueOf(Constants.ONE));
        final boolean hasDirectorAffected = organismService.hasDirectorAffected(oraganism);
        assertFalse(hasDirectorAffected);

        LOG.info(HAS_DIRECTOR_AFFECTED_02);
    }

    /**
     * Checks for director affected_03.
     */
    @Ignore
    @Test
    public void hasDirectorAffected_03() {
        final boolean hasDirectorAffected = organismService.hasDirectorAffected(null);
        assertFalse(hasDirectorAffected);

        LOG.info(HAS_DIRECTOR_AFFECTED_03);
    }

    /**
     * Find organism not have admin by ministry_01.
     */
    @Ignore
    @Test
    public void findOrganismNotHaveAdminByMinistry_01() {
        final Ministry ministry = ministryService.find(Long.valueOf(Constants.SIXTY_TWO));
        final List<Organism> organisms = organismService.findOrganismNotHaveAdminByMinistry(ministry);
        assertNotNull(organisms);
        assertTrue(CollectionUtils.isNotEmpty(organisms));
        assertTrue(organisms.get(Constants.ZERO).getId() == Long.valueOf(Constants.SEVENTY_SEVEN));

        LOG.info(FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_01);
    }

    /**
     * Find organism not have admin by ministry_02.
     */
    @Ignore
    @Test
    public void findOrganismNotHaveAdminByMinistry_02() {
        final Ministry ministry = ministryService.find(Long.valueOf(Constants.TWO));
        final List<Organism> organisms = organismService.findOrganismNotHaveAdminByMinistry(ministry);
        assertNotNull(organisms);
        assertTrue(CollectionUtils.isEmpty(organisms));

        LOG.info(FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_02);
    }

    /**
     * Find organism not have admin by ministry_03.
     */
    @Ignore
    @Test
    public void findOrganismNotHaveAdminByMinistry_03() {
        final List<Organism> organisms = organismService.findOrganismNotHaveAdminByMinistry(null);
        assertNotNull(organisms);
        assertTrue(CollectionUtils.isEmpty(organisms));
        LOG.info(FIND_ORGANISM_NOT_HAVE_ADMIN_BY_MINISTRY_03);
    }
}
