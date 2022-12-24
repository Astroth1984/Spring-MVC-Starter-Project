package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>  {
	
	private String[] coursePrefixes;

	@Override
	public void initialize(CourseCode courseCode) {
		
		coursePrefixes = courseCode.value();
	}

	// theCode is the string entered in the html form (course code field)
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		
		boolean result = false;
		
		if(theCode != null) {
			for(String tempPrefix: coursePrefixes) {
				
				result = theCode.startsWith(tempPrefix);
				if(result) {
					break;
				}
			}
		} else {
			return true;
		}
		
		return result;
	}

}
