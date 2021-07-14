package com.jdev.register.service.helper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.jdev.common.domain.register.Registration;
import com.jdev.common.domain.register.dto.RegistrationDTO;

@Component
public class RegistrationHelper {

	public RegistrationDTO processRegistrationDTORequest(Registration loginRequest) {
		
		RegistrationDTO registrationDTO = null;
		if(loginRequest != null) {
			registrationDTO = new RegistrationDTO();
			BeanUtils.copyProperties(loginRequest, registrationDTO);
		//	String requestId = getUniqueRequestId(loginRequest.getFirstName(), loginRequest.getLastName(), loginRequest.getPhoneNo());
		//	registrationDTO.setRequestId(requestId);
		}
		return registrationDTO;
	}
	
	private String getUniqueRequestId(String input1, String input2, String input3) {
		
		String uniqueRequestId = input1.concat(input2).concat(input3);
		return null;
	}
}
