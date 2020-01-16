package com.az.propertySource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.az.propertySource.model.Database;

@Configuration
@PropertySource("db.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;

	@Bean
	public Database database() {

		String url = environment.getProperty("url");
		String user = environment.getProperty("user");
		String password = environment.getProperty("password");
		
		Database database = new Database(url, user, password);
		

		return database;

	}

}
