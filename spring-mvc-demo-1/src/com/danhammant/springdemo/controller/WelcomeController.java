package com.danhammant.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danhammant.service.demo.GenericWelcomeService;
import com.danhammant.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService; 
	
	//Maps web requests on to specific handler classes/handler methods.
	//Here defining doWelcome as handler method.
	//"/" Configures it so that all requests to map that match this URL pattern will be routed to this method.
	// URL will be something like http://localhost:8080/spring-mvc-demo-1/
	//Model is a container that holds the data (similar to Java map class)
	@RequestMapping("/") 	
	public String doWelcome(Model model) { 
		
		// 1. Retrieving the processed data
//		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Dan Hammant");
		
		// 2. Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage); // Makes data available in JSP as request attribute
		
		// 3. Return logical view name
		return "welcomeNew"; // welcomeNew logical name of view to which requests will be forwarded by controller
							 // In this context, the view is the JSP
							 // /WEB-INF/views/welcomeNew.jsp
		
	}

}
