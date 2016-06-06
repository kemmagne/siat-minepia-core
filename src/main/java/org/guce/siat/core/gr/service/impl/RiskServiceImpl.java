package org.guce.siat.core.gr.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.guce.siat.common.model.FileItem;
import org.guce.siat.common.model.ItemFlow;
import org.guce.siat.core.gr.dao.RiskDao;
import org.guce.siat.core.gr.service.RiskService;
import org.guce.siat.core.gr.utils.DocumentInfo;
import org.guce.siat.core.gr.utils.GrUtils;
import org.guce.siat.core.gr.utils.SynthesisConfig;
import org.guce.siat.core.gr.utils.SynthesisResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * The Class RiskServiceImpl.
 */
@Service("riskService")
@Transactional(readOnly = true)
public class RiskServiceImpl implements RiskService
{

	/** The risk dao. */
	@Autowired
	private RiskDao riskDao;

	/**
	 * Gets the risk dao.
	 *
	 * @return the riskDao
	 */
	public RiskDao getRiskDao()
	{
		return riskDao;
	}

	/**
	 * Sets the risk dao.
	 *
	 * @param riskDao
	 *           the riskDao to set
	 */
	public void setRiskDao(final RiskDao riskDao)
	{
		this.riskDao = riskDao;
	}

	/**
	 * Gets the synthesis.
	 *
	 * @param config
	 *           the config
	 * @param fileItem
	 *           the file item
	 * @return the synthesis
	 */
	public SynthesisResult getSynthesis(final SynthesisConfig config, final FileItem fileItem)
	{
		final SynthesisResult result = new SynthesisResult();

		result.setProductIsKnown(checkProductIsKnown(fileItem, config));
		result.setProductHasAlert(checkProductHasAlert(fileItem));
		result.setProductHasTarget(checkProductHasTarget(fileItem));
		result.setProductHasSuspiciousOrigins(checkProductHasSuspiciousOrigins(fileItem, config));
		result.setExporterReputation(checkExporterReputation(fileItem));
		result.setQuantityIsSmall(checkQuantityIsSmall(fileItem, config));
		result.setProductIsTested(checkProductIsTested(fileItem, config));
		result.setImporterIsKnown(checkImporterIsKnown(fileItem, config));
		result.setImporterHasTarget(checkImporterHasTarget(fileItem));
		result.setOutDatedRequests(calculateOutDatedRequests(fileItem, config));

		return result;
	}

	/**
	 * Check product is known.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	private Boolean checkProductIsKnown(final FileItem fileItem, final SynthesisConfig config)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null && config != null)
		{
			return riskDao.getFileItemCount(fileItem, config) >= config.getProductKnownThreshold();
		}
		return null;
	}

	/**
	 * Check product has alert.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	private Boolean checkProductHasAlert(final FileItem fileItem)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null)
		{
			return riskDao.checkProductHasAlert(fileItem);
		}
		return null;
	}

	/**
	 * Check product has target.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	private Boolean checkProductHasTarget(final FileItem fileItem)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null)
		{
			return riskDao.checkProductHasTarget(fileItem);
		}
		return null;
	}


	/**
	 * Check product has suspicious origins.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	private Boolean checkProductHasSuspiciousOrigins(final FileItem fileItem, final SynthesisConfig config)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null)
		{
			return riskDao.checkProductHasSuspiciousOrigins(fileItem, config);
		}
		else
		{
			return null;
		}
	}

	/**
	 * Check exporter reputation.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	private Boolean checkExporterReputation(final FileItem fileItem)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null)
		{
			return riskDao.checkExporterHasNegativeDecisions(fileItem);
		}
		return null;
	}

	/**
	 * Check importer has target.
	 *
	 * @param fileItem
	 *           the file item
	 * @return the boolean
	 */
	private Boolean checkImporterHasTarget(final FileItem fileItem)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null)
		{
			return riskDao.checkImporterHasTarget(fileItem);
		}
		return null;
	}

	/**
	 * Calculate out dated requests.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the int
	 */
	private int calculateOutDatedRequests(final FileItem fileItem, final SynthesisConfig config)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null)
		{
			return riskDao.calculateOutDatedRequests(fileItem, config);
		}
		return 0;
	}


	/**
	 * Check importer is known.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	private Boolean checkImporterIsKnown(final FileItem fileItem, final SynthesisConfig config)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null && config != null)
		{
			return riskDao.getFileCount(fileItem, config) >= config.getImporterKnownThreshold();
		}
		return null;
	}

	/**
	 * Check product is tested.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	private Boolean checkProductIsTested(final FileItem fileItem, final SynthesisConfig config)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null && config != null)
		{
			return riskDao.checkProductIsTested(fileItem, config);
		}
		return null;
	}

	/**
	 * Check quantity is small.
	 *
	 * @param fileItem
	 *           the file item
	 * @param config
	 *           the config
	 * @return the boolean
	 */
	private Boolean checkQuantityIsSmall(final FileItem fileItem, final SynthesisConfig config)
	{
		if (fileItem != null && fileItem.getFile().getBureau().getId() != null && config != null)
		{
			return riskDao.checkProductQuantityIsSmall(fileItem, config);
		}
		return null;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.service.RiskService#getPendingRequests(java.lang.Long, java.lang.Integer,
	 * java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public List<DocumentInfo> getPendingRequests(final Long importerId, final SynthesisConfig synthesisConfig)
	{
		final List<DocumentInfo> documentInfoList = new ArrayList<DocumentInfo>();
		final List<ItemFlow> itemFlows = riskDao.getPendingRequests(importerId);

		for (final ItemFlow itemFlow : itemFlows)
		{
			documentInfoList.add(convertFileItemToDocumentInfo(itemFlow, synthesisConfig));
		}

		return documentInfoList;
	}

	/**
	 * Convert file item to document info.
	 *
	 * @param itemFlow
	 *           the item flow
	 * @param synthesisConfig
	 *           the synthesis config
	 * @return the document info
	 */
	private DocumentInfo convertFileItemToDocumentInfo(final ItemFlow itemFlow, final SynthesisConfig synthesisConfig)
	{
		final DocumentInfo document = new DocumentInfo();

		document.setFileId(itemFlow.getFileItem().getFile().getId());
		document.setFileItemId(itemFlow.getFileItem().getId());
		document.setDepositDate(itemFlow.getFileItem().getFile().getCreatedDate());
		document.setStepLabelFr(itemFlow.getFileItem().getStep().getLabelFr());
		document.setStepLabelEn(itemFlow.getFileItem().getStep().getLabelEn());
		document.setStepDate(itemFlow.getCreated());
		document.setTimeExceeded((GrUtils.isPendingRequestFlow(itemFlow, synthesisConfig)));
		document.setDuration(itemFlow.getFlow().getDuration());
		document.setItemFlowId(itemFlow.getId());
		document.setFlowCode(itemFlow.getFlow().getCode());

		return document;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.guce.siat.core.gr.service.RiskService#getPendingRequestCount(java.lang.Long)
	 */
	@Override
	public int getPendingRequestCount(final Long importerId)
	{
		return riskDao.getPendingRequestCount(importerId);
	}

}
