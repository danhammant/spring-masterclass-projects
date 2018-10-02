package com.danhammant.springdemo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.danhammant.springdemo.service.BusinessService;

@Component("myorg")
public class Organisation {
	@Value("${nameOfCompany}")
	private String companyName;
	
	@Value("${startUpYear}")
	private int yearOfIncorporation;
	
	@Value("${postCode}")
	private String postalCode;
	
	@Value("${empCount:22222}")
	private int employeeCount;	
	
	@Value("${corporateSlogan:We build world class software!}")
	private String slogan;
		
	@Autowired
	private Environment env;
	
	private String missionStatement;
	
	private BusinessService businessService;
		
	public Organisation() {
		System.out.println("Default constructor called");
	}
	
	public Organisation(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		System.out.println("Constructor called");
	}
	
	public String corporateSlogan() {		
		missionStatement = env.getProperty("statement");
		return missionStatement + " and also " + slogan;
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

	public void setSlogan(String slogan) {
		this.slogan = slogan;
		System.out.println("setSlogan() called");
	}


	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
		System.out.println("setBusinessService() called");
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
