package com.qa.java.Main;
import java.util.ArrayList;
import com.qa.java.Bean.Product;
import com.qa.java.Services.ProductService;


public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		ArrayList<Product> products = (ArrayList<Product>) productService.getProducts();
		
		
		System.out.println(productService.prodMaxPrice());
		System.out.println(productService.prodMinStock());
		System.out.print(productService.prodInStock());
		
		
		
		
	}
}
