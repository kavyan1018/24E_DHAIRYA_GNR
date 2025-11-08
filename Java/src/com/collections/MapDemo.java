package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//map interface...
//TreeMap
//HashMap
//map does not allow duplicate key
///map does not allo null key
public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(120, "java");
		map.put(120, "JAVA");
		map.put(10, "Python");
		map.put(70, "Node");
		// map.put(null, "ok");
		map.putIfAbsent(70, "NODE");
		// Entry Interfac
		// inner interface

		// Entry
		// map.isEmpty();
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
//		String removedValue = map.remove(71);
//		System.out.println("removing..."+removedValue);
//		
		// map.remove(70, "Node1");

		map.replace(70, "Node", "NODE");
		// map.replace(key, value)

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}

	}
}
