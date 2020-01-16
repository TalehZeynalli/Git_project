package com.az.autowired.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.az.autowired.model.Database;
import com.az.autowired.model.DbUtil;

@Configuration
@ComponentScan(basePackageClasses = DbUtil.class)
public class AppConfig {

	@Bean(name = "db1")
	public Database database() {
		
		Database database = new Database("mysql:localhost:8080", "Taleh", "1234");
		
		return database;
	}
	
	@Bean(name = "db2")
	public Database database2() {
		
		Database database = new Database("oracle:8080", "Taleh", "1234");
		
		return database;
	}
	
	
}
