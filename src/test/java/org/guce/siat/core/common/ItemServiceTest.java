package org.guce.siat.core.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.guce.siat.common.model.Item;
import org.guce.siat.common.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * The Class ItemServiceTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:TestConfig.xml")
public class ItemServiceTest
{

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(ItemServiceTest.class);

	/** The Constant FIND_BY_GOODS_ITEMS_CODE_01. */
	private static final String FIND_BY_GOODS_ITEMS_CODE_01 = "findByGoodsItemCode_01";

	/** The Constant FIND_BY_GOODS_ITEMS_CODE_02. */
	private static final String FIND_BY_GOODS_ITEMS_CODE_02 = "findByGoodsItemCode_02";

	/** The Constant GOODSITEMCODE. */
	private static final String GOODSITEMCODE = "18069031004";

	/** The item service. */
	@Autowired
	ItemService itemService;

	/**
	 * Gets the item service.
	 *
	 * @return the itemService
	 */
	public ItemService getItemService()
	{
		return itemService;
	}

	/**
	 * Sets the item service.
	 *
	 * @param itemService
	 *           the itemService to set
	 */
	public void setItemService(final ItemService itemService)
	{
		this.itemService = itemService;
	}

	/**
	 * Find by goods item code_01.
	 */
	@Test
	public void findByGoodsItemCode_01()
	{
		final Item item = itemService.findByGoodsItemCode(GOODSITEMCODE);
		assertNotNull(item);
		LOG.info(FIND_BY_GOODS_ITEMS_CODE_01);
	}

	/**
	 * Find by goods item code_02.
	 */
	@Test
	public void findByGoodsItemCode_02()
	{
		final Item item = itemService.findByGoodsItemCode(null);
		assertNull(item);
		LOG.info(FIND_BY_GOODS_ITEMS_CODE_02);
	}

}
