package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhammant.springdemo.domain.HumanResourceDept;
import com.danhammant.springdemo.domain.Organisation;

public class DIConstructorApp {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// Invoke company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		// Print org. details
//		System.out.println(org);	
//		
//		System.out.println(org.corporateService());
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));
		
		// Close app context (container)
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
