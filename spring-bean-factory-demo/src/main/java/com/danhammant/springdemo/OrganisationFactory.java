package com.danhammant.springdemo;

public class OrganisationFactory {
	
	public Organisation getInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking instance factory method.....");
		
		return new Organisation(companyName, yearOfIncorporation);
	}

}
