package org.guce.siat.core.ct.service;

import java.util.Date;
import java.util.List;

import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.service.AbstractService;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.core.ct.model.TradeBalanceConfig;


/**
 * The Interface TradeBalanceConfigService.
 */
public interface TradeBalanceConfigService extends AbstractService<TradeBalanceConfig>
{

	/**
	 * Find all trade balance config.
	 *
	 * @return the list
	 */
	List<TradeBalanceConfig> findAllTradeBalanceConfig();



	/**
	 * Exist trade balance config by code.
	 *
	 * @param code
	 *           the code
	 * @param id
	 *           the id
	 * @param type
	 *           the type
	 * @return the boolean
	 */
	Boolean existTradeBalanceConfigByCode(String code, Long id, String type);

	/**
	 * Exist nsh code in item.
	 *
	 * @param code
	 *           the code
	 * @return the boolean
	 */
	Boolean existNSHCodeInItem(String code);

	/**
	 * Find min date from file.
	 *
	 * @return the date
	 */
	Date findMinDateFromFile();

	/**
	 * Find all trade balance config bytype.
	 *
	 * @param type
	 *           the type
	 * @return the list
	 */
	List<TradeBalanceConfig> findAllTradeBalanceConfigBytype(String type);

	/**
	 * Find quantity and value by nsh and file tytpes.
	 *
	 * @param nsh
	 *           the nsh
	 * @param date
	 *           the date
	 * @param fileTypes
	 *           the file types
	 * @return the file item
	 */
	FileItem findQuantityAndValueByNshAndFileTytpes(String nsh, String date, List<FileTypeCode> fileTypes);

	/**
	 * Find quantity and value by nsh and file tytpes.
	 *
	 * @param nsh
	 *           the nsh
	 * @param date
	 *           the date
	 * @param fileTypes
	 *           the file types
	 * @return the list
	 */
	List<FileItem> findQuantityAndValueByNshAndFileTytpes(String nsh, List<String> date, List<FileTypeCode> fileTypes);

	/**
	 * Find all country.
	 *
	 * @return the list
	 */
	List<Country> findAllCountry();

	/**
	 * Find quantity and value by country and file tytpes.
	 *
	 * @param date
	 *           the date
	 * @param fileTypes
	 *           the file types
	 * @param country
	 *           the country
	 * @param type
	 *           the type
	 * @return the file item
	 */
	FileItem findQuantityAndValueByCountryAndFileTytpes(String date, List<FileTypeCode> fileTypes, String country, String type);


}
