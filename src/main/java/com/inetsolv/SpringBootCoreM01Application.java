package com.inetsolv;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inetsolv.beans.Person;

@SpringBootApplication
public class SpringBootCoreM01Application {

	@Autowired //resource//inject also we can use
	private Person person;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoreM01Application.class, args);
	
	}
	
	@PostConstruct // use to call after beans is initallize
	public void Display() {
		person.displayPerson();
	}

}
