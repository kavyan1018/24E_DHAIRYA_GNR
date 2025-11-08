package com.collections.set;

import java.util.TreeSet;

class Demo {

	int id;

	public Demo(int id) {
		
		this.id = id;
	}

}

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<Demo> ts = new TreeSet<Demo>();
		ts.add(new Demo(10));
	}
}
