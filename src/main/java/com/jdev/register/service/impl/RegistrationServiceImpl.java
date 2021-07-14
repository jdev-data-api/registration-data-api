package com.jdev.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jdev.common.domain.metadata.CommonResponse;
import com.jdev.common.domain.metadata.OutputMetaData;
import com.jdev.common.domain.register.Registration;
import com.jdev.common.domain.register.dto.RegistrationDTO;
import com.jdev.common.exception.BusinessValidationException;
import com.jdev.common.exception.InputValidationException;
import com.jdev.common.util.token.IdGenerator;
import com.jdev.register.service.RegistrationService;
import com.jdev.register.service.helper.RegistrationHelper;
import com.jdev.register.service.processer.RegistrationProcesser;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private IdGenerator idGenerator;
	
	@Autowired
	private RegistrationHelper registrationHelper;
	
	@Autowired
	private RegistrationProcesser registrationProcesser;
	
	public CommonResponse registerCustomer(Registration loginRequest,  BindingResult bindingResult) throws Exception {

		System.out.println("--------------RegisterScheduler-----------------");
		CommonResponse commonResponse = new CommonResponse();
		try {
			
			if (bindingResult.hasErrors()) {
				//TODO: Implement
				throw new InputValidationException("", "");
			}
			
			boolean userExists = registrationProcesser.checkUsername(loginRequest.getUserName());
			
			if (userExists) {
				//throw the custom validation exception and return the new generated username with the recommendation
				//throw new BusinessValidationException("202", "Username already Exists");
				OutputMetaData outputMetaData = new OutputMetaData();
				outputMetaData.setCode("202");
				outputMetaData.setStatus("Username already Exists");
				commonResponse.setOutputMetaData(outputMetaData);
			} else {
				RegistrationDTO registrationDTO = registrationHelper.processRegistrationDTORequest(loginRequest);
				boolean userSaved = registrationProcesser.registerCustomer(registrationDTO);
				if(userSaved) {
					OutputMetaData outputMetaData = new OutputMetaData();
					outputMetaData.setCode("200");
					outputMetaData.setStatus("Success");
					commonResponse.setOutputMetaData(outputMetaData);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return commonResponse;
	}

}


//Check the Username and DB and return the new id
//form a unique Id for record fetch