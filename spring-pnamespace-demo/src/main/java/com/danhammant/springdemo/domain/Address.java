package com.danhammant.springdemo.domain;

public class Address {
	private String street;
	private String city;
	private String postCode;

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postCode=" + postCode + "]";
	}
}
