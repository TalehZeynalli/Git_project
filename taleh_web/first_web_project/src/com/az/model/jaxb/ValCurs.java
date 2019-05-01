package com.az.model.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="ValCurs")
public class ValCurs {
	private String date;
	private String name;
	private	String description;
	private List<ValType> valType;
	
	public String getDate() {
		return date;
	}
	@XmlAttribute(name="Date")
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	@XmlAttribute(name="Name")
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	@XmlAttribute(name="Description")
	public void setDescription(String description) {
		this.description = description;
	}
	public List<ValType> getValType() {
		return valType;
	}
	@XmlElement(name="ValType")
	public void setValType(List<ValType> valType) {
		this.valType = valType;
	}

}
