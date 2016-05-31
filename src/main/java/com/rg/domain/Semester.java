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
@Table( name = "semester" )
public class Semester {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "s_semester_id" )
	private Integer semesterId;

	@Column( name = "s_semester_value" )
	private String semesterValue;

	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JoinColumn( name = "subject_frn_semester_id" )
	private List<Subject> subjects;

	public List<Subject> getSubjects()
	{
		return subjects;
	}

	public void setSubjects( List<Subject> subjects )
	{
		this.subjects = subjects;
	}

	public Integer getSemesterId()
	{
		return semesterId;
	}

	public void setSemesterId( Integer semesterId )
	{
		this.semesterId = semesterId;
	}

	public String getSemesterValue()
	{
		return semesterValue;
	}

	public void setSemesterValue( String semesterValue )
	{
		this.semesterValue = semesterValue;
	}

}
