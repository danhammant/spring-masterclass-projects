package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		Organisation org = (Organisation) ctx.getBean("myorg");
		Organisation org2 = (Organisation) ctx.getBean("myorg2");
		
		// Invoke company slogan via the bean
//		org.corporateSlogan();
		
		// Print org. details
		System.out.println(org);
		
		// Close app context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
