package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//red black tree
		Set<String> set = new TreeSet<String>();
		set.add("raj");
		set.add("amit");
		set.add("neha");
		set.add("parth");
		set.add("priya");
		set.add("neha");
//		set.add(null);

		boolean isRemoved = set.remove("nehaa");
		System.out.println("removed? " + isRemoved);

		// set.clear();
		// System.out.println(set.isEmpty());

		System.out.println("contains..." + set.contains("amit"));

		for (String s : set) {

			System.out.println(s);
		}

	}
}
