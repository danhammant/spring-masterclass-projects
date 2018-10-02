package com.danhammant.springdemo.serviceimpl;

import java.util.Random;

import com.danhammant.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String officeService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organisation, " + companyName + 
				" offers world class cloud-computing infrastructure" + 
				"\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		
		return service;
		
	}
	
	public void postConstruct() {
		System.out.println("CloudServiceImpl: postConstruct called....................");
	}
	
	public void preDestroy() {
		System.out.println("CloudServiceImpl: preDestroy called....................");
	}

}
