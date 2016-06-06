package org.guce.siat.core.ct.filter;

import org.guce.siat.common.model.AnalyseType;
import org.guce.siat.common.model.Company;
import org.guce.siat.common.model.Country;
import org.guce.siat.common.model.FileType;
import org.guce.siat.common.model.Port;
import org.guce.siat.common.model.Step;
import org.guce.siat.common.model.TransportType;
import org.guce.siat.common.model.User;
import org.guce.siat.core.ct.model.Laboratory;



/**
 * The Class SearchFilter.
 */
public class FileItemFilter extends Filter
{

	/** The subfamily. */
	private String subfamily;

	/** The file. */
	private String file;

	/** The step. */
	private Step step;

	/** The transport type. */
	private TransportType transportType;

	/** The operator. */
	private Company operator;

	/** The origin country. */
	private Country originCountry;

	/** The arriva port. */
	private Port arrivalPort;

	/** The file type. */
	private FileType fileType;

	/** The controller. */
	private User controller;

	/** The analyse type. */
	private AnalyseType analyseType;

	/** The laboratory. */
	private Laboratory laboratory;

	/**
	 * Gets the step.
	 *
	 * @return the step
	 */
	public Step getStep()
	{
		return step;
	}

	/**
	 * Sets the step.
	 *
	 * @param step
	 *           the step to set
	 */
	public void setStep(final Step step)
	{
		this.step = step;
	}

	/**
	 * Gets the subfamily.
	 *
	 * @return the subfamily
	 */
	public String getSubfamily()
	{
		return subfamily;
	}

	/**
	 * Sets the subfamily.
	 *
	 * @param subfamily
	 *           the subfamily to set
	 */
	public void setSubfamily(final String subfamily)
	{
		this.subfamily = subfamily;
	}

	/**
	 * Gets the file.
	 *
	 * @return the file
	 */
	public String getFile()
	{
		return file;
	}

	/**
	 * Sets the file.
	 *
	 * @param file
	 *           the file to set
	 */
	public void setFile(final String file)
	{
		this.file = file;
	}

	/**
	 * Gets the transport type.
	 *
	 * @return the transportType
	 */
	public TransportType getTransportType()
	{
		return transportType;
	}

	/**
	 * Sets the transport type.
	 *
	 * @param transportType
	 *           the transportType to set
	 */
	public void setTransportType(final TransportType transportType)
	{
		this.transportType = transportType;
	}


	/**
	 * Gets the operator.
	 *
	 * @return the operator
	 */
	public Company getOperator()
	{
		return operator;
	}

	/**
	 * Sets the operator.
	 *
	 * @param operator
	 *           the operator to set
	 */
	public void setOperator(final Company operator)
	{
		this.operator = operator;
	}

	/**
	 * Gets the origin country.
	 *
	 * @return the originCountry
	 */
	public Country getOriginCountry()
	{
		return originCountry;
	}

	/**
	 * Sets the origin country.
	 *
	 * @param originCountry
	 *           the originCountry to set
	 */
	public void setOriginCountry(final Country originCountry)
	{
		this.originCountry = originCountry;
	}

	/**
	 * Gets the arrival port.
	 *
	 * @return the arrivalPort
	 */
	public Port getArrivalPort()
	{
		return arrivalPort;
	}

	/**
	 * Sets the arrival port.
	 *
	 * @param arrivalPort
	 *           the arrivalPort to set
	 */
	public void setArrivalPort(final Port arrivalPort)
	{
		this.arrivalPort = arrivalPort;
	}

	/**
	 * Gets the file type.
	 *
	 * @return the fileType
	 */
	public FileType getFileType()
	{
		return fileType;
	}

	/**
	 * Sets the file type.
	 *
	 * @param fileType
	 *           the fileType to set
	 */
	public void setFileType(final FileType fileType)
	{
		this.fileType = fileType;
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	public User getController()
	{
		return controller;
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *           the new controller
	 */
	public void setController(final User controller)
	{
		this.controller = controller;
	}

	/**
	 * Gets the analyse type.
	 *
	 * @return the analyse type
	 */
	public AnalyseType getAnalyseType()
	{
		return analyseType;
	}

	/**
	 * Sets the analyse type.
	 *
	 * @param analyseType
	 *           the new analyse type
	 */
	public void setAnalyseType(final AnalyseType analyseType)
	{
		this.analyseType = analyseType;
	}

	/**
	 * Gets the laboratory.
	 *
	 * @return the laboratory
	 */
	public Laboratory getLaboratory()
	{
		return laboratory;
	}

	/**
	 * Sets the laboratory.
	 *
	 * @param laboratory
	 *           the laboratory to set
	 */
	public void setLaboratory(final Laboratory laboratory)
	{
		this.laboratory = laboratory;
	}

}
