package com.az.objectInjection.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.az.objectInjection.config.AppConfig;
import com.az.objectInjection.model.DbUtil;

public class Test {
	
	public static void main(String[] args) {
		  
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DbUtil dbUtil = applicationContext.getBean(DbUtil.class);
		
		dbUtil.openConnection();
		
		dbUtil.closeConnection();
		
		applicationContext.close();
	}

}
