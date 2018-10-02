package com.danhammant.iocdemochallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IoCAppChallenge1 {

	public static void main(String[] args) {
		// Create the container
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans-challenge.xml");
		
		// Create the bean
		City city = (City) ctx.getBean("mycity");
		
		// Print the city
		city.cityName();
		
		//Close the container
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
