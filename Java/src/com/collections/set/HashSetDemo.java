package com.collections.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("java");
		hs.add("python");
		hs.add("php");
		hs.add("cpp");
		hs.add("node");

		System.out.println(hs);

	}

}
