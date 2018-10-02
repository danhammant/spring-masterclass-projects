package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhammant.springdemo.domain.Organisation;

public class BeanScopeApp {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		Organisation org = (Organisation) ctx.getBean("myorg");
		Organisation org2 = (Organisation) ctx.getBean("myorg");
		org2.setPostalCode("98989");
		
		// Invoke company slogan via the bean
//		System.out.println(org.corporateSlogan());
		
		// Print org. details
		System.out.println(org);	
		System.out.println(org2);
		
		if (org == org2) {
			System.out.println("Singleton scope test: org and org2 point to same instance.");
		} else {
			System.out.println("Both org and org2 are separate instances");
		}
		
//		System.out.println(org.corporateService());
		
		// Close app context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
