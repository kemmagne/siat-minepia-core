/**
 *
 */
package org.guce.siat.core.gr.utils;

import java.util.Date;


/**
 * The Class DocumentInfo.
 */
public class DocumentInfo
{

	/** The file id. */
	private Long fileId;

	/** The file item id. */
	private Long fileItemId;

	/** The file item num. */
	private Integer fileItemNum;

	/** The deposit date. */
	private Date depositDate;

	/** The step label fr. */
	private String stepLabelFr;

	/** The step label en. */
	private String stepLabelEn;

	/** The step date. */
	private Date stepDate;

	/** The time exceeded. */
	private Boolean timeExceeded;

	/** The duration. */
	private Short duration;

	/** The item flow id. */
	private Long itemFlowId;

	/** The flow code. */
	private String flowCode;


	/**
	 * Instantiates a new document info.
	 */
	public DocumentInfo()
	{
	}

	/**
	 * Gets the file id.
	 *
	 * @return the fileId
	 */
	public Long getFileId()
	{
		return fileId;
	}

	/**
	 * Sets the file id.
	 *
	 * @param fileId
	 *           the fileId to set
	 */
	public void setFileId(final Long fileId)
	{
		this.fileId = fileId;
	}

	/**
	 * Gets the file item id.
	 *
	 * @return the fileItemId
	 */
	public Long getFileItemId()
	{
		return fileItemId;
	}

	/**
	 * Sets the file item id.
	 *
	 * @param fileItemId
	 *           the fileItemId to set
	 */
	public void setFileItemId(final Long fileItemId)
	{
		this.fileItemId = fileItemId;
	}

	/**
	 * Gets the file item num.
	 *
	 * @return the fileItemNum
	 */
	public Integer getFileItemNum()
	{
		return fileItemNum;
	}

	/**
	 * Sets the file item num.
	 *
	 * @param fileItemNum
	 *           the fileItemNum to set
	 */
	public void setFileItemNum(final Integer fileItemNum)
	{
		this.fileItemNum = fileItemNum;
	}

	/**
	 * Gets the deposit date.
	 *
	 * @return the depositDate
	 */
	public Date getDepositDate()
	{
		return depositDate;
	}

	/**
	 * Sets the deposit date.
	 *
	 * @param depositDate
	 *           the depositDate to set
	 */
	public void setDepositDate(final Date depositDate)
	{
		this.depositDate = depositDate;
	}

	/**
	 * Gets the step label fr.
	 *
	 * @return the stepLabelFr
	 */
	public String getStepLabelFr()
	{
		return stepLabelFr;
	}

	/**
	 * Sets the step label fr.
	 *
	 * @param stepLabelFr
	 *           the stepLabelFr to set
	 */
	public void setStepLabelFr(final String stepLabelFr)
	{
		this.stepLabelFr = stepLabelFr;
	}

	/**
	 * Gets the step label en.
	 *
	 * @return the stepLabelEn
	 */
	public String getStepLabelEn()
	{
		return stepLabelEn;
	}

	/**
	 * Sets the step label en.
	 *
	 * @param stepLabelEn
	 *           the stepLabelEn to set
	 */
	public void setStepLabelEn(final String stepLabelEn)
	{
		this.stepLabelEn = stepLabelEn;
	}

	/**
	 * Gets the step date.
	 *
	 * @return the stepDate
	 */
	public Date getStepDate()
	{
		return stepDate;
	}

	/**
	 * Sets the step date.
	 *
	 * @param stepDate
	 *           the stepDate to set
	 */
	public void setStepDate(final Date stepDate)
	{
		this.stepDate = stepDate;
	}

	/**
	 * Gets the time exceeded.
	 *
	 * @return the timeExceeded
	 */
	public Boolean getTimeExceeded()
	{
		return timeExceeded;
	}

	/**
	 * Sets the time exceeded.
	 *
	 * @param timeExceeded
	 *           the timeExceeded to set
	 */
	public void setTimeExceeded(final Boolean timeExceeded)
	{
		this.timeExceeded = timeExceeded;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public Short getDuration()
	{
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration
	 *           the duration to set
	 */
	public void setDuration(final Short duration)
	{
		this.duration = duration;
	}

	/**
	 * Gets the item flow id.
	 *
	 * @return the itemFlowId
	 */
	public Long getItemFlowId()
	{
		return itemFlowId;
	}

	/**
	 * Sets the item flow id.
	 *
	 * @param itemFlowId
	 *           the itemFlowId to set
	 */
	public void setItemFlowId(final Long itemFlowId)
	{
		this.itemFlowId = itemFlowId;
	}

	/**
	 * Gets the flow code.
	 *
	 * @return the flowCode
	 */
	public String getFlowCode()
	{
		return flowCode;
	}

	/**
	 * Sets the flow code.
	 *
	 * @param flowCode
	 *           the flowCode to set
	 */
	public void setFlowCode(final String flowCode)
	{
		this.flowCode = flowCode;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		builder.append("DocumentInfo [fileId=");
		builder.append(fileId);
		builder.append(", fileItemId=");
		builder.append(fileItemId);
		builder.append(", fileItemNum=");
		builder.append(fileItemNum);
		builder.append(", depositDate=");
		builder.append(depositDate);
		builder.append(", stepLabelFr=");
		builder.append(stepLabelFr);
		builder.append(", stepLabelEn=");
		builder.append(stepLabelEn);
		builder.append(", stepDate=");
		builder.append(stepDate);
		builder.append(", timeExceeded=");
		builder.append(timeExceeded);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", itemFlowId=");
		builder.append(itemFlowId);
		builder.append(", flowCode=");
		builder.append(flowCode);
		builder.append(']');
		return builder.toString();
	}

}
