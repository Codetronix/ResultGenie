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
@Table( name = "subject" )
public class Subject {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "s_subject_id" )
	private Integer subjectId;

	@Column( name = "s_subject_name" )
	private String subjectName;

	@Column( name = "s_subject_code" )
	private String subjectCode;

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinColumn( name = "tp_frn_subject_id" )
	private List<TheoryPractical> thoeryPractical;

	public List<TheoryPractical> getThoeryPractical()
	{
		return thoeryPractical;
	}

	public void setThoeryPractical( List<TheoryPractical> thoeryPractical )
	{
		this.thoeryPractical = thoeryPractical;
	}

	public Integer getSubjectId()
	{
		return subjectId;
	}

	public void setSubjectId( Integer subjectId )
	{
		this.subjectId = subjectId;
	}

	public String getSubjectName()
	{
		return subjectName;
	}

	public void setSubjectName( String subjectName )
	{
		this.subjectName = subjectName;
	}

	public String getSubjectCode()
	{
		return subjectCode;
	}

	public void setSubjectCode( String subjectCode )
	{
		this.subjectCode = subjectCode;
	}

}
