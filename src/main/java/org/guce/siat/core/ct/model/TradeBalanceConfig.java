package org.guce.siat.core.ct.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.guce.siat.common.model.AbstractModel;


/**
 * The Class TradeBalanceConfig.
 */
@Entity
@Table(name = "TRADE_BALANCE_CONFIG")
@XmlRootElement
public class TradeBalanceConfig extends AbstractModel implements Serializable


{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRADE_BALANCE_CONFIG_SEQ")
	@SequenceGenerator(name = "TRADE_BALANCE_CONFIG_SEQ", sequenceName = "TRADE_BALANCE_CONFIG_SEQ", allocationSize = 1)
	private Long id;

	/** The code. */
	@Column(name = "code", length = 11)
	private String code;

	/** The label. */
	@Column(name = "label")
	private String label;

	/** The type. */
	@Column(name = "type", length = 2)
	private String type;

	/** The count. */
	@Column(name = "count")
	private Boolean count;


	@Override
	public Long getId()
	{
		return id;
	}


	@Override
	public void setId(final Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public String getCode()
	{
		return code;
	}

	/**
	 * Sets the code.
	 *
	 * @param code
	 *           the new code
	 */
	public void setCode(final String code)
	{
		this.code = code;
	}

	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the label.
	 *
	 * @param label
	 *           the new label
	 */
	public void setLabel(final String label)
	{
		this.label = label;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *           the new type
	 */
	public void setType(final String type)
	{
		this.type = type;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public Boolean getCount()
	{
		return count;
	}

	/**
	 * Sets the count.
	 *
	 * @param count
	 *           the new count
	 */
	public void setCount(final Boolean count)
	{
		this.count = count;
	}

}
