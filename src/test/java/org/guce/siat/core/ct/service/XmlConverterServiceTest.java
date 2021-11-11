package org.guce.siat.core.ct.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.JAXBException;
import org.guce.orchestra.util.JAXBUtil;
import org.guce.siat.common.dao.CoreDao;
import org.guce.siat.common.dao.FileDao;
import org.guce.siat.common.model.Container;
import org.guce.siat.common.model.File;
import org.guce.siat.core.ct.dao.config.DataSourceConfig;
import org.guce.siat.core.ct.service.impl.XmlConverterServiceImpl;
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
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {DataSourceConfig.class})
public class XmlConverterServiceTest {

    @Autowired
    private CoreDao dao;
    @Autowired
    private FileDao fileDao;
    private XmlConverterServiceImpl xmlConverterServiceImpl = new XmlConverterServiceImpl();

    @Ignore
    @Test
    public void testPopulateContainers() throws FileNotFoundException, JAXBException {
        System.out.println("org.guce.siat.core.ct.service.XmlConverterServiceTest.testPopulateContainers()");
        InputStream is = new FileInputStream("C:\\Users\\ht\\Downloads\\20200729-130908-76600@172.24.2.20.xml");
        org.guce.siat.jaxb.cct.PVE.DOCUMENT document = JAXBUtil.unmarshall(is, org.guce.siat.jaxb.cct.PVE.DOCUMENT.class, false);
        File file;
        Long id = 1210L;
        file = fileDao.find(id);
        xmlConverterServiceImpl.setDao(dao);
        xmlConverterServiceImpl.populateContainers(document, file);
        List<String> list = new ArrayList<>();
        for (Container container : file.getContainers()) {
            list.add(container.getContNumber());
        }
        Assert.assertEquals(Arrays.asList("MRKU9352740", "GCNU1281965", "ACLU2802370", "GCNU1205420", "GCNU1252740", "GCNU1269717"), list);
    }

    @Ignore
    @Test
    public void test() {
        System.out.println("org.guce.siat.core.ct.service.XmlConverterServiceTest.test()");
    }

}
