package com.az.model.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Valute {
	
	private String code;
	private String nominal;
	private String name;
	private String value;
	 
	 public String getCode() {
		return code;
	}
	 @XmlAttribute(name="Code")
	public void setCode(String code) {
		this.code = code;
	}

	
	public String getNominal() {
		return nominal;
	}
	@XmlElement(name="Nominal")
	public void setNominal(String nominal) {
		this.nominal = nominal;
	}
	public String getName() {
		return name;
	}
	
	@XmlElement(name="Name")
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	@XmlElement(name="Value")
	public void setValue(String value) {
		this.value = value;
	}
	

}
