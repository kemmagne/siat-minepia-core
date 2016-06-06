/**
 *
 */
package org.guce.siat.core.gr.utils;

import java.io.Serializable;


/**
 * The Class SynthesisConfig.
 */
public class SynthesisConfig implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5422685131300244898L;

	/** The negative decisions period. */
	private Integer negativeDecisionsPeriod;

	/** The Constant NEGATIVE_DECISIONS_PERIOD. */
	public static final String NEGATIVE_DECISIONS_PERIOD = "negativeDecisionsPeriod";

	/** The product known period. */
	private Integer productKnownPeriod = 0;

	/** The Constant PRODUCT_KNOWN_PERIOD. */
	public static final String PRODUCT_KNOWN_PERIOD = "productKnownPeriod";

	/** The product known threshold. */
	private Integer productKnownThreshold = 0;

	/** The Constant PRODUCT_KNOWN_THRESHOLD. */
	public static final String PRODUCT_KNOWN_THRESHOLD = "productKnownThreshold";

	/** The importer known threshold. */
	private Integer importerKnownThreshold = 0;

	/** The Constant IMPORTER_KNOWN_THRESHOLD. */
	public static final String IMPORTER_KNOWN_THRESHOLD = "importerKnownThreshold";

	/** The product tested period. */
	private Integer productTestedPeriod = 0;

	/** The Constant PRODUCT_TESTED_PERIOD. */
	public static final String PRODUCT_TESTED_PERIOD = "productTestedPeriod";

	/** The importer known period. */
	private Integer importerKnownPeriod = 0;

	/** The Constant IMPORTER_KNOWN_PERIOD. */
	public static final String IMPORTER_KNOWN_PERIOD = "importerKnownPeriod";

	/** The quantity coefficient. */
	private Float quantityCoefficient;

	/** The Constant QUANTITY_COEFFICIENT. */
	public static final String QUANTITY_COEFFICIENT = "quantityCoefficient";

	/** The rdd delay. */
	private Integer rddDelay = 0;

	/** The Constant RDD_DELAY. */
	public static final String RDD_DELAY = "rddDelay";

	/** The mec delay. */
	private Integer mecDelay = 0;

	/** The Constant MEC_DELAY. */
	public static final String MEC_DELAY = "mecDelay";

	/** The clearance delay. */
	private Integer clearanceDelay = 0;

	/** The Constant CLEARANCE_DELAY. */
	public static final String CLEARANCE_DELAY = "clearanceDelay";

	/**
	 * Instantiates a new synthesis config.
	 */
	public SynthesisConfig()
	{
	}

	/**
	 * Gets the negative decisions period.
	 *
	 * @return the negative decisions period
	 */
	public Integer getNegativeDecisionsPeriod()
	{
		return negativeDecisionsPeriod;
	}

	/**
	 * Sets the negative decisions period.
	 *
	 * @param negativeDecisionsPeriod
	 *           the new negative decisions period
	 */
	public void setNegativeDecisionsPeriod(final Integer negativeDecisionsPeriod)
	{
		this.negativeDecisionsPeriod = negativeDecisionsPeriod;
	}

	/**
	 * Gets the product known period.
	 *
	 * @return the product known period
	 */
	public Integer getProductKnownPeriod()
	{
		return productKnownPeriod;
	}

	/**
	 * Sets the product known period.
	 *
	 * @param productKnownPeriod
	 *           the new product known period
	 */
	public void setProductKnownPeriod(final Integer productKnownPeriod)
	{
		this.productKnownPeriod = productKnownPeriod;
	}

	/**
	 * Gets the product known threshold.
	 *
	 * @return the product known threshold
	 */
	public Integer getProductKnownThreshold()
	{
		return productKnownThreshold;
	}

	/**
	 * Sets the product known threshold.
	 *
	 * @param productKnownThreshold
	 *           the new product known threshold
	 */
	public void setProductKnownThreshold(final Integer productKnownThreshold)
	{
		this.productKnownThreshold = productKnownThreshold;
	}

	/**
	 * Gets the product tested period.
	 *
	 * @return the product tested period
	 */
	public Integer getProductTestedPeriod()
	{
		return productTestedPeriod;
	}

	/**
	 * Sets the product tested period.
	 *
	 * @param productTestedPeriod
	 *           the new product tested period
	 */
	public void setProductTestedPeriod(final Integer productTestedPeriod)
	{
		this.productTestedPeriod = productTestedPeriod;
	}

	/**
	 * Gets the importer known period.
	 *
	 * @return the importer known period
	 */
	public Integer getImporterKnownPeriod()
	{
		return importerKnownPeriod;
	}

	/**
	 * Sets the importer known period.
	 *
	 * @param importerKnownPeriod
	 *           the new importer known period
	 */
	public void setImporterKnownPeriod(final Integer importerKnownPeriod)
	{
		this.importerKnownPeriod = importerKnownPeriod;
	}

	/**
	 * Gets the importer known threshold.
	 *
	 * @return the importer known threshold
	 */
	public Integer getImporterKnownThreshold()
	{
		return importerKnownThreshold;
	}

	/**
	 * Sets the importer known threshold.
	 *
	 * @param importerKnownThreshold
	 *           the new importer known threshold
	 */
	public void setImporterKnownThreshold(final Integer importerKnownThreshold)
	{
		this.importerKnownThreshold = importerKnownThreshold;
	}

	/**
	 * Gets the rdd delay.
	 *
	 * @return the rddDelay
	 */
	public Integer getRddDelay()
	{
		return rddDelay;
	}

	/**
	 * Sets the rdd delay.
	 *
	 * @param rddDelay
	 *           the rddDelay to set
	 */
	public void setRddDelay(final Integer rddDelay)
	{
		this.rddDelay = rddDelay;
	}

	/**
	 * Gets the mec delay.
	 *
	 * @return the mec delay
	 */
	public Integer getMecDelay()
	{
		return mecDelay;
	}

	/**
	 * Sets the mec delay.
	 *
	 * @param mecDelay
	 *           the new mec delay
	 */
	public void setMecDelay(final Integer mecDelay)
	{
		this.mecDelay = mecDelay;
	}

	/**
	 * Gets the clearance delay.
	 *
	 * @return the clearance delay
	 */
	public Integer getClearanceDelay()
	{
		return clearanceDelay;
	}

	/**
	 * Sets the clearance delay.
	 *
	 * @param clearanceDelay
	 *           the new clearance delay
	 */
	public void setClearanceDelay(final Integer clearanceDelay)
	{
		this.clearanceDelay = clearanceDelay;
	}

	/**
	 * Gets the quantity coefficient.
	 *
	 * @return the quantity coefficient
	 */
	public float getQuantityCoefficient()
	{
		return quantityCoefficient;
	}

	/**
	 * Sets the quantity coefficient.
	 *
	 * @param quantityCoefficient
	 *           the new quantity coefficient
	 */
	public void setQuantityCoefficient(final float quantityCoefficient)
	{
		this.quantityCoefficient = quantityCoefficient;
	}

	/**
	 * Copy.
	 *
	 * @return the synthesis config
	 */
	public SynthesisConfig copy()
	{
		final SynthesisConfig config = new SynthesisConfig();

		config.clearanceDelay = this.clearanceDelay;
		config.rddDelay = this.rddDelay;
		config.importerKnownPeriod = this.importerKnownPeriod;
		config.importerKnownThreshold = this.importerKnownThreshold;
		config.mecDelay = this.mecDelay;
		config.negativeDecisionsPeriod = this.negativeDecisionsPeriod;
		config.productKnownPeriod = this.productKnownPeriod;
		config.productKnownThreshold = this.productKnownThreshold;
		config.productTestedPeriod = this.productTestedPeriod;
		config.quantityCoefficient = this.quantityCoefficient;

		return config;
	}

}
