package com.az.bean.model;

public class Person {
	
	private String name;
	
	private String surname;

	public Person() {
		
	}
	
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	
	public void initMethod() {
		System.out.println("init method isledi");
	}
	public void destroyMethod() {
		System.out.println("destrtoy method isledi.");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + "]";
	} 
	

}
