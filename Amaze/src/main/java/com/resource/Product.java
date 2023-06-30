package com.resource;

public class Product {
	Integer product_id;
	String caption;
	double price;
	String img_path;
	String description;
	
	public Product(String caption, double price, String img_path, String description) {
		super();
		this.caption = caption;
		this.price = price;
		this.img_path = img_path;
		this.description = description;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
