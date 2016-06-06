/**
 *
 */
package org.guce.siat.core.gr.utils.enums;

/**
 * The Enum CertficatGoodness.
 */
public enum CertficatGoodness
{

	/** is good. */
	GOOD("Bon", "Good"),
	/** is not good. */
	NOT_GOOD("N'est pas bon", "Not Good"),
	/** is bad. */
	BAD("Mauvais", "Bad"),
	/** is doubtful. */
	DOUBTFUL("Douteux", "Doubtful");

	/** The label en. */
	private String labelEn;

	/** The labl fr. */
	private String labelFr;

	/**
	 * Instantiates a new certficat goodness.
	 *
	 * @param labelFr
	 *           the label fr
	 * @param labelEn
	 *           the label en
	 */
	private CertficatGoodness(final String labelFr, final String labelEn)
	{
		this.labelEn = labelEn;
		this.labelFr = labelFr;
	}

	/**
	 * Gets the label en.
	 *
	 * @return the label en
	 */
	public String getLabelEn()
	{
		return labelEn;
	}

	/**
	 * Sets the label en.
	 *
	 * @param labelEn
	 *           the new label en
	 */
	public void setLabelEn(final String labelEn)
	{
		this.labelEn = labelEn;
	}

	/**
	 * Gets the label fr.
	 *
	 * @return the label fr
	 */
	public String getLabelFr()
	{
		return labelFr;
	}

	/**
	 * Sets the label fr.
	 *
	 * @param labelFr
	 *           the new label fr
	 */
	public void setLabelFr(final String labelFr)
	{
		this.labelFr = labelFr;
	}





}
