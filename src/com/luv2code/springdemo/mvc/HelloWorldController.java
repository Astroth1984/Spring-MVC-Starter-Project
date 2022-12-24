package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// The initial html Form controller
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// process html form controller
	@RequestMapping("/processForm")
	public String processFormu() {
		return "helloworld";
	}
	
	// Read form data
	// Add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// Read request parameter from html Form
		String theName = request.getParameter("studentName");
		
		// Uppercase
		theName = theName.toUpperCase();
		
		// Create message
		String result = "Yo! " + theName;
		
		// Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		
		
		// Uppercase
		theName = theName.toUpperCase();
		
		// Create message
		String result = "Yo From V3 processForm! " + theName;
		
		// Add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
