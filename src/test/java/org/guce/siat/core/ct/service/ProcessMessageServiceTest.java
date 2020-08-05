package org.guce.siat.core.ct.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.guce.siat.common.dao.CoreDao;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.model.File;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.ProcessMessageService;
import org.guce.siat.common.utils.enums.StepCode;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ht
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DataSourceConfig.class})
@ContextConfiguration("classpath:spring-config.xml")
public class ProcessMessageServiceTest {

    @Autowired
    private CtDocumentReciever documentReciever;
    @Autowired
    private ProcessMessageService processMessageService;
    @Autowired
    private FileDao fileDao;
    @Autowired
    private CoreDao dao;

    @Ignore
    @Test
    public void testProcess() throws IOException {
        File file = fileDao.findByNumDossierGuce("EM003865");
        Assert.assertNotNull(file);
        InputStream is = new FileInputStream("C:\\Users\\ht\\Downloads\\20200804-134925-78414@172.17.0.1.ebxml");
        processMessageService.process(IOUtils.toByteArray(is), documentReciever);
        List<FileItem> fileItems = file.getFileItemsList();
        Assert.assertFalse(fileItems.isEmpty());
        FileItem fileItem = fileItems.get(0);
        Assert.assertEquals(StepCode.ST_CT_46, fileItem.getStep().getStepCode());
    }

    @Ignore
    @Test
    public void testSomeMethod() {
    }

}
