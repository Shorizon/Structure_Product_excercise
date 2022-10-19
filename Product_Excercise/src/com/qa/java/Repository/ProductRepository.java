package com.qa.java.Repository;
import com.qa.java.Util.CsvReader;
import java.util.ArrayList;
import com.qa.java.Bean.Product;

public class ProductRepository {

	ArrayList<Product> prodList;

	public ProductRepository() {
		CsvReader csvReader = new CsvReader();
		this.prodList = csvReader.readProduct();
	}

	public ArrayList<Product> getProdList(){
		return prodList;
	}

	
}
