package com.rg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "theory_practical" )
public class TheoryPractical {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "tp_theory_practical_id" )
	private Integer theoryPracticalId;

	@Column( name = "tp_internal_score" )
	private Integer internalScore;

	@Column( name = "tp_external_score" )
	private Integer externalScore;

	@Column(name="tp_is_practical")
	private Boolean isPractical;
	
	@Column(name="tp_result_class")
	private Boolean resultClass;
	
	
	public Boolean getResultClass()
	{
		return resultClass;
	}

	
	public void setResultClass( Boolean resultClass )
	{
		this.resultClass = resultClass;
	}

	public Integer getTheoryPracticalId()
	{
		return theoryPracticalId;
	}

	public void setTheoryPracticalId( Integer theoryPracticalId )
	{
		this.theoryPracticalId = theoryPracticalId;
	}

	public Integer getInternalScore()
	{
		return internalScore;
	}

	public void setInternalScore( Integer internalScore )
	{
		this.internalScore = internalScore;
	}

	public Integer getExternalScore()
	{
		return externalScore;
	}

	public void setExternalScore( Integer externalScore )
	{
		this.externalScore = externalScore;
	}

	public Boolean getIsPractical()
	{
		return isPractical;
	}

	public void setIsPractical( Boolean isPractical )
	{
		this.isPractical = isPractical;
	}

}
