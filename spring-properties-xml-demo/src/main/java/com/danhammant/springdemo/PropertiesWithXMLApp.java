package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhammant.springdemo.domain.Organisation;
import com.danhammant.springdemo.domain.promotion.TradeFair;

public class PropertiesWithXMLApp {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");		

		Organisation org = (Organisation) ctx.getBean("myorg");
		System.out.println(org);
		
				
		// Close app context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
