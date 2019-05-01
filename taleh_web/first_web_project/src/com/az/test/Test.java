package com.az.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import com.az.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	public static void main(String[] args) throws IOException, JAXBException {
	
		Person person = new Person("Taleh","Zeynalli", 23);
		List<String> friendList= new ArrayList<String>();
		 
      ObjectMapper objm=new ObjectMapper();
     objm.writerWithDefaultPrettyPrinter().writeValue(new File("E:\\person2.json"), person);
 
	
	}
}
	

	
	


