package com.az.model;

import java.util.List;

public class Brand {

	private String id;
	private String name;
	private List<Product> listProduct;

	public Brand() {

	}

	public Brand(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
