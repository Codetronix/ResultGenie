package com.rg.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "student" )
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="s_student_id")
	private Integer studentId;

	@Column(name="s_student_usn")
	private String studentUSN;

	@Column(name="s_student_name")
	private String studentName;
	
	@ManyToOne
	private College college;
	
	@ManyToMany
	private List<Subject> subjects;

	public Integer getStudentId()
	{
		return studentId;
	}

	public void setStudentId( Integer studentId )
	{
		this.studentId = studentId;
	}

	public String getStudentUSN()
	{
		return studentUSN;
	}

	public void setStudentUSN( String studentUSN )
	{
		this.studentUSN = studentUSN;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public void setStudentName( String studentName )
	{
		this.studentName = studentName;
	}

}
