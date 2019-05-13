package com.az.model;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{
	
     /**
	 * 
	 */
	private static final long serialVersionUID = -4273922672025340169L;
	
	 private String name;
     private String surname;
     private int age;
     private List <String> friendList;
     
	public Person() {
		super();
	}
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getFriendlist() {
		return friendList;
	}
	public void setFriendlist(List<String> friendlist) {
		this.friendList = friendlist;
	}
     
     
      
}
