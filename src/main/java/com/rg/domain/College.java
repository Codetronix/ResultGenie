package com.rg.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "college" )
public class College {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_college_id")
	private Integer collegeId;

	@Column(name="c_college_code")
	private String collegeCode;

	@Column(name="c_college_name")
	private String collegeName;

	public Integer getCollegeId()
	{
		return collegeId;
	}

	public void setCollegeId( Integer collegeId )
	{
		this.collegeId = collegeId;
	}

	public String getCollegeCode()
	{
		return collegeCode;
	}

	public void setCollegeCode( String collegeCode )
	{
		this.collegeCode = collegeCode;
	}

	public String getCollegeName()
	{
		return collegeName;
	}

	public void setCollegeName( String collegeName )
	{
		this.collegeName = collegeName;
	}

}
