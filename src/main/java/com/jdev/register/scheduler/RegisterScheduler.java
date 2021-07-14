package com.jdev.register.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.jdev.common.domain.register.Registration;
import com.jdev.register.service.RegistrationService;


//@Component
//@EnableScheduling
//public class RegisterScheduler {
//
//	@Autowired
//	private RegistrationService registrationService;
//	
//	@Scheduled(cron = "*/10  *  *  *  *  *")
//	public void registerScheduler() {
//		try {
//			registrationService.registerCustomer(new Registration(), null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
