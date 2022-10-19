package com.qa.java.Bean;
import java.io.Serializable;

public class Product implements Serializable {

	private String name;
	private float price;
	private int stock;
	private boolean available;


	public String getName() {
		return name;
	}

	public Product setName(String name) {
		if (name == null)
			this.name = "";
		this.name = name;
		return this;
	}


	public float getPrice() {
		return price;
	}


	public Product setPrice(float price) {
		this.price = price;
		return this;
	}

	public int getStock() {
		return stock;
	}

	public Product setStock(int stock) {
		this.stock = stock;
		return this;
	}

	public boolean isAvailable() {
		return available;
	}


	public Product setAvailable(boolean available) {
		this.available = available;
		return this;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + ", available=" + available + "]";
	}





}
