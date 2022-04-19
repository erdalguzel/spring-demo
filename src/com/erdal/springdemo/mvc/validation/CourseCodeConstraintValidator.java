package com.erdal.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String courseCodePrefix;

	@Override
	public void initialize(CourseCode courseCode) {
		courseCodePrefix = courseCode.value();
	}

	@Override
	public boolean isValid(String userFormData, ConstraintValidatorContext constraintValidatorContext) {
		boolean result = userFormData.startsWith(courseCodePrefix);
		return result;
	}

}
