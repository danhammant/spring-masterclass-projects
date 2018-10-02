package com.danhammant.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.danhammant.springdemo.service.BusinessService;

public class Organisation {
	private String companyName;
	private int yearOfIncorporation;
	
	@Value("${org.postalCode}")
	private String postalCode;
	
	private int employeeCount;	
	private String slogan;
	private BusinessService businessService;
		
	public Organisation() {
		System.out.println("Default constructor called");
	}
	
	public Organisation(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("Constructor called");
	}
	
//	public void initialize() {
//		System.out.println("Organisation: initialize() called");
//	}
//	
//	public void destroy() {
//		System.out.println("Organisation: destroy() called");
//	}
	
	public void postConstruct() {
		System.out.println("Organisation: postConstruct called....................");
	}
	
	public void preDestroy() {
		System.out.println("Organisation: preDestroy called....................");
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		System.out.println("setPostalCode() called");
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
		System.out.println("setEmployeeCount() called");
	}

	@Autowired
	public void setSlogan(@Value("${org.slogan}") String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan() called");
	}


	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService() called");
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
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + ", slogan=" + slogan + "]";
	}
	
	
}
