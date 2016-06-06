package org.guce.siat.core.ct.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.guce.siat.common.model.AbstractModel;
import org.guce.siat.common.model.ItemFlow;


/**
 * The Class EssayTestResult.
 */
@Entity
@Table(name = "ESSAY_TEST_AP")
public class EssayTestAP extends AbstractModel implements Serializable
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4908048241016818734L;

	/** The id. */
	@Id
	@Basic(optional = false)
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ESSAY_TEST_RESULT_SEQ")
	@SequenceGenerator(name = "ESSAY_TEST_RESULT_SEQ", sequenceName = "ESSAY_TEST_RESULT_SEQ", allocationSize = 1)
	private Long id;

	/** The type. */
	@Column(name = "TYPE")
	private String type;

	/** The nature. */
	@Column(name = "NATURE")
	private String nature;

	/** The condition. */
	@Column(name = "CONDITION")
	private String condition;

	/** The culture. */
	@Column(name = "CULTURE")
	private String culture;


	/** The stage. */
	@Column(name = "STAGE")
	private String stage;

	/** The description. */
	@Column(name = "DESCRIPTION", length = 1000)
	private String description;

	/** The place. */
	@Column(name = "PLACE")
	private String place;

	/** The test date. */
	@Column(name = "TEST_DATE")
	@Temporal(value = TemporalType.DATE)
	private Date testDate;

	/** The town code. */
	@Column(name = "TOWN_CODE")
	private String townCode;

	/** The town name. */
	@Column(name = "TOWN_NAME")
	private String townName;

	/** The contributors. */
	@Column(name = "CONTRIBUTORS")
	private String contributors;


	/** The resultats. */
	@Column(name = "RESULTATS")
	private String resultats;

	/** The obsevations. */
	@Column(name = "OBSEVATIONS", length = 1000)
	private String obsevations;

	/** The item flow. */
	@JoinColumn(name = "ITEM_FLOW_ID", referencedColumnName = "ID")
	@ManyToOne
	private ItemFlow itemFlow;

	/**
	 * Instantiates a new essay test ap.
	 */
	public EssayTestAP()
	{

	}

	/**
	 * Instantiates a new essay test ap.
	 *
	 * @param itemFlow
	 *           the item flow
	 */
	public EssayTestAP(final ItemFlow itemFlow)
	{
		super();
		this.itemFlow = itemFlow;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Override
	public Long getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *           the id to set
	 */
	@Override
	public void setId(final Long id)
	{
		this.id = id;
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
	 *           the type to set
	 */
	public void setType(final String type)
	{
		this.type = type;
	}

	/**
	 * Gets the nature.
	 *
	 * @return the nature
	 */
	public String getNature()
	{
		return nature;
	}

	/**
	 * Sets the nature.
	 *
	 * @param nature
	 *           the nature to set
	 */
	public void setNature(final String nature)
	{
		this.nature = nature;
	}

	/**
	 * Gets the condition.
	 *
	 * @return the condition
	 */
	public String getCondition()
	{
		return condition;
	}

	/**
	 * Sets the condition.
	 *
	 * @param condition
	 *           the condition to set
	 */
	public void setCondition(final String condition)
	{
		this.condition = condition;
	}

	/**
	 * Gets the culture.
	 *
	 * @return the culture
	 */
	public String getCulture()
	{
		return culture;
	}

	/**
	 * Sets the culture.
	 *
	 * @param culture
	 *           the culture to set
	 */
	public void setCulture(final String culture)
	{
		this.culture = culture;
	}

	/**
	 * Gets the stage.
	 *
	 * @return the stage
	 */
	public String getStage()
	{
		return stage;
	}

	/**
	 * Sets the stage.
	 *
	 * @param stage
	 *           the stage to set
	 */
	public void setStage(final String stage)
	{
		this.stage = stage;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *           the description to set
	 */
	public void setDescription(final String description)
	{
		this.description = description;
	}

	/**
	 * Gets the place.
	 *
	 * @return the place
	 */
	public String getPlace()
	{
		return place;
	}

	/**
	 * Sets the place.
	 *
	 * @param place
	 *           the place to set
	 */
	public void setPlace(final String place)
	{
		this.place = place;
	}

	/**
	 * Gets the test date.
	 *
	 * @return the testDate
	 */
	public Date getTestDate()
	{
		return testDate;
	}

	/**
	 * Sets the test date.
	 *
	 * @param testDate
	 *           the testDate to set
	 */
	public void setTestDate(final Date testDate)
	{
		this.testDate = testDate;
	}

	/**
	 * Gets the town code.
	 *
	 * @return the townCode
	 */
	public String getTownCode()
	{
		return townCode;
	}

	/**
	 * Sets the town code.
	 *
	 * @param townCode
	 *           the townCode to set
	 */
	public void setTownCode(final String townCode)
	{
		this.townCode = townCode;
	}

	/**
	 * Gets the town name.
	 *
	 * @return the townName
	 */
	public String getTownName()
	{
		return townName;
	}

	/**
	 * Sets the town name.
	 *
	 * @param townName
	 *           the townName to set
	 */
	public void setTownName(final String townName)
	{
		this.townName = townName;
	}

	/**
	 * Gets the contributors.
	 *
	 * @return the contributors
	 */
	public String getContributors()
	{
		return contributors;
	}

	/**
	 * Sets the contributors.
	 *
	 * @param contributors
	 *           the contributors to set
	 */
	public void setContributors(final String contributors)
	{
		this.contributors = contributors;
	}

	/**
	 * Gets the resultats.
	 *
	 * @return the resultats
	 */
	public String getResultats()
	{
		return resultats;
	}

	/**
	 * Sets the resultats.
	 *
	 * @param resultats
	 *           the resultats to set
	 */
	public void setResultats(final String resultats)
	{
		this.resultats = resultats;
	}

	/**
	 * Gets the obsevations.
	 *
	 * @return the obsevations
	 */
	public String getObsevations()
	{
		return obsevations;
	}

	/**
	 * Sets the obsevations.
	 *
	 * @param obsevations
	 *           the obsevations to set
	 */
	public void setObsevations(final String obsevations)
	{
		this.obsevations = obsevations;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * Gets the item flow.
	 *
	 * @return the itemFlow
	 */
	public ItemFlow getItemFlow()
	{
		return itemFlow;
	}

	/**
	 * Sets the item flow.
	 *
	 * @param itemFlow
	 *           the itemFlow to set
	 */
	public void setItemFlow(final ItemFlow itemFlow)
	{
		this.itemFlow = itemFlow;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object)
	{
		if (!(object instanceof EssayTestAP))
		{
			return false;
		}
		final EssayTestAP other = (EssayTestAP) object;
		if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId())))
		{
			return false;
		}
		return true;
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
		builder.append("EssayTestAP [id=");
		builder.append(id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", nature=");
		builder.append(nature);
		builder.append(", condition=");
		builder.append(condition);
		builder.append(", culture=");
		builder.append(culture);
		builder.append(", stage=");
		builder.append(stage);
		builder.append(", description=");
		builder.append(description);
		builder.append(", place=");
		builder.append(contributors);
		builder.append(", resultats=");
		builder.append(resultats);
		builder.append(", obsevations=");
		builder.append(obsevations);
		builder.append(']');
		return builder.toString();
	}


}
