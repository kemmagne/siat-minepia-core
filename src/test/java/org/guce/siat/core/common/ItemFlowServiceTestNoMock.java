package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.ItemFlowService;
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
 * The Class ItemFlowServiceTestNoMock.
 */
//@Transactional
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:TestConfig.xml")
public class ItemFlowServiceTestNoMock {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ItemFlowServiceTestNoMock.class);

    private static final String FIND_ITEM_FLOW_BY_FILE_ITEM_01 = "findItemFlowByFileItem_01";

    private static final String FIND_ITEM_FLOW_BY_FILE_ITEM_02 = "findItemFlowByFileItem_02";

    /**
     * The item flow service.
     */
    @Autowired
    ItemFlowService itemFlowService;

    /**
     * Find item flow by file item_01.
     */
    @Ignore
    @Test
    public void findItemFlowByFileItem_01() {
        final FileItem fileItem = new FileItem(Long.valueOf(1));
        final List<ItemFlow> itemFlowList = itemFlowService.findItemFlowByFileItem(fileItem);
        assertNotNull(itemFlowList);
        assertTrue(!itemFlowList.isEmpty());
        LOG.info(FIND_ITEM_FLOW_BY_FILE_ITEM_01);
    }

    /**
     * Find item flow by file item_02.
     */
    public void findItemFlowByFileItem_02() {
        final FileItem fileItem = new FileItem();
        final List<ItemFlow> itemFlowList = itemFlowService.findItemFlowByFileItem(fileItem);
        assertNotNull(itemFlowList);
        assertTrue(itemFlowList.isEmpty());
        LOG.info(FIND_ITEM_FLOW_BY_FILE_ITEM_02);
    }
}
