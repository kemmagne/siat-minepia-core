package org.guce.siat.common.dao;

import java.util.List;
import org.guce.siat.common.model.Container;
import org.guce.siat.common.model.File;
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
@ContextConfiguration("classpath:spring-config.xml")
public class CoreDaoTest {

    @Autowired
    private CoreDao dao;
    @Autowired
    private FileDao fileDao;

    /**
     * Test of save method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testSave_GenericType() {
    }

    /**
     * Test of save method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testSave_List() {
    }

    /**
     * Test of update method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testUpdate_GenericType() {
    }

    /**
     * Test of update method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testUpdate_List() {
    }

    /**
     * Test of delete method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testDelete_GenericType() {
    }

    /**
     * Test of deleteNoMerge method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testDeleteNoMerge_GenericType() {
    }

    /**
     * Test of delete method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testDelete_List() {
    }

    /**
     * Test of deleteNoMerge method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testDeleteNoMerge_List() {
    }

    /**
     * Test of findContainersByFile method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testFindContainersByFile() {
        File file = fileDao.findByNumDossierGuce("EM003865");
        List<Container> containersList = dao.findContainersByFile(file);
        Assert.assertFalse(containersList.isEmpty());
    }

    /**
     * Test of findContainerByFileAndNumber method, of class CoreDao.
     */
    @Ignore
    @Test
    public void testFindContainerByFileAndNumber() {
    }

}
