package com.danhammant.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.danhammant.springdemo.dao.OrganisationDAO;
import com.danhammant.springdemo.domain.Organisation;

public class JDBCTemplateClassicApp1 {

	public static void main(String[] args) {
		
		//Creating app context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		//Create the bean
		OrganisationDAO dao = (OrganisationDAO) ctx.getBean("orgDAO");
		List<Organisation> orgs = dao.getAllOrganisations();
		for (Organisation org : orgs) {
			System.out.println(org);
		}
		
		//Close app context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
