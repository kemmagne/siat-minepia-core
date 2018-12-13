package org.guce.siat.core.common;

import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.AuthorityService;
import org.guce.siat.common.service.FileItemService;
import org.guce.siat.common.service.FileService;
import org.guce.siat.common.service.RecommandationService;
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
 * The Class RecommandationServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class RecommandationServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(RecommandationServiceTest.class);

    /**
     * The Constant FIND_RECOMMANDATION_FILE_01.
     */
    private static final String FIND_RECOMMANDATION_FILE_01 = "findRecommandationByFile_01";

    /**
     * The Constant FIND_RECOMMANDATION_FILE_02.
     */
    private static final String FIND_RECOMMANDATION_FILE_02 = "findRecommandationByFile_02";

    /**
     * The Constant FIND_RECOMMANDATION_FILE_03.
     */
    private static final String FIND_RECOMMANDATION_FILE_03 = "findRecommandationByFile_03";

    /**
     * The Constant FIND_RECOMMANDATION_FILEITEM_01.
     */
    private static final String FIND_RECOMMANDATION_FILEITEM_01 = "findrecommandationByFileItem_01";

    /**
     * The Constant FIND_RECOMMANDATION_FILEITEM_02.
     */
    private static final String FIND_RECOMMANDATION_FILEITEM_02 = "findrecommandationByFileItem_02";

    /**
     * The recommandation service.
     */
    @Autowired
    private RecommandationService recommandationService;

    /**
     * The file service.
     */
    @Autowired
    private FileService fileService;

    /**
     * The file item service.
     */
    @Autowired
    private FileItemService fileItemService;

    /**
     * The user service.
     */
    @Autowired
    private UserService userService;

    /**
     * The authority service.
     */
    @Autowired
    private AuthorityService authorityService;

    /**
     * Find recommandation by file_01.
     */
    @Ignore
    @Test
    public void findRecommandationByFile_01() {
        @SuppressWarnings("unused")
        final File file = fileService.find(Long.valueOf(Constants.ONE));
        //		final List<Recommandation> recommandationList = recommandationService.findRecommandationByFile(file);
        //		assertTrue(CollectionUtils.isNotEmpty(recommandationList));
        //		assertTrue(recommandationList.size() == Long.valueOf(Constants.FOUR));
        LOG.info(FIND_RECOMMANDATION_FILE_01);
    }

    /**
     * Find recommandation by file_02.
     */
    @Ignore
    @Test
    public void findRecommandationByFile_02() {
        @SuppressWarnings("unused")
        final File file = fileService.find(Long.valueOf(Constants.TWO));
        //		final List<Recommandation> recommandationList = recommandationService.findRecommandationByFile(file);
        //		assertNotNull(recommandationList);
        //		assertTrue(CollectionUtils.isEmpty(recommandationList));
        LOG.info(FIND_RECOMMANDATION_FILE_02);
    }

    /**
     * Find recommandation by file_03.
     */
    @Ignore
    @Test
    public void findRecommandationByFile_03() {
        //		final List<Recommandation> recommandationList = recommandationService.findRecommandationByFile(null);
        //		assertNotNull(recommandationList);
        //		assertTrue(CollectionUtils.isEmpty(recommandationList));
        LOG.info(FIND_RECOMMANDATION_FILE_03);
    }

    /**
     * Findrecommandation by file item_01.
     */
    @Ignore
    @Test
    public void findrecommandationByFileItem_01() {
        @SuppressWarnings("unused")
        final FileItem fileItem = fileItemService.find(Long.valueOf(Constants.ONE));
        //		final List<Recommandation> recommandationList = recommandationService.findRecommandationByFileItem(fileItem);
        //		assertTrue(CollectionUtils.isNotEmpty(recommandationList));
        //		assertTrue(recommandationList.size() == Long.valueOf(Constants.TWO));
        LOG.info(FIND_RECOMMANDATION_FILEITEM_01);
    }

    /**
     * Findrecommandation by file item_02.
     */
    @Ignore
    @Test
    public void findrecommandationByFileItem_02() {
        @SuppressWarnings("unused")
        final FileItem fileItem = fileItemService.find(Long.valueOf(Constants.THREE));
        //		final List<Recommandation> recommandationList = recommandationService.findRecommandationByFileItem(fileItem);
        //		assertNotNull(recommandationList);
        //		assertTrue(CollectionUtils.isEmpty(recommandationList));
        LOG.info(FIND_RECOMMANDATION_FILEITEM_01);
    }

    /**
     * Findrecommandation by file item_03.
     */
    @Ignore
    @Test
    public void findrecommandationByFileItem_03() {
        //		final List<Recommandation> recommandationList = recommandationService.findRecommandationByFileItem(null);
        //		assertNotNull(recommandationList);
        //		assertTrue(CollectionUtils.isEmpty(recommandationList));
        LOG.info(FIND_RECOMMANDATION_FILEITEM_02);
    }
}
