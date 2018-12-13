package org.guce.siat.core.gr.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.FileItemService;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.core.gr.dao.CiblageDao;
import org.guce.siat.core.gr.model.Ciblage;
import org.guce.siat.core.gr.utils.filter.CiblageFilter;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class CiblageServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
//@Transactional
public class CiblageServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(CiblageServiceTest.class);

    /**
     * The Constant FIND_CIBLAGE_FOR_RISK_MANAGMENT_01.
     */
    private static final String FIND_CIBLAGE_FOR_RISK_MANAGMENT_01 = "findCiblageforRiskManagment_01";

    /**
     * The Constant FIND_CIBLAGE_FOR_RISK_MANAGMENT_02.
     */
    private static final String FIND_CIBLAGE_FOR_RISK_MANAGMENT_02 = "findCiblageforRiskManagment_02";

    /**
     * The Constant FIND_By_Filter_01.
     */
    private static final String FIND_By_Filter_01 = "finByFilter_01";

    /**
     * The Constant FIND_By_Filter_02.
     */
    private static final String FIND_By_Filter_02 = "finByFilter_02";

    /**
     * The Constant FIND_By_Filter_03.
     */
    private static final String FIND_By_Filter_03 = "finByFilter_03";

    /**
     * The Constant FIND_By_Filter_04.
     */
    private static final String FIND_By_Filter_04 = "finByFilter_04";

    /**
     * The ciblage service.
     */
    @Autowired
    private CiblageDao ciblageDao;

    /**
     * The file item service.
     */
    @Autowired
    private FileItemService fileItemService;

    /**
     * The ciblage service.
     */
    @Autowired
    private CiblageService ciblageService;

    /**
     * Find ciblagefor risk managment_01.
     */
    @Ignore
    @Test
    public void findCiblageforRiskManagment_01() {
        final FileItem fileItem = fileItemService.find(Long.valueOf(1));
        final List<Ciblage> listCiblage = ciblageDao.findCiblageforRiskManagment(fileItem, null);
        assertTrue(CollectionUtils.isNotEmpty(listCiblage));
        LOG.info(FIND_CIBLAGE_FOR_RISK_MANAGMENT_01);
    }

    /**
     * Find ciblagefor risk managment_02.
     */
    @Ignore
    @Test
    public void findCiblageforRiskManagment_02() {
        final FileItem fileItem = fileItemService.find(Long.valueOf(2));
        final List<Ciblage> listCiblage = ciblageDao.findCiblageforRiskManagment(fileItem, null);
        assertTrue(CollectionUtils.isNotEmpty(listCiblage));
        assertEquals(1, listCiblage.size());
        assertTrue(Long.valueOf(Constants.ONE).equals(listCiblage.get(0).getId()));
        LOG.info(FIND_CIBLAGE_FOR_RISK_MANAGMENT_02);
    }

    /**
     * Find by filter_01.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
    @Test
    public void findByFilter_01() throws ParseException {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.ONE);

        final Date beginDate = calendar.getTime();

        calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.TWENTYFIVE);
        final Date endDate = calendar.getTime();

        final CiblageFilter filter = new CiblageFilter();

        filter.setBeginDate(beginDate);
        filter.setEndDate(endDate);

        final List<Ciblage> listCiblage = ciblageService.findByFilter(filter);
        assertTrue(CollectionUtils.isNotEmpty(listCiblage));
        assertEquals(2, listCiblage.size());
        assertTrue(Long.valueOf(Constants.THREE).equals(listCiblage.get(0).getId()));
        assertTrue(Long.valueOf(Constants.FOUR).equals(listCiblage.get(1).getId()));
        LOG.info(FIND_By_Filter_01);
    }

    /**
     * Find by filter_02.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
    @Test
    public void findByFilter_02() throws ParseException {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.ONE);

        final Date beginDate = calendar.getTime();

        final Date endDate = null;
        final CiblageFilter filter = new CiblageFilter();

        filter.setBeginDate(beginDate);
        filter.setEndDate(endDate);

        final List<Ciblage> listCiblage = ciblageService.findByFilter(filter);
        assertTrue(CollectionUtils.isNotEmpty(listCiblage));
        assertEquals(4, listCiblage.size());
        assertTrue(Long.valueOf(Constants.ONE).equals(listCiblage.get(0).getId()));
        assertTrue(Long.valueOf(Constants.TWO).equals(listCiblage.get(1).getId()));
        assertTrue(Long.valueOf(Constants.THREE).equals(listCiblage.get(2).getId()));
        assertTrue(Long.valueOf(Constants.FOUR).equals(listCiblage.get(3).getId()));
        LOG.info(FIND_By_Filter_02);
    }

    /**
     * Find by filter_03.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
    @Test
    public void findByFilter_03() throws ParseException {
        final Date beginDate = null;

        final Calendar calendar = Calendar.getInstance();
        calendar.set(Constants.TWO_THOUSAND_AND_FIFTEEN, Constants.FOUR, Constants.TWENTYFIVE);
        final Date endDate = calendar.getTime();

        final CiblageFilter filter = new CiblageFilter();

        filter.setBeginDate(beginDate);
        filter.setEndDate(endDate);

        final List<Ciblage> listCiblage = ciblageService.findByFilter(filter);
        assertTrue(CollectionUtils.isNotEmpty(listCiblage));
        assertEquals(2, listCiblage.size());
        assertTrue(Long.valueOf(Constants.THREE).equals(listCiblage.get(0).getId()));
        assertTrue(Long.valueOf(Constants.FOUR).equals(listCiblage.get(1).getId()));
        LOG.info(FIND_By_Filter_03);
    }

    /**
     * Find by filter_04.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
    @Test
    public void findByFilter_04() throws ParseException {
        final Date beginDate = null;
        final Date endDate = null;

        final CiblageFilter filter = new CiblageFilter();

        filter.setBeginDate(beginDate);
        filter.setEndDate(endDate);

        final List<Ciblage> listCiblage = ciblageService.findByFilter(filter);
        assertTrue(CollectionUtils.isNotEmpty(listCiblage));
        assertEquals(4, listCiblage.size());
        assertTrue(Long.valueOf(Constants.ONE).equals(listCiblage.get(0).getId()));
        assertTrue(Long.valueOf(Constants.TWO).equals(listCiblage.get(1).getId()));
        assertTrue(Long.valueOf(Constants.THREE).equals(listCiblage.get(2).getId()));
        assertTrue(Long.valueOf(Constants.FOUR).equals(listCiblage.get(3).getId()));
        LOG.info(FIND_By_Filter_04);
    }
}
