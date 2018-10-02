package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhammant.springdemo.domain.promotion.TradeFair;

public class AutowiredAnnotationApp {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");		

		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
		System.out.println(tradeFair.specialPromotionalPricing());
		
				
		// Close app context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
