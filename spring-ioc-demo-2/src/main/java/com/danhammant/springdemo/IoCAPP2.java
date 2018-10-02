package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAPP2 {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// Invoke company slogan via the bean
		org.corporateSlogan();
		
		// Close app context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
