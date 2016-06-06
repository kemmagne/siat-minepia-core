package org.guce.siat.core.ct.service.impl;

import java.util.Date;
import java.util.List;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.core.ct.dao.TradeBalanceConfigDao;
import org.guce.siat.core.ct.model.TradeBalanceConfig;
import org.guce.siat.core.ct.service.TradeBalanceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 * The Class TradeBalanceConfigServiceImpl.
 */
@Service("tradeBalanceConfigService")
@Transactional(readOnly = true)
public class TradeBalanceConfigServiceImpl extends AbstractServiceImpl<TradeBalanceConfig> implements TradeBalanceConfigService
{

	/** The trade balance config dao. */
	@Autowired
	private TradeBalanceConfigDao tradeBalanceConfigDao;

	/**
	 * Instantiates a new trade balance config service impl.
	 */
	public TradeBalanceConfigServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<TradeBalanceConfig> getJpaDao()
	{

		return tradeBalanceConfigDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<TradeBalanceConfig> jpaDao)
	{
		this.tradeBalanceConfigDao = (TradeBalanceConfigDao) jpaDao;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TradeBalanceConfigService#findAllTradeBalanceConfig()
	 */
	@Override
	public List<TradeBalanceConfig> findAllTradeBalanceConfig()
	{

		return tradeBalanceConfigDao.findAllTradeBalanceConfig();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TradeBalanceConfigService#existTradeBalanceConfigByCode(java.lang.String,
	 * java.lang.Long, java.lang.String)
	 */
	@Override
	public Boolean existTradeBalanceConfigByCode(final String code, final Long id, final String type)
	{

		return tradeBalanceConfigDao.existTradeBalanceConfigByCode(code, id, type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TradeBalanceConfigService#existNSHCodeInItem(java.lang.String)
	 */
	@Override
	public Boolean existNSHCodeInItem(final String code)
	{

		return tradeBalanceConfigDao.existNSHCodeInItem(code);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TradeBalanceConfigService#findMinDateFromFile()
	 */
	@Override
	public Date findMinDateFromFile()
	{

		return tradeBalanceConfigDao.findMinDateFromFile();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TradeBalanceConfigService#findAllTradeBalanceConfigBytype(java.lang.String)
	 */
	@Override
	public List<TradeBalanceConfig> findAllTradeBalanceConfigBytype(final String type)
	{

		return tradeBalanceConfigDao.findAllTradeBalanceConfigBytype(type);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.guce.siat.core.ct.service.TradeBalanceConfigService#findQuantityAndValueByNshAndFileTytpes(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public FileItem findQuantityAndValueByNshAndFileTytpes(final String nsh, final String date, final List<FileTypeCode> fileTypes)
	{

		return tradeBalanceConfigDao.findQuantityAndValueByNshAndFileTytpes(nsh, date, fileTypes);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.guce.siat.core.ct.service.TradeBalanceConfigService#findQuantityAndValueByNshAndFileTytpes(java.lang.String,
	 * java.util.List, java.util.List)
	 */
	@Override
	public List<FileItem> findQuantityAndValueByNshAndFileTytpes(final String nsh, final List<String> date,
			final List<FileTypeCode> fileTypes)
	{

		return tradeBalanceConfigDao.findQuantityAndValueByNshAndFileTytpes(nsh, date, fileTypes);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.ct.service.TradeBalanceConfigService#findAllCountry()
	 */
	@Override
	public List<Country> findAllCountry()
	{

		return tradeBalanceConfigDao.findAllCountry();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.guce.siat.core.ct.service.TradeBalanceConfigService#findQuantityAndValueByCountryAndFileTytpes(java.lang.String
	 * , java.util.List, java.lang.String, java.lang.String)
	 */
	@Override
	public FileItem findQuantityAndValueByCountryAndFileTytpes(final String date, final List<FileTypeCode> fileTypes,
			final String country, final String type)
	{
		return tradeBalanceConfigDao.findQuantityAndValueByCountryAndFileTytpes(date, fileTypes, country, type);
	}


}
