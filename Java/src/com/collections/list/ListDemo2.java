package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {

		List<String> class1 = new ArrayList<String>();
		class1.add("ram");
		class1.add("sita");
		class1.add("ram");
		class1.add("lakshman");
		class1.add(2, "hanuman");

		List<String> class2 = new ArrayList<String>();
		class2.add("krishna");
		class2.add("arjun");
		class2.add("bhim");

		List<String> classes = new ArrayList<String>();
		System.out.println(class1);
		System.out.println(class2);
		classes.addAll(class1);
		classes.addAll(class2);

		System.out.println(classes);

		System.out.println(class1.contains("sita"));
		// class1.clear();
		System.out.println(class1.isEmpty());

		int ind = class1.indexOf("ram");
		System.out.println("index = " + ind);

		int ind1 = class1.lastIndexOf("ram");
		System.out.println("last indexof" + ind1);

		// Object o [] = class1.toArray();

		List<String> subList = class1.subList(1, 3);
		System.out.println(subList);

	}
}
