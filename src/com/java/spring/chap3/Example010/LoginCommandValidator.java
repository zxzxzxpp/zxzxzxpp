package com.java.spring.chap3.Example010;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginCommandValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginCommand.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required");
	}
	
}
