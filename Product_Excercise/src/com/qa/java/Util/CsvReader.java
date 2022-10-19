package com.qa.java.Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ReadPendingException;
import java.util.ArrayList;
import com.qa.java.Bean.Product;


public class CsvReader {
	
	
	public ArrayList<Product> readProduct() {
		
		ArrayList<Product> productlist = new ArrayList<>();
		final String PATH = "C://fish.csv";
			

		try (BufferedReader br = new BufferedReader(new FileReader(new File(PATH)))) {
			String prodData = br.readLine();
			prodData = br.readLine();

			while (prodData != null) {

				String[] prodInfoList = prodData.split(",");
				String name = prodInfoList[0];
				float price = Float.parseFloat(prodInfoList[1]);
				int stock = Integer.parseInt(prodInfoList[2]);
				boolean availability = Boolean.parseBoolean(prodInfoList[3]);

				Product product = new Product();
				product.setName(name)
				.setPrice(price)
				.setStock(stock)
				.setAvailable(availability);

				productlist.add(product);
				prodData = br.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

		return productlist;
	}
}
