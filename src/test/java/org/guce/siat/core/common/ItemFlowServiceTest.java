package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.guce.siat.common.dao.ItemFlowDao;
import org.guce.siat.common.dao.ItemFlowDataDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.common.service.impl.ItemFlowServiceImpl;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class ItemFlowServiceTest.
 */
//@RunWith(MockitoJUnitRunner.class)
public class ItemFlowServiceTest {

    /**
     * The Constant LOG.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ItemFlowServiceTest.class);

    /**
     * The Constant FIND_LAST_ITEM_FLOW_BY_FILE_01.
     */
    private static final String FIND_LAST_ITEM_FLOW_BY_FILE_01 = "findLastItemFlowByFileItem_01";

    /**
     * The Constant FIND_LAST_ITEM_FLOW_BY_FILE_02.
     */
    private static final String FIND_LAST_ITEM_FLOW_BY_FILE_02 = "findLastItemFlowByFileItem_02";

    /**
     * The Constant FIND_LAST_SENT_ITEM_FLOW_BY_FILE_ITEM_01.
     */
    private static final String FIND_LAST_SENT_ITEM_FLOW_BY_FILE_ITEM_01 = "findLastSentItemFlowByFileItem_01";

    /**
     * The Constant FIND_LAST_SENT_ITEM_FLOW_BY_FILE_ITEM_02.
     */
    private static final String FIND_LAST_SENT_ITEM_FLOW_BY_FILE_ITEM_02 = "findLastSentItemFlowByFileItem_02";

    /**
     * The item flow service.
     */
    private ItemFlowServiceImpl itemFlowService;

    /**
     * The item flow dao.
     */
    @Mock
    private ItemFlowDao itemFlowDao;

    /**
     * The item flow data dao.
     */
    @Mock
    private ItemFlowDataDao itemFlowDataDao;

    /**
     * Sets the up.
     *
     * @throws Exception the exception
     */
    @Before
    public void setUp() throws Exception {
        itemFlowService = new ItemFlowServiceImpl();
        itemFlowService.setJpaDao(itemFlowDao);
        itemFlowService.setItemFlowDataDao(itemFlowDataDao);
    }

    /**
     * Find last item flow by file item_01. When method parametre is null we
     * must ensure that the returned result is null
     */
    @Ignore
    @Test
    public void findLastItemFlowByFileItem_01() {
        final ItemFlow itemFlow = itemFlowService.findLastItemFlowByFileItem(null);
        assertNull(itemFlow);
        LOG.info(FIND_LAST_ITEM_FLOW_BY_FILE_01);
    }

    /**
     * Find last item flow by file item_02. When method parametre is not null we
     * must ensure that the returned result is not null as well
     */
    @Ignore
    @Test
    public void findLastItemFlowByFileItem_02() {
        final FileItem fileItem = new FileItem();

        ItemFlow itemFlow = new ItemFlow();
        final Long id = Long.valueOf(1);
        fileItem.setId(id);
        Mockito.doReturn(itemFlow).when(itemFlowDao).findLastItemFlowByFileItem(fileItem);
        itemFlow = itemFlowService.findLastItemFlowByFileItem(fileItem);
        assertNotNull(itemFlow);
        LOG.info(FIND_LAST_ITEM_FLOW_BY_FILE_02);
    }

    /**
     * Find last sent item flow by file item_01. When method parameter is null
     * we must ensure that the returned result is null
     */
    @Ignore
    @Test
    public void findLastSentItemFlowByFileItem_01() {
        final ItemFlow itemFlow = itemFlowService.findLastSentItemFlowByFileItem(null);
        assertNull(itemFlow);
        LOG.info(FIND_LAST_SENT_ITEM_FLOW_BY_FILE_ITEM_01);
    }

    /**
     * Find last sent item flow by file item_02. When method parameter is not
     * null we must ensure that the returned result is not null as well
     */
    @Ignore
    @Test
    public void findLastSentItemFlowByFileItem_02() {
        final FileItem fileItem = new FileItem();
        fileItem.setId(Long.valueOf(1));

        ItemFlow itemFlow = new ItemFlow();
        Mockito.doReturn(itemFlow).when(itemFlowDao).findLastSentItemFlowByFileItem(fileItem);
        itemFlow = itemFlowService.findLastSentItemFlowByFileItem(fileItem);

        assertNotNull(itemFlow);
        LOG.info(FIND_LAST_SENT_ITEM_FLOW_BY_FILE_ITEM_02);
    }

}

