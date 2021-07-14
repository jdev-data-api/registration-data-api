package com.jdev.register;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jdev.common.util.constants.CommonConstants;

@SpringBootApplication
@ComponentScan({"com.jdev.*"})
public class RegisterApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(RegisterApplication.class);
	
	public static void main(String[] args) {
		System.out.println("Hello World!" + CommonConstants.EMPTY);
		SpringApplication.run(RegisterApplication.class, args);
		LOGGER.info("---------HI THIS IS JDEV HODD---------");
		LOGGER.debug("This is a debug message");
		LOGGER.info("This is an info message");
		LOGGER.warn("This is a warn message");
		LOGGER.error("This is an error message");
		LOGGER.fatal("This is a fatal message");
	}
}
