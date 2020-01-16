package com.example.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
	

public Person(){
		
	}
	
	public Person(String id,String name,String surname){
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	private String id;
	private String name;
	private String surname;
	
	




}
