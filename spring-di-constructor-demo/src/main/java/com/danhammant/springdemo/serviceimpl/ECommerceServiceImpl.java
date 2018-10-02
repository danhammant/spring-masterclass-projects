package com.danhammant.springdemo.serviceimpl;

import java.util.Random;

import com.danhammant.springdemo.service.BusinessService;

public class ECommerceServiceImpl implements BusinessService {

	public String officeService(String companyName) {
		Random random = new Random();
		String service = "\nAs an organisation, " + companyName + 
				" provides an outstanding ECommerce platform. " + 
				"\nThe annual revenue exceeds " + random.nextInt(revenue) + " dollars.";
		
		return service;
	}

}
