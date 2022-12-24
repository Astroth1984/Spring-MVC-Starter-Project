package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// Create Student Object
		Student theStudent = new Student();
		
		// Add student object to Model
		theModel.addAttribute("student",theStudent);
		
		return "student-form";
	}
	
	// binding form data
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		// Log input data
		System.out.println("student: "+ student.getFirstName() + " " + student.getLastName() + 
				" " + student.getCountry() + " " + student.getFavoriteLanguage());
		return "student-confirmation";
		
	}

}
