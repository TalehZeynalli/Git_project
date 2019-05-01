package com.az.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Brandcopy {

	private String id;
	private String name;

	public Brandcopy() {
     super();
	}




	public String getId() {
		return id;
	}
	@XmlElement
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Brandcopy [id=" + id + ", name=" + name + "]";
	}

}
