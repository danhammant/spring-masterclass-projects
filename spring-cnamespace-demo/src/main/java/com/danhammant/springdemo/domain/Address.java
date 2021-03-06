package com.danhammant.springdemo.domain;

public class Address {
	private String street;
	private String city;
	private String postCode;
	
	public Address(String street, String city, String postCode) {
		this.street = street;
		this.city = city;
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postCode=" + postCode + "]";
	}
}
