package com.az.bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.az.bean.model.Person;

@Configuration
public class AppConfig {
	@Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
	public Person person() {
		
		Person person = new Person("Taleh", "Zeynalli");
		
		return person;
	}

}
