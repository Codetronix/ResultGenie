package com.rg.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "branch" )
public class Branch {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "b_branch_id" )
	private Integer branchId;

	@Column( name = "b_branch_value" )
	private String branchValue;
	
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	private List<Subject> subjects;
	
	public List<Subject> getSubjects()
	{
		return subjects;
	}

	public void setSubjects( List<Subject> subjects )
	{
		this.subjects = subjects;
	}


	public Integer getBranchId()
	{
		return branchId;
	}

	public void setBranchId( Integer branchId )
	{
		this.branchId = branchId;
	}

	public String getBranchValue()
	{
		return branchValue;
	}

	public void setBranchValue( String branchValue )
	{
		this.branchValue = branchValue;
	}

}
