package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IoCAPP1 {

	public static void main(String[] args) {
		// Create application context (container)
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		// Create the bean
		Organisation org = (Organisation) ctx.getBean("myorg");
		
		// Invoke company slogan via the bean
		org.corporateSlogan();
		
		// Close app context (container)
		((FileSystemXmlApplicationContext) ctx).close();

	}

}
