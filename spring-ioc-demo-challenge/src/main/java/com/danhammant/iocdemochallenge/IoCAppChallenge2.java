package com.danhammant.iocdemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAppChallenge2 {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		//Create the bean
		City city = (City) ctx.getBean("mycity");
		
		//Print city via bean
		city.cityName();
		
		//Close the container
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
