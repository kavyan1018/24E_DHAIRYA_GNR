package com.collections.list;

import java.util.ArrayList;
import java.util.List;

//list is dynamic size is not fixed.
//list allows hetrogenious eleme...
//list allows duplicate valued..
//list is iterable...
//list is subscritable 
public class ListDemo1 {

	public static void main(String[] args) {

		// polymorephic object
		// ref list
		// memory ArrayList
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(30);
		list.add(40);
		list.add(90);
		list.add(89);

		System.out.println(list);

		// System.out.println(list[0]);error..

//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//
//		}

//		int removedElm = list.remove(1);
//		System.out.println("removing..." + removedElm);
//		
		boolean flag = list.remove(new Integer(900));
		System.out.println(flag);

		for (int i : list) {
			System.out.println(i);
		}

	}

}
