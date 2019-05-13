package com.az.model;

import java.math.BigDecimal;

public class Product {

	private String id;
	private String name;
	private String imagePath;
	private BigDecimal price;
	private Category category;
	private Brand brand;

	public Product() {

	}

	public Product(String id, String name, String imagePath, BigDecimal price, Category category, Brand brand) {
		super();
		this.id = id;
		this.name = name;
		this.imagePath = imagePath;
		this.price = price;
		this.category = category;
		this.brand = brand;
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

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
