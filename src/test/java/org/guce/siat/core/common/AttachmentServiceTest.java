package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.guce.siat.common.model.Attachment;
import org.guce.siat.common.model.File;
import org.guce.siat.common.service.AttachmentService;
import org.guce.siat.common.service.FileService;
import org.guce.siat.common.utils.Constants;
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
 * The Class AttachmentServiceTest.
 */
//@Transactional
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class AttachmentServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(AttachmentServiceTest.class);

    /**
     * The Constant FIND_ATTACHMENTS_BY_FILE_01.
     */
    private static final String FIND_ATTACHMENTS_BY_FILE_01 = "findAttachmentsByFile_01";

    /**
     * The Constant FIND_ATTACHMENTS_BY_FILE_02.
     */
    private static final String FIND_ATTACHMENTS_BY_FILE_02 = "findAttachmentsByFile_02";

    /**
     * The Constant FIND_ATTACHMENTS_BY_FILE_02.
     */
    private static final String FIND_ATTACHMENTS_BY_FILE_03 = "findAttachmentsByFile_03";

    /**
     * The attachment service.
     */
    @Autowired
    AttachmentService attachmentService;

    /**
     * The file service.
     */
    @Autowired
    FileService fileService;

    /**
     * Find attachments by file_01.
     */
    @Ignore
    @Test
    public void findAttachmentsByFile_01() {
        final File file = fileService.find(Long.valueOf(Constants.ONE));
        final List<Attachment> attachmentList = attachmentService.findAttachmentsByFile(file);
        assertTrue(CollectionUtils.isNotEmpty(attachmentList));
        assertTrue(attachmentList.size() == Constants.TWO);
        assertTrue(attachmentList.get(Constants.ZERO).getId() == Long.valueOf(Constants.ONE));
        assertTrue(attachmentList.get(Constants.ONE).getId() == Long.valueOf(Constants.TWO));
        LOG.info(FIND_ATTACHMENTS_BY_FILE_01);
    }

    /**
     * Find attachments by file_02.
     */
    @Ignore
    @Test
    public void findAttachmentsByFile_02() {
        final File file = fileService.find(Long.valueOf(Constants.TWO));
        final List<Attachment> attachmentList = attachmentService.findAttachmentsByFile(file);
        assertNotNull(attachmentList);
        assertTrue(CollectionUtils.isEmpty(attachmentList));
        LOG.info(FIND_ATTACHMENTS_BY_FILE_02);
    }

    /**
     * Find attachments by file_03.
     */
    @Ignore
    @Test
    public void findAttachmentsByFile_03() {
        final List<Attachment> attachmentList = attachmentService.findAttachmentsByFile(null);
        assertNotNull(attachmentList);
        assertTrue(CollectionUtils.isEmpty(attachmentList));
        LOG.info(FIND_ATTACHMENTS_BY_FILE_03);
    }
}
