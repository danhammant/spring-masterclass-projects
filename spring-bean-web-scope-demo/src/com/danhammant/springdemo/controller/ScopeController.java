package com.danhammant.springdemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danhammant.springdemo.service.RandomiserRequestScope;
import com.danhammant.springdemo.service.RandomiserSessionScope;

@Controller
public class ScopeController {
	
	@Autowired
	RandomiserRequestScope randomiserRequestScope;
	
	@Autowired
	RandomiserSessionScope randomiserSessionScope;
	
	@RequestMapping("/")
	public void getRandom(HttpServletResponse response) throws Exception {
		 response.getWriter().write("************** request scope **************" + "<br>");
		 response.getWriter().write("Old number: " + randomiserRequestScope.getRandomNumber() + "<br>");
		 randomiserRequestScope.generateRandomNumber();
		 response.getWriter().write("New number: " + randomiserRequestScope.getRandomNumber() + "<br>");
		 response.getWriter().write("Object reference: " + randomiserRequestScope + "<br>");
		 
		 response.getWriter().write("************** session scope **************" + "<br>");
		 response.getWriter().write("Old number: " + randomiserSessionScope.getRandomNumber() + "<br>");
		 randomiserSessionScope.generateRandomNumber();
		 response.getWriter().write("New number: " + randomiserSessionScope.getRandomNumber() + "<br>");
		 response.getWriter().write("Object reference: " + randomiserSessionScope + "<br>");
	}

}
