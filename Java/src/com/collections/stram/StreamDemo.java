package com.collections.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("raj");
		list.add("parth");
		list.add("neha");
		list.add("sharma");
		list.add("rohit");
		list.add("virat");
		
//		for(String s:list) {
//			System.out.println(s.toUpperCase());
//		}
		
		
		//list.stream().forEach(x->System.out.println(x.toUpperCase()));
//		list.stream().map(x->x.toUpperCase());
		
//		List<String> newlist = new ArrayList<String>();
//		for(String s:list) {
//			
//			newlist.add(s.toUpperCase());
//		}
		
		
		List<String> upperList = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperList);
		
		
		
		
		
//		Stream<Integer> stream = Stream.of(100,20,30,50,60);
//		
//		stream.forEach(x->System.out.println(x));
		
		
		
	}
}
