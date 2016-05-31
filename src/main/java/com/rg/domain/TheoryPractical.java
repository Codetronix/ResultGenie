package com.rg.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinColumn( name = "sm_frn_tp_id" )
	private List<StudentMarks> studentMarks;

	public List<StudentMarks> getStudentMarks()
	{
		return studentMarks;
	}

	public void setStudentMarks( List<StudentMarks> studentMarks )
	{
		this.studentMarks = studentMarks;
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
