package com.collections.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("raj");
		list.add("parth");
		list.add("neha");
		list.add("akshit");
		list.add("sharma");
		list.add("rohit");
		list.add("virat");
		
//		
//		for(String s:list) {
//			
//			if(s.length()>4) {
//				System.out.println(s);
//			}
//		}
		
		//list.stream().filter(x->x.length()>4).forEach(x->System.out.println(x));
		
		//list.stream().filter(x->x.startsWith("a")).forEach(x->System.out.println(x));
		//list.stream().filter(x->x.startsWith("a")).map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		Set<String> set  = list.stream().filter(x->x.startsWith("a")).collect(Collectors.toSet());
		System.out.println(set);
		
		
		
		
	}
}
