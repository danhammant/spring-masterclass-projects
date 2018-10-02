package com.danhammant.springdemo.domain;

public class Organisation {
	private String companyName;
	private int yearOfIncorporation;
	private Address address;


	public Organisation(String companyName, int yearOfIncorporation, Address address) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Organisation [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", address=" + address + "]";
	}
	
	
}
