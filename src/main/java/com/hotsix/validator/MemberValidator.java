package com.hotsix.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hotsix.member.MemberModel;

public class MemberValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// 유효성검사하려는 model이 Validation가능한지 여부를 확인하고 가능하면 검사시작
		return MemberModel.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemberModel member = (MemberModel)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwd", "passwd");
		
		// 비밀번호가 일치하지 않는다면
		if(member.getPasswd().equals(member.getPasswd2()) == false){
			errors.rejectValue("passwd2", "passwd2");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name");
		ValidationUtils.rejectIfEmpty(errors, "email", "email");
	}
	
}
