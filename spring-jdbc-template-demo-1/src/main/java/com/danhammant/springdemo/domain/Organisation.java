package com.danhammant.springdemo.domain;

public class Organisation {
	private int id;
	private String companyName;
	private int yearOfIncorporation;
	private String postCode;
	private int employeeCount;
	private String slogan;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getYearOfIncorporation() {
		return yearOfIncorporation;
	}
	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public String getSlogan() {
		return slogan;
	}
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}
	@Override
	public String toString() {
		return "Organisation [id=" + id + ", companyName=" + companyName + ", yearOfIncorporation="
				+ yearOfIncorporation + ", postCode=" + postCode + ", employeeCount=" + employeeCount + ", slogan="
				+ slogan + "]";
	}
	
	
}
