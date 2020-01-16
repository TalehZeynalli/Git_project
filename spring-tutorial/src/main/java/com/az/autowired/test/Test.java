package com.az.autowired.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.az.autowired.config.AppConfig;
import com.az.autowired.model.DbUtil;

public class Test {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		DbUtil dbUtil = applicationContext.getBean(DbUtil.class);
		
		dbUtil.dbInfo();
		
		
	}
}
