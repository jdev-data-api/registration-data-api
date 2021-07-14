package com.jdev.register.service;

import org.springframework.validation.BindingResult;

import com.jdev.common.domain.metadata.CommonResponse;
import com.jdev.common.domain.register.Registration;

public interface RegistrationService {

	public CommonResponse registerCustomer(Registration loginRequest, BindingResult bindingResult) throws Exception;

}
