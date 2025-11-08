package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TReeMapDemo {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("ram", 2022);
		map.put("amit", 2023);
		map.put("jay", 2024);
		map.put("parth", 2021);
		map.put("krish", 2022);
		
		//System.out.println(map.ceilingKey("pankti"));
		//map.ceilingEntry("parth");
		map.containsKey("ram");
		map.containsValue(2021);
		//map.descendingKeySet();
		//map.headMap("");
		//map.tailMap("")
		//map.subMap(fromKey, toKey)
		//System.out.println(map.firstKey());
		//map.lastKey();
		
		System.out.println(map.lastEntry());
		System.out.println(map.firstEntry());
		
		//map.pollFirstEntry();
		//map.pollLastEntry();
		
		System.out.println("get"+map.get("ram"));
		
		
		
		
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey() + " "+m.getValue());
		}
		

	}
}
