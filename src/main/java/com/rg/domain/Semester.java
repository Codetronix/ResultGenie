package com.rg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
