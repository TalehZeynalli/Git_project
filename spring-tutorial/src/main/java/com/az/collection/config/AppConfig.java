package com.az.collection.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.az.collection.model.DbUtil;

@Configuration
public class AppConfig {
	@Bean
	public DbUtil dbUtil() {
		
		DbUtil dbUtil = new DbUtil();
		       dbUtil.setUsername("Taleh");
		       dbUtil.setPassword("1234");
		       
		       List<String> list = Arrays.asList("min 5connection", "max 10 connection");
		       dbUtil.setList(list);

		       Map<String, String> map = new HashMap<String, String>();
		                           map.put("Min connection", "5");
		                           map.put("Max Connection", "10");
		                           dbUtil.setMap(map);
		                           
		       Properties properties = new Properties();
		                  properties.setProperty("user", "root");
		                  dbUtil.setProperties(properties);
		                  
		                  return dbUtil;
		                           
		                           
		       
		
	}

	
}
