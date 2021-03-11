package com.inetsolv.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Person {
 
	Logger logger= LoggerFactory.getLogger(getClass());
	
	
	public Person() {
		logger.info("Persion Object is created");
	}
	
	public void displayPerson() {
		
		logger.info("Persion logger method called");
	}
	
}
