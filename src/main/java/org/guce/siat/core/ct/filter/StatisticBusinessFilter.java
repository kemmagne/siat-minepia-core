package org.guce.siat.core.ct.filter;

import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Item;




/**
 * The Class StatisticBusinessFilter.
 */
public class StatisticBusinessFilter extends Filter
{

	/** The company. */
	private Company client;

	/** The nsh. */
	private Item nsh;

	/** The file type. */
	private FileType fileType;

	/** The country of provenance. */
	private Country countryOfProvenance;

	/** The country of destination. */
	private Country countryOfDestination;

	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Company getClient()
	{
		return client;
	}

	/**
	 * Sets the client.
	 *
	 * @param client
	 *           the new client
	 */
	public void setClient(final Company client)
	{
		this.client = client;
	}

	/**
	 * Gets the nsh.
	 *
	 * @return the nsh
	 */
	public Item getNsh()
	{
		return nsh;
	}

	/**
	 * Sets the nsh.
	 *
	 * @param nsh
	 *           the new nsh
	 */
	public void setNsh(final Item nsh)
	{
		this.nsh = nsh;
	}

	/**
	 * Gets the file type.
	 *
	 * @return the file type
	 */
	public FileType getFileType()
	{
		return fileType;
	}

	/**
	 * Sets the file type.
	 *
	 * @param fileType
	 *           the new file type
	 */
	public void setFileType(final FileType fileType)
	{
		this.fileType = fileType;
	}

	/**
	 * Gets the country of provenance.
	 *
	 * @return the country of provenance
	 */
	public Country getCountryOfProvenance()
	{
		return countryOfProvenance;
	}

	/**
	 * Sets the country of provenance.
	 *
	 * @param countryOfProvenance
	 *           the new country of provenance
	 */
	public void setCountryOfProvenance(final Country countryOfProvenance)
	{
		this.countryOfProvenance = countryOfProvenance;
	}

	/**
	 * Gets the country of destination.
	 *
	 * @return the country of destination
	 */
	public Country getCountryOfDestination()
	{
		return countryOfDestination;
	}

	/**
	 * Sets the country of destination.
	 *
	 * @param countryOfDestination
	 *           the new country of destination
	 */
	public void setCountryOfDestination(final Country countryOfDestination)
	{
		this.countryOfDestination = countryOfDestination;
	}

}
