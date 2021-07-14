package com.jdev.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdev.common.domain.metadata.CommonResponse;
import com.jdev.common.domain.register.Registration;
import com.jdev.common.util.utils.CommonUtils;
import com.jdev.register.service.RegistrationService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
//@RequestMapping(path = "/")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registerService;
	
//	private Tracer
	
	@GetMapping(path="/emp", produces = "application/json")
    public String getEmployees() 
    {
        return "THi si new";
    }
	
	@PostMapping(value = "/customer/new/v1")
	public CommonResponse registerCustomer(@RequestBody Registration loginRequest, BindingResult bindingResult) throws Exception {
		
		log.info(CommonUtils.entry("RegisterCustomer"));
		CommonResponse commonResponse = registerService.registerCustomer(loginRequest, bindingResult);
		log.info(CommonUtils.exit("RegisterCustomer"));
		return commonResponse;
	}
	 
}
