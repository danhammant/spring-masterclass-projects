package com.danhammant.springdemo.domain.product;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class IndustrialProduct extends GenericProduct {

	@Override
	public int calculatePrice() {
		Random random = new Random();
		int price = random.nextInt(priceRandomiser);
		return price;
	}

}
