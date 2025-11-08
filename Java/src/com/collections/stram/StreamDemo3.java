package com.collections.stram;

import java.util.ArrayList;
import java.util.List;

class Product {

	int pId;
	String pName;
	String pColor;
	int pPrice;

	public Product(int pId, String pName, String pColor, int pPrice) {

		this.pId = pId;
		this.pName = pName;
		this.pColor = pColor;
		this.pPrice = pPrice;
	}

}

public class StreamDemo3 {

	public static void main(String[] args) {

		
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "iphone", "blue", 120000));
		products.add(new Product(102, "ipad", "silver", 10000));
		products.add(new Product(103, "laptop", "blue", 220000));
		products.add(new Product(104, "charger", "black", 1000));
		
		
		products.stream().filter(x->x.pPrice>100000).forEach(x->System.out.println(x.pId + " "+x.pName));
		products.stream().filter(x->x.pColor=="blue").forEach(x->System.out.println(x.pName));
		
		
		
	}
}
