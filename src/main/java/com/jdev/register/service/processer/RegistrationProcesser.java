package com.jdev.register.service.processer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jdev.common.domain.register.dto.RegistrationDTO;
import com.jdev.register.repository.RegistrationRepository;

@Component
public class RegistrationProcesser {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public boolean checkUsername(String userName) {
		
		boolean userExists = false;
		
		try {
			List<Object> record = registrationRepository.findByUserName(userName);
			if(record != null && !record.isEmpty()) {
				userExists = true;
			}
		} catch (Exception exception) {
			throw exception;
		}
		
		return userExists;
	}
	
	public boolean registerCustomer(RegistrationDTO registrationRequest) {
		
		boolean userSaved = true;
		
		try {
			Object object = registrationRepository.save(registrationRequest);
			System.out.println(object);
		} catch (Exception exception) {
			userSaved = false;
			throw exception;
		}
		
		return userSaved;
	}
	
}
