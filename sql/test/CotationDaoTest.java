package org.guce.siat.core.ct.dao;

import java.util.List;
import org.guce.siat.common.model.Bureau;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.dao.config.H2DataSourceConfig;
import org.guce.siat.core.ct.util.enums.CctExportProductType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ht
 */
@Transactional(readOnly = true)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {H2DataSourceConfig.class})
public class CotationDaoTest {

    @Autowired
    private CotationDao cotationDao;

    /**
     * Test of findCotationAgentsByBureauAndRoleAndProductType method, of class
     * CotationDao.
     */
    @Test
    public void testFindCotationAgentsByBureauAndRoleAndProductType() {
    }

    /**
     * Test of findUserForCotation method, of class CotationDao.
     */
    @Test
    public void test_findUserForCotation() {
    }

    @Test
    public void test_findUsersForCotation() {
        Bureau bureau = new Bureau();
        bureau.setId(287l);
        CctExportProductType productType = CctExportProductType.GR;
        List<User> potentialUsers = cotationDao.findUsersForCotation(bureau, productType);
        System.out.println(potentialUsers);
    }

}
