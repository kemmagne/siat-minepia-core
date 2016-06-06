package org.guce.siat.core.ct.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.guce.siat.common.dao.impl.AbstractJpaDaoImpl;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.utils.enums.FileTypeCode;
import org.guce.siat.core.ct.dao.TradeBalanceConfigDao;
import org.guce.siat.core.ct.model.TradeBalanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * The Class TradeBalanceConfigDaoImpl.
 */
@Repository("tradeBalanceConfigDao")
@Transactional(propagation = Propagation.REQUIRED)
public class TradeBalanceConfigDaoImpl extends
		AbstractJpaDaoImpl<TradeBalanceConfig> implements TradeBalanceConfigDao {
	private static final Logger LOG = LoggerFactory
			.getLogger(TradeBalanceConfigDaoImpl.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.TradeBalanceConfigDao#findAllTradeBalanceConfig
	 * ()
	 */
	@Override
	public List<TradeBalanceConfig> findAllTradeBalanceConfig() {
		return entityManager.createQuery("FROM TradeBalanceConfig  ",
				TradeBalanceConfig.class).getResultList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.TradeBalanceConfigDao#existTradeBalanceConfigByCode
	 * (java.lang.String, java.lang.Long, java.lang.String)
	 */
	@Override
	public Boolean existTradeBalanceConfigByCode(final String code,
			final Long id, final String type) {
		final StringBuilder queryBuilder = new StringBuilder();
		queryBuilder
				.append("SELECT CASE WHEN (COUNT(t)>0) THEN true ELSE false END FROM TradeBalanceConfig t WHERE t.code = :code AND t.type=:type ");

		if (id != null) {
			queryBuilder.append("AND t.id!=:id");
		}

		final Query query = entityManager.createQuery(queryBuilder.toString());
		query.setParameter("code", code).setParameter("type", type);
		if (id != null) {
			query.setParameter("id", id);
		}

		return (Boolean) query.getSingleResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.TradeBalanceConfigDao#existNSHCodeInItem(java
	 * .lang.String)
	 */
	@Override
	public Boolean existNSHCodeInItem(final String code) {
		final Query query = entityManager
				.createQuery(" SELECT CASE WHEN (COUNT(i)>0) THEN true ELSE false END FROM Item i WHERE i.goodsItemCode LIKE concat(:code,'%') ");
		query.setParameter("code", code);
		return (Boolean) query.getSingleResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.guce.siat.core.ct.dao.TradeBalanceConfigDao#findMinDateFromFile()
	 */
	@Override
	public Date findMinDateFromFile() {
		final Query query = entityManager
				.createQuery("SELECT min(f.createdDate) FROM File f");
		try{
		return (Date) query.getSingleResult();
		}catch(final Exception exception){
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TradeBalanceConfigDao#
	 * findAllTradeBalanceConfigBytype(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<TradeBalanceConfig> findAllTradeBalanceConfigBytype(
			final String type) {
		final Query query = entityManager
				.createQuery("SELECT t FROM TradeBalanceConfig t WHERE t.type=:type");
		query.setParameter("type", type);
		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TradeBalanceConfigDao#
	 * findQuantityAndValueByNshAndFileTytpes(java.lang.String,
	 * java.lang.String, java.util.List)
	 */
	@Override
	public FileItem findQuantityAndValueByNshAndFileTytpes(final String nsh,
			final String date, final List<FileTypeCode> fileTypes) {
		final StringBuilder builder = new StringBuilder();
		builder
				.append("SELECT new org.guce.siat.common.model.FileItem(SUM(f.quantity),SUM(f.fobValue)) FROM FileItem f WHERE f.file.fileType.code IN :list AND TO_CHAR(f.file.createdDate,'yyyy') = :date");
		if (nsh != null) {
			builder.append(" AND f.nsh.goodsItemCode LIKE concat('%',:nsh,'%')");
		}
		final Query query = entityManager.createQuery(builder.toString())
				.setParameter("list", fileTypes).setParameter("date", date);
		if (nsh != null) {
			query.setParameter("nsh", nsh);
		}

		return (FileItem) query.getSingleResult();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TradeBalanceConfigDao#
	 * findQuantityAndValueByNshAndFileTytpes(java.lang.String, java.util.List,
	 * java.util.List)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<FileItem> findQuantityAndValueByNshAndFileTytpes(
			final String nsh, final List<String> date,
			final List<FileTypeCode> fileTypes) {
		final StringBuilder builder = new StringBuilder();
		builder
				.append("SELECT new org.guce.siat.common.model.FileItem(SUM(f.quantity),SUM(f.fobValue)) FROM FileItem f WHERE f.file.fileType.code IN :list AND TO_CHAR(f.file.createdDate,'yyyy') IN :date ");
		if (nsh != null) {
			builder.append(" AND f.nsh.goodsItemCode LIKE CONCAT('%',:nsh,'%')");
		}
		builder.append(" GROUP BY TO_CHAR(f.file.createdDate,'yyyy')");
		final Query query = entityManager.createQuery(builder.toString())
				.setParameter("list", fileTypes).setParameter("date", date);
		if (nsh != null) {
			query.setParameter("nsh", nsh);
		}

		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TradeBalanceConfigDao#findAllCountry()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Country> findAllCountry() {
		final Query query = entityManager
				.createQuery("SELECT c FROM Country c");
		return query.getResultList();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.guce.siat.core.ct.dao.TradeBalanceConfigDao#
	 * findQuantityAndValueByCountryAndFileTytpes(java.lang.String,
	 * java.util.List, java.lang.String, java.lang.String)
	 */
	@Override
	public FileItem findQuantityAndValueByCountryAndFileTytpes(
			final String date, final List<FileTypeCode> fileTypes,
			final String country, final String type) {
		final StringBuilder builder = new StringBuilder();
		builder
				.append("SELECT new org.guce.siat.common.model.FileItem(SUM(f.fobValue)) FROM FileItem f WHERE f.file.fileType.code IN :list AND TO_CHAR(f.file.createdDate,'yyyy') IN :date ");
		if (type.equals("E")) {
			builder.append(" AND f.file.countryOfDestination.countryIdAlpha2 =:country");
		} else {
			builder.append(" AND f.file.countryOfProvenance.countryIdAlpha2 =:country");
		}
		try {
			final TypedQuery<FileItem> query = entityManager.createQuery(
					builder.toString(), FileItem.class);
			query.setParameter("list", fileTypes);
			query.setParameter("date", date);
			query.setParameter("country", country);
			return query.getSingleResult();

		} catch (final Exception e) {
			LOG.error(Objects.toString(e));
			return null;
		}
	}

}
