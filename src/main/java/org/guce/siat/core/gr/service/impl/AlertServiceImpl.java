/**
 *
 */
package org.guce.siat.core.gr.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.guce.siat.common.dao.AbstractJpaDao;
import org.guce.siat.common.dao.CountryDao;
import org.guce.siat.common.dao.FileItemDao;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.FileItemFieldValue;
import org.guce.siat.common.model.Organism;
import org.guce.siat.common.service.impl.AbstractServiceImpl;
import org.guce.siat.common.utils.Constants;
import org.guce.siat.core.gr.dao.AlertDao;
import org.guce.siat.core.gr.model.Alert;
import org.guce.siat.core.gr.service.AlertService;
import org.guce.siat.core.gr.utils.filter.AlertFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class AlertServiceImpl.
 */
@Service("alertService")
@Transactional(readOnly = true)
public class AlertServiceImpl extends AbstractServiceImpl<Alert> implements AlertService
{

	/** The alert dao. */
	@Autowired
	private AlertDao alertDao;

	/** The country dao. */
	@Autowired
	private CountryDao countryDao;

	/** The file item dao. */
	@Autowired
	private FileItemDao fileItemDao;

	/**
	 * Instantiates a new AnalyseType service impl.
	 */
	public AlertServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<Alert> getJpaDao()
	{
		return alertDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.service.AlertService#findByFilter(org.guce.siat.core.gr.utils.filter.AlertFilter)
	 */
	@Override
	public List<Alert> findByFilter(final AlertFilter filter)
	{
		final List<Alert> alertList = alertDao.findByFilter(filter);

		for (final Alert alert : alertList)
		{
			if (alert.getCountryId() != null)
			{
				alert.setCountry(countryDao.find(alert.getCountryId()));
			}
		}

		return alertList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#find(java.lang.Long)
	 */
	@Override
	public Alert find(final Long id)
	{
		final Alert alert = super.find(id);

		if (alert.getCountryId() != null)
		{
			alert.setCountry(countryDao.find(alert.getCountryId()));
		}
		return alert;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#findAll()
	 */
	@Override
	public List<Alert> findAll()
	{
		final List<Alert> alertList = super.findAll();

		for (final Alert alert : alertList)
		{
			if (alert.getCountryId() != null)
			{
				alert.setCountry(countryDao.find(alert.getCountryId()));
			}
		}
		return alertList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#findActiveItems()
	 */
	@Override
	public List<Alert> findActiveItems()
	{
		final List<Alert> alertList = super.findActiveItems();

		for (final Alert alert : alertList)
		{
			if (alert.getCountryId() != null)
			{
				alert.setCountry(countryDao.find(alert.getCountryId()));
			}
		}
		return alertList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<Alert> jpaDao)
	{
		this.alertDao = (AlertDao) jpaDao;
	}

	/**
	 * Gets the country dao.
	 *
	 * @return the countryDao
	 */
	public CountryDao getCountryDao()
	{
		return countryDao;
	}

	/**
	 * Sets the country dao.
	 *
	 * @param countryDao
	 *           the countryDao to set
	 */
	public void setCountryDao(final CountryDao countryDao)
	{
		this.countryDao = countryDao;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.service.AlertService#findAlertForRiskManagment(org.guce.siat.common.model.FileItem)
	 */
	@Override
	public List<Alert> findAlertForRiskManagment(final FileItem fileItem)
	{
		final Map<String, FileItemFieldValue> fileItemFieldValuesMap = new HashMap<String, FileItemFieldValue>();
		fileItemFieldValuesMap.put(Constants.PAYS_ORIGINE_CODE,
				fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.PAYS_ORIGINE_CODE));
		fileItemFieldValuesMap.put(Constants.MARQUE, fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.MARQUE));
		fileItemFieldValuesMap.put(Constants.MODELE, fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.MODELE));
		fileItemFieldValuesMap.put(Constants.FABRICANT,
				fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.FABRICANT));


		final List<Alert> alertList = alertDao.findAlertForRiskManagment(fileItem, fileItemFieldValuesMap);

		for (final Alert alert : alertList)
		{
			if (alert.getCountryId() != null)
			{
				alert.setCountry(countryDao.find(alert.getCountryId()));
			}
		}
		return alertList;
	}

	/* (non-Javadoc)
	 * @see org.guce.siat.core.gr.service.AlertService#findByOrganism(org.guce.siat.common.model.Organism)
	 */
	@Override
	public List<Alert> findByOrganism(Organism organism)
	{
		return alertDao.findByOrganism(organism);
	}
}
