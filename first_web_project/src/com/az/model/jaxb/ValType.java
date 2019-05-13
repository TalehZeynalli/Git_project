package com.az.model.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ValType {
	
	private String type;
	private List<Valute> valute;

	public String getType() {
		return type;
	}
	@XmlAttribute(name="Type")	
	public void setType(String type) {
		this.type = type;
	}

	public List<Valute> getValute() {
		return valute;
	}
	@XmlElement(name="Valute")
	public void setValute(List<Valute> valute) {
		this.valute = valute;
	}

}
