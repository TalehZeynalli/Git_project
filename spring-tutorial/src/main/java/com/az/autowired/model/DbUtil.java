package com.az.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DbUtil {

	@Autowired
	@Qualifier(value = "db2")
	private Database database;
	
	public void dbInfo() {
		
		System.out.println("Url:" + this.database.getUrl());
		System.out.println("User:" + this.database.getUser());
		System.out.println("Password:"+ this.database.getPassword());
	}
}
