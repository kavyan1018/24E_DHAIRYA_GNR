package com.collections.linkdlist;

import java.util.LinkedList;

public class LinkListDemo1 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("raj");
		list.add("parth");
		list.add(1,"amit");
		list.addFirst("kunal");
		list.addLast("kirti");
		list.add("parth");
		list.add("ajay");
		
		
//		list.removeFirst();
//		list.removeLast();
		
		
//		System.out.println("peek.."+list.peek()); //null
//		System.out.println("poll  "+list.poll());
//		
//		System.out.println("elm  "+list.element());//exp
//		System.out.println("pop"+list.pop());
	
		
		//list.removeLastOccurrence("parth");
		//list.get(0); oth index
		
//		list.getFirst();
//		list.getLast();
		
		
		//list.offer("x");
		
		
		
		
		for(String s:list) {
			
			System.out.println(s);
		}
	}
}
