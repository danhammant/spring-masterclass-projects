package com.danhammant.springdemo.domain;

import com.danhammant.springdemo.service.BusinessService;

public class Organisation {
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;	
	private String slogan;
	private BusinessService businessService;
		
//	public Organisation() {
//		
//	}
	
	public Organisation(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}


	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}
	
	public String getCompanyName() {
		return companyName;
	}


	public String corporateSlogan() {		
		return slogan;
	}
	
	public String corporateService() {
		return businessService.officeService(companyName);
	}


	@Override
	public String toString() {
		return "Organisation [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
	
	
}
