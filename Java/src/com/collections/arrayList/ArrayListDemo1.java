package com.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("raj");
		list.add("amit");
		list.add("parth");
		
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
//		for(String s:list) {
//			
//			System.out.println(s);
//		}
		
		
	}
}
