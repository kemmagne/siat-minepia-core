package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Ministry;
import org.guce.siat.common.service.FileTypeService;
import org.guce.siat.common.service.MinistryService;
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
 * The Class CarServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class FileTypeServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(FileTypeServiceTest.class);

    /**
     * The Constant FIND_FILETYPE_BY_MINISTRY_01.
     */
    private static final String FIND_FILETYPE_BY_MINISTRY_01 = "findFileTypeByMinistry_01";

    /**
     * The Constant FIND_FILETYPE_BY_MINISTRY_02.
     */
    private static final String FIND_FILETYPE_BY_MINISTRY_02 = "findFileTypeByMinistry_02";

    /**
     * The Constant FIND_FILETYPE_BY_MINISTRY_03.
     */
    private static final String FIND_FILETYPE_BY_MINISTRY_03 = "findFileTypeByMinistry_03";

    /**
     * The file type service.
     */
    @Autowired
    private FileTypeService fileTypeService;

    /**
     * The ministry service.
     */
    @Autowired
    private MinistryService ministryService;

    /**
     * Find file type by ministry_01.
     */
    @Ignore
    @Test
    public void findFileTypeByMinistry_01() {
        final Ministry ministry = ministryService.find(Long.valueOf(Constants.ONE));
        final List<FileType> fileTypes = fileTypeService.findFileTypeByMinistry(ministry);
        assertTrue(CollectionUtils.isNotEmpty(fileTypes));
        assertTrue(fileTypes.size() == Constants.NINE);
        assertTrue(fileTypes.get(Constants.ZERO).getId() == Long.valueOf(Constants.ONE));
        assertTrue(fileTypes.get(Constants.ONE).getId() == Long.valueOf(Constants.TWO));
        assertTrue(fileTypes.get(Constants.THREE).getId() == Long.valueOf(Constants.FOUR));
        assertTrue(fileTypes.get(Constants.FOUR).getId() == Long.valueOf(Constants.FIVE));
        assertTrue(fileTypes.get(Constants.FIVE).getId() == Long.valueOf(Constants.SIX));
        assertTrue(fileTypes.get(Constants.SIX).getId() == Long.valueOf(Constants.NINETEEN));
        assertTrue(fileTypes.get(Constants.SEVEN).getId() == Long.valueOf(Constants.TWENTY));
        assertTrue(fileTypes.get(Constants.EIGHT).getId() == Long.valueOf(Constants.TWENTYONE));

        LOG.info(FIND_FILETYPE_BY_MINISTRY_01);
    }

    /**
     * Find file type by ministry_02.
     */
    @Ignore
    @Test
    public void findFileTypeByMinistry_02() {
        final Ministry ministry = ministryService.find(Long.valueOf(Constants.TWO));
        final List<FileType> fileTypes = fileTypeService.findFileTypeByMinistry(ministry);
        assertNotNull(fileTypes);
        assertTrue(CollectionUtils.isEmpty(fileTypes));

        LOG.info(FIND_FILETYPE_BY_MINISTRY_02);
    }

    /**
     * Find file type by ministry_03.
     */
    @Ignore
    @Test
    public void findFileTypeByMinistry_03() {

        final List<FileType> fileTypes = fileTypeService.findFileTypeByMinistry(null);
        assertNotNull(fileTypes);
        assertTrue(CollectionUtils.isEmpty(fileTypes));

        LOG.info(FIND_FILETYPE_BY_MINISTRY_03);
    }
}

