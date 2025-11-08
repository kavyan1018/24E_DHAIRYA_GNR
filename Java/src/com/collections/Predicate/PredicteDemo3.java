package com.collections.Predicate;

import java.util.function.Predicate;

class Books {

	int bId;
	String bName;
	int bPrice;

	public Books(int bId, String bName, int bPrice) {

		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
	}

}

public class PredicteDemo3 {

	public static void main(String[] args) {

		Predicate<Books> predicate = x -> x.bPrice < 100;
		Books b1 = new Books(101, "ramayana", 99);
		System.out.println(predicate.test(b1));
		

	}
}
