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
import org.guce.siat.core.gr.dao.CiblageDao;
import org.guce.siat.core.gr.model.Ciblage;
import org.guce.siat.core.gr.service.CiblageService;
import org.guce.siat.core.gr.utils.filter.CiblageFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




/**
 * The Class CiblageServiceImpl.
 */
@Service("ciblageService")
@Transactional(readOnly = true)
public class CiblageServiceImpl extends AbstractServiceImpl<Ciblage> implements CiblageService
{

	/** The ciblage dao. */
	@Autowired
	private CiblageDao ciblageDao;

	/** The file item dao. */
	@Autowired
	private FileItemDao fileItemDao;

	/** The country dao. */
	@Autowired
	private CountryDao countryDao;


	/**
	 * Instantiates a new ciblage service impl.
	 */
	public CiblageServiceImpl()
	{
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#getJpaDao()
	 */
	@Override
	public AbstractJpaDao<Ciblage> getJpaDao()
	{
		return ciblageDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#find(java.lang.Long)
	 */
	@Override
	public Ciblage find(final Long id)
	{
		final Ciblage ciblage = super.find(id);
		if (ciblage.getCountryId() != null)
		{
			ciblage.setCountry(countryDao.find(ciblage.getCountryId()));
		}
		return ciblage;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#findAll()
	 */
	@Override
	public List<Ciblage> findAll()
	{
		final List<Ciblage> ciblageList = super.findAll();

		for (final Ciblage ciblage : ciblageList)
		{
			if (ciblage.getCountryId() != null)
			{
				ciblage.setCountry(countryDao.find(ciblage.getCountryId()));
			}
		}
		return ciblageList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#findActiveItems()
	 */
	@Override
	public List<Ciblage> findActiveItems()
	{
		final List<Ciblage> ciblageList = super.findActiveItems();

		for (final Ciblage ciblage : ciblageList)
		{
			if (ciblage.getCountryId() != null)
			{
				ciblage.setCountry(countryDao.find(ciblage.getCountryId()));
			}
		}
		return ciblageList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.gr.service.CiblageService#findByFilter(org.guce.siat.core.gr.utils.filter.CiblageFilter)
	 */
	@Override
	public List<Ciblage> findByFilter(final CiblageFilter filter)
	{
		final List<Ciblage> ciblageList = ciblageDao.findByFilter(filter);

		for (final Ciblage ciblage : ciblageList)
		{
			if (ciblage.getCountryId() != null)
			{
				ciblage.setCountry(countryDao.find(ciblage.getCountryId()));
			}
		}
		return ciblageList;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.common.service.impl.AbstractServiceImpl#setJpaDao(org.guce.siat.common.dao.AbstractJpaDao)
	 */
	@Override
	public void setJpaDao(final AbstractJpaDao<Ciblage> jpaDao)
	{
		this.ciblageDao = (CiblageDao) jpaDao;
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
	public List<Ciblage> findCiblageforRiskManagment(final FileItem fileItem)
	{
		final Map<String, FileItemFieldValue> fileItemFieldValuesMap = new HashMap<String, FileItemFieldValue>();
		fileItemFieldValuesMap.put(Constants.PAYS_ORIGINE_CODE,
				fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.PAYS_ORIGINE_CODE));
		fileItemFieldValuesMap.put(Constants.MARQUE, fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.MARQUE));
		fileItemFieldValuesMap.put(Constants.MODELE, fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.MODELE));
		fileItemFieldValuesMap.put(Constants.FABRICANT,
				fileItemDao.findFileItemFieldValueByFieldCode(fileItem, Constants.FABRICANT));

		final List<Ciblage> ciblageList = ciblageDao.findCiblageforRiskManagment(fileItem, fileItemFieldValuesMap);

		for (final Ciblage ciblage : ciblageList)
		{
			if (ciblage.getCountryId() != null)
			{
				ciblage.setCountry(countryDao.find(ciblage.getCountryId()));
			}
		}
		return ciblageList;
	}

	@Override
	public List<Ciblage> findByOrganism(Organism organism)
	{
	 return ciblageDao.findByOrganism(organism);
	}

}
