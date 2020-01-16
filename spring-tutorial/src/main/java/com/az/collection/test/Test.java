package com.az.collection.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.az.collection.config.AppConfig;
import com.az.collection.model.DbUtil;

public class Test {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DbUtil dbUtil = applicationContext.getBean(DbUtil.class);
		
		dbUtil.openConeection();
		
		dbUtil.closeConnection();
	}

}
