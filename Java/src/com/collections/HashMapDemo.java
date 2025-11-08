package com.collections;

import java.util.HashMap;
import java.util.Map;

class Books{
	
	int bId;
	String bName;
	public Books(int bId, String bName) {
		
		this.bId = bId;
		this.bName = bName;
	}
	
			
	
	
	
	
}
public class HashMapDemo {

	
	public static void main(String[] args) {
		
		
		
		HashMap<String, Books> bookMap = new HashMap<String, Books>();
		Books b1 = new Books(101, "ramayana");
		bookMap.put("ram",b1);
		bookMap.put("krishna", new Books(102, "mahabharat"));
		
		
		for(Map.Entry m:bookMap.entrySet()) {
			
			//System.out.println(m.getKey() + " -"+m.getValue());
			Books books = (Books) m.getValue();
			System.out.println(m.getKey() + " -"+books.bId + " - "+books.bName );
		}
		
		
		
		
	}
}
