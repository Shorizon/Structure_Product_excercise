package com.qa.java.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.qa.java.Bean.Product;
import com.qa.java.Repository.ProductRepository;

public class ProductService {

	ProductRepository productRepository;



	public ProductService() {
		this.productRepository = new ProductRepository();
	}

	public List<Product> getProducts(){
		return this.productRepository.getProdList();
	}

	public Product prodMaxPrice(){
		return (getProducts().stream()
							   .max(Comparator.comparing(Product::getPrice))
							   .get());
	}
	public Product prodMinStock() {
		return (getProducts().stream()
							   .min(Comparator.comparing(Product::getStock))
							   .get());
	}
	public List<Product> prodInStock(){
		return (getProducts().stream()
							 .filter((item) -> item.getStock() > 0))
							 .collect(Collectors.toList());
	}


}
