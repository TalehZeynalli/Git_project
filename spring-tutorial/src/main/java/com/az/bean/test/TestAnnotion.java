package com.az.bean.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.az.bean.config.AppConfig;
import com.az.bean.model.Person;

public class TestAnnotion {
	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		Person person = applicationContext.getBean(Person.class);

		System.out.println(person);

		applicationContext.close();

	}
}
