package org.guce.siat.core.ct.service;

import org.guce.siat.common.model.Flow;
import org.guce.siat.common.service.FlowService;
import org.guce.siat.common.utils.enums.FlowCode;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tadzotsa
 */
//@Transactional
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class CommonServiceTest {

    @Autowired
    private FlowService flowService;
    @Autowired
    private CommonService commonService;

    @Ignore
    @Test
    public void test() {
        final Flow flow = flowService.findFlowByCode(FlowCode.FL_CT_08.name());
        Assert.assertNotNull(flow);
    }

}
