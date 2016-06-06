/**
 *
 */
package org.guce.siat.core.gr.utils;

import java.io.Serializable;



/**
 * The Class SynthesisResult.
 */
public class SynthesisResult implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5117118978534737648L;

	/** The product is known. */
	private Boolean productIsKnown = null;

	/** The product has alert. */
	private Boolean productHasAlert = null;

	/** The product has target. */
	private Boolean productHasTarget = null;

	/** The product has suspicious origins. */
	private Boolean productHasSuspiciousOrigins = null;

	/** The exporter reputation. */
	private Boolean exporterReputation = null;

	/** The importer has target. */
	private Boolean importerHasTarget = null;

	/** The importer is known. */
	private Boolean importerIsKnown = null;

	/** The product is tested. */
	private Boolean productIsTested = null;

	/** The quantity is small. */
	private Boolean quantityIsSmall = null;

	/** The out dated requests. */
	private int outDatedRequests = 0;

	/**
	 * Instantiates a new synthesis result.
	 */
	public SynthesisResult()
	{
	}

	/**
	 * Gets the product is known.
	 *
	 * @return the product is known
	 */
	public Boolean getProductIsKnown()
	{
		return productIsKnown;
	}

	/**
	 * Sets the product is known.
	 *
	 * @param productIsKnown
	 *           the new product is known
	 */
	public void setProductIsKnown(final Boolean productIsKnown)
	{
		this.productIsKnown = productIsKnown;
	}

	/**
	 * Gets the product has alert.
	 *
	 * @return the product has alert
	 */
	public Boolean getProductHasAlert()
	{
		return productHasAlert;
	}

	/**
	 * Sets the product has alert.
	 *
	 * @param productHasAlert
	 *           the new product has alert
	 */
	public void setProductHasAlert(final Boolean productHasAlert)
	{
		this.productHasAlert = productHasAlert;
	}

	/**
	 * Gets the product has target.
	 *
	 * @return the product has target
	 */
	public Boolean getProductHasTarget()
	{
		return productHasTarget;
	}

	/**
	 * Sets the product has target.
	 *
	 * @param productHasTarget
	 *           the new product has target
	 */
	public void setProductHasTarget(final Boolean productHasTarget)
	{
		this.productHasTarget = productHasTarget;
	}

	/**
	 * Gets the exporter reputation.
	 *
	 * @return the exporter reputation
	 */
	public Boolean getExporterReputation()
	{
		return exporterReputation;
	}

	/**
	 * Sets the exporter reputation.
	 *
	 * @param exporterReputation
	 *           the new exporter reputation
	 */
	public void setExporterReputation(final Boolean exporterReputation)
	{
		this.exporterReputation = exporterReputation;
	}

	/**
	 * Gets the importer has target.
	 *
	 * @return the importer has target
	 */
	public Boolean getImporterHasTarget()
	{
		return importerHasTarget;
	}

	/**
	 * Sets the importer has target.
	 *
	 * @param importerHasTarget
	 *           the new importer has target
	 */
	public void setImporterHasTarget(final Boolean importerHasTarget)
	{
		this.importerHasTarget = importerHasTarget;
	}

	/**
	 * Gets the importer is known.
	 *
	 * @return the importer is known
	 */
	public Boolean getImporterIsKnown()
	{
		return importerIsKnown;
	}

	/**
	 * Sets the importer is known.
	 *
	 * @param importerIsKnown
	 *           the new importer is known
	 */
	public void setImporterIsKnown(final Boolean importerIsKnown)
	{
		this.importerIsKnown = importerIsKnown;
	}

	/**
	 * Gets the product is tested.
	 *
	 * @return the product is tested
	 */
	public Boolean getProductIsTested()
	{
		return productIsTested;
	}

	/**
	 * Sets the product is tested.
	 *
	 * @param productIsTested
	 *           the new product is tested
	 */
	public void setProductIsTested(final Boolean productIsTested)
	{
		this.productIsTested = productIsTested;
	}

	/**
	 * Gets the quantity is small.
	 *
	 * @return the quantity is small
	 */
	public Boolean getQuantityIsSmall()
	{
		return quantityIsSmall;
	}

	/**
	 * Sets the quantity is small.
	 *
	 * @param quantityIsSmall
	 *           the new quantity is small
	 */
	public void setQuantityIsSmall(final Boolean quantityIsSmall)
	{
		this.quantityIsSmall = quantityIsSmall;
	}

	/**
	 * Gets the product has suspicious origins.
	 *
	 * @return the product has suspicious origins
	 */
	public Boolean getProductHasSuspiciousOrigins()
	{
		return productHasSuspiciousOrigins;
	}

	/**
	 * Sets the product has suspicious origins.
	 *
	 * @param productHasSuspiciousOrigins
	 *           the new product has suspicious origins
	 */
	public void setProductHasSuspiciousOrigins(final Boolean productHasSuspiciousOrigins)
	{
		this.productHasSuspiciousOrigins = productHasSuspiciousOrigins;

	}

	/**
	 * Gets the out dated requests.
	 *
	 * @return the out dated requests
	 */
	public int getOutDatedRequests()
	{
		return outDatedRequests;
	}

	/**
	 * Sets the out dated requests.
	 *
	 * @param outDatedRequests
	 *           the new out dated requests
	 */
	public void setOutDatedRequests(final int outDatedRequests)
	{
		this.outDatedRequests = outDatedRequests;

	}
}
