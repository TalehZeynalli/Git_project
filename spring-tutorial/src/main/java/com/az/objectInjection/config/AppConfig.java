package com.az.objectInjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.az.objectInjection.model.Database;
import com.az.objectInjection.model.DbUtil;

@Configuration
public class AppConfig {
	@Bean
	public DbUtil dbUtil() {
		Database database = new Database("mysql", "Taleh", "1234");
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.setDatabase(database);
		
		return dbUtil;
		
	}

}
