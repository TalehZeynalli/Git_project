package com.az.propertySourcee;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.az.propertySource.config.AppConfig;
import com.az.propertySource.model.Database;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Database database = applicationContext.getBean(Database.class);
		
		System.out.println(database);
		
		applicationContext.close();
		
	}
}
