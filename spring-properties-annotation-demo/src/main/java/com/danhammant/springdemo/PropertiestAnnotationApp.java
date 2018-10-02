package com.danhammant.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.danhammant.springdemo.domain.Organisation;

public class PropertiestAnnotationApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(PropertyConfig.class);
		Organisation org = (Organisation) ctx.getBean("myorg");
		System.out.println(org);
		System.out.println("slogan: " + org.corporateSlogan());

		((AnnotationConfigApplicationContext) ctx).close();

	}
}
