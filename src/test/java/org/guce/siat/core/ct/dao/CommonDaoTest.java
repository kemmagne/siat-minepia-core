package org.guce.siat.core.ct.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.guce.siat.core.ct.dao.config.H2DataSourceConfig;
import org.guce.siat.core.ct.filter.CteFilter;
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
public class CommonDaoTest {

    @Autowired
    private CommonDao commonDao;

    @Test
    public void test_getGlobalDelayListing() {
        CteFilter filter = new CteFilter();
        Calendar calendar = Calendar.getInstance();
        filter.setCreationFromDate(calendar.getTime());
        filter.setCreationToDate(calendar.getTime());
        List<Long> fileTypeIdList = new ArrayList<>();
//        List<Object[]> list = commonDao.getGlobalDelayListing(filter, fileTypeIdList);
    }

    @Test
    public void test_getGlobalQuantityListing() {
        CteFilter filter = new CteFilter();
        Calendar calendar = Calendar.getInstance();
        filter.setCreationFromDate(calendar.getTime());
        filter.setCreationToDate(calendar.getTime());
        List<Long> fileTypeIdList = new ArrayList<>();
//        List<Object[]> list = commonDao.getGlobalQuantityListing(filter, fileTypeIdList);
    }

}
