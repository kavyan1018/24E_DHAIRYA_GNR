package com.collections.set;

import java.util.HashSet;

class Books {

	int bId;
	String bName;
	float bPrice;

	public Books(int bId, String bName, float bPrice) {
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
	}

}

public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Books> bookset = new HashSet<Books>();
		bookset.add(new Books(101, "java", 1200.56f));
		
		
		for(Books b:bookset) {
			
			System.out.println(b.bId);
		}
		
		
	}
}
