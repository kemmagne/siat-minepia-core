package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.User;
import org.guce.siat.common.model.UserAuthorityFileType;
import org.guce.siat.common.service.FileTypeService;
import org.guce.siat.common.service.UserAuthorityFileTypeService;
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
 * The Class UserAuthorityFileTypeServiceTest.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class UserAuthorityFileTypeServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(UserAuthorityFileTypeServiceTest.class);

    /**
     * The Constant FIND_USER_AUTHORITY_FILETYPE_BY_USER_01.
     */
    private static final String FIND_USER_AUTHORITY_FILETYPE_BY_USER_01 = "findUserAuthorityFileTypeByUser_01";

    /**
     * The Constant FIND_USER_AUTHORITY_FILETYPE_BY_USER_02.
     */
    private static final String FIND_USER_AUTHORITY_FILETYPE_BY_USER_02 = "findUserAuthorityFileTypeByUser_02";

    /**
     * The Constant FIND_USER_AUTHORITY_FILETYPE_BY_USER_03.
     */
    private static final String FIND_USER_AUTHORITY_FILETYPE_BY_USER_03 = "findUserAuthorityFileTypeByUser_03";

    /**
     * The Constant FIND_USER_AUTHORITY_FILETYPE_AND_USER_01.
     */
    private static final String FIND_USER_AUTHORITY_FILETYPE_BY_FILETYPE_AND_USER_01 = "findUserAuthorityFileTypeByFileTypeAndUser_01";

    /**
     * The Constant FIND_USER_AUTHORITY_FILETYPE_AND_USER_02.
     */
    private static final String FIND_USER_AUTHORITY_FILETYPE_BY_FILETYPE_AND_USER_02 = "findUserAuthorityFileTypeByFileTypeAndUser_02";

    /**
     * The Constant FIND_USER_AUTHORITY_FILETYPE_AND_USER_03.
     */
    private static final String FIND_USER_AUTHORITY_FILETYPE_BY_FILETYPE_AND_USER_03 = "findUserAuthorityFileTypeByFileTypeAndUser_03";

    /**
     * The Constant GET_FILETYPE_AND_AUTHORITY_BY_USER_01.
     */
    private static final String GET_FILETYPE_AND_AUTHORITY_BY_USER_01 = "getFileTypeAndAuthorityByUser_01";

    /**
     * The Constant GET_FILETYPE_AND_AUTHORITY_BY_USER_02.
     */
    private static final String GET_FILETYPE_AND_AUTHORITY_BY_USER_02 = "getFileTypeAndAuthorityByUser_02";

    /**
     * The Constant GET_FILETYPE_AND_AUTHORITY_BY_USER_03.
     */
    private static final String GET_FILETYPE_AND_AUTHORITY_BY_USER_03 = "getFileTypeAndAuthorityByUser_03";

    /**
     * The user service.
     */
    @Autowired
    private UserService userService;

    /**
     * The file type service.
     */
    @Autowired
    private FileTypeService fileTypeService;

    /**
     * The user authority file type service.
     */
    @Autowired
    private UserAuthorityFileTypeService userAuthorityFileTypeService;

    /**
     * Find user authority file type by user_01.
     */
    @Ignore
    @Test
    public void findUserAuthorityFileTypeByUser_01() {
        final User user = userService.find(Long.valueOf(Constants.FORTYONE));
        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService
                .findUserAuthorityFileTypeByUserList(Collections.singletonList(user));
        assertTrue(CollectionUtils.isNotEmpty(userAuthorityFileTypes));
        assertTrue(userAuthorityFileTypes.size() == Long.valueOf(Constants.ONE));
        assertTrue(userAuthorityFileTypes.get(Constants.ZERO).getFileType().getId() == Long.valueOf(Constants.ONE));
        assertTrue(userAuthorityFileTypes.get(Constants.ZERO).getUserAuthority().getId() == 135);

        LOG.info(FIND_USER_AUTHORITY_FILETYPE_BY_USER_01);
    }

    /**
     * Find user authority file type by user_02.
     */
    @Ignore
    @Test
    public void findUserAuthorityFileTypeByUser_02() {
        final User user = userService.find(Long.valueOf(Constants.FIVE));
        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService
                .findUserAuthorityFileTypeByUserList(Collections.singletonList(user));
        assertNotNull(userAuthorityFileTypes);
        assertTrue(CollectionUtils.isEmpty(userAuthorityFileTypes));

        LOG.info(FIND_USER_AUTHORITY_FILETYPE_BY_USER_02);
    }

    /**
     * Find user authority file type by user_03.
     */
    @Ignore
    @Test
    public void findUserAuthorityFileTypeByUser_03() {

        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService
                .findUserAuthorityFileTypeByUserList(null);
        assertNotNull(userAuthorityFileTypes);
        assertTrue(CollectionUtils.isEmpty(userAuthorityFileTypes));

        LOG.info(FIND_USER_AUTHORITY_FILETYPE_BY_USER_03);
    }

    /**
     * Find user authority file type by file type and user_01.
     */
    @Ignore
    @Test
    public void findUserAuthorityFileTypeByFileTypeAndUser_01() {

        final FileType fileType = fileTypeService.find(Long.valueOf(Constants.ONE));
        final User user = userService.find(Long.valueOf(Constants.FORTYONE));
        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService
                .findUserAuthorityFileTypeByFileTypeAndUserList(fileType, user.getMergedDelegatorList());
        assertTrue(CollectionUtils.isNotEmpty(userAuthorityFileTypes));
        assertTrue(userAuthorityFileTypes.size() == Long.valueOf(Constants.ONE));
        assertTrue(userAuthorityFileTypes.get(Constants.ZERO).getUserAuthority().getId() == 135);

        LOG.info(FIND_USER_AUTHORITY_FILETYPE_BY_FILETYPE_AND_USER_01);
    }

    /**
     * Find user authority file type by file type and user_02.
     */
    @Ignore
    @Test
    public void findUserAuthorityFileTypeByFileTypeAndUser_02() {
        final FileType fileType = fileTypeService.find(Long.valueOf(Constants.FIVE));
        final User user = userService.find(Long.valueOf(Constants.FIVE));
        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService
                .findUserAuthorityFileTypeByFileTypeAndUserList(fileType, user.getMergedDelegatorList());
        assertNotNull(userAuthorityFileTypes);
        assertTrue(CollectionUtils.isEmpty(userAuthorityFileTypes));

        LOG.info(FIND_USER_AUTHORITY_FILETYPE_BY_FILETYPE_AND_USER_02);
    }

    /**
     * Find user authority file type by file type and user_03.
     */
    @Ignore
    @Test
    public void findUserAuthorityFileTypeByFileTypeAndUser_03() {

        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService
                .findUserAuthorityFileTypeByFileTypeAndUserList(null, null);
        assertNotNull(userAuthorityFileTypes);
        assertTrue(CollectionUtils.isEmpty(userAuthorityFileTypes));

        LOG.info(FIND_USER_AUTHORITY_FILETYPE_BY_FILETYPE_AND_USER_03);
    }

    /**
     * Gets the file type and authority by user_01.
     */
    @Ignore
    @Test
    public void getFileTypeAndAuthorityByUser_01() {
        final User user = userService.find(Long.valueOf(Constants.FORTYONE));
        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService.getFileTypeAndAuthorityByUser(user);
        assertTrue(CollectionUtils.isNotEmpty(userAuthorityFileTypes));
        assertTrue(userAuthorityFileTypes.get(Constants.ZERO).getUserAuthority().getId() == 135);
        assertTrue(userAuthorityFileTypes.get(Constants.ZERO).getFileType().getId() == Long.valueOf(Constants.ONE));

        LOG.info(GET_FILETYPE_AND_AUTHORITY_BY_USER_01);
    }

    /**
     * Gets the file type and authority by user_02.
     */
    @Ignore
    @Test
    public void getFileTypeAndAuthorityByUser_02() {
        final User user = userService.find(Long.valueOf(Constants.FIVE));
        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService.getFileTypeAndAuthorityByUser(user);
        assertNotNull(userAuthorityFileTypes);
        assertTrue(CollectionUtils.isEmpty(userAuthorityFileTypes));

        LOG.info(GET_FILETYPE_AND_AUTHORITY_BY_USER_02);
    }

    /**
     * Gets the file type and authority by user_03.
     */
    @Ignore
    @Test
    public void getFileTypeAndAuthorityByUser_03() {

        final List<UserAuthorityFileType> userAuthorityFileTypes = userAuthorityFileTypeService.getFileTypeAndAuthorityByUser(null);
        assertNotNull(userAuthorityFileTypes);
        assertTrue(CollectionUtils.isEmpty(userAuthorityFileTypes));

        LOG.info(GET_FILETYPE_AND_AUTHORITY_BY_USER_03);
    }
}

