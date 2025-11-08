package com.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(122);
		ts.add(32);
		ts.add(12);
		ts.add(42);
		ts.add(90);
		ts.add(76);
		ts.add(54);

		System.out.println(ts.first());
		System.out.println(ts.last());

//		System.out.println("poll.."+ts.pollFirst());
//		System.out.println("poll.."+ts.pollLast());
//		
		// SortedSet<Integer> ss = ts.tailSet(30);
		// System.out.println("ss"+ss);
//		SortedSet<Integer>ss = ts.headSet(90, true);
		// System.out.println("ss.."+ss);

		// SortedSet<Integer>ss = ts.subSet(7, 90);
		//SortedSet<Integer> ss = ts.subSet(7, true, 90, true);
		//System.out.println("ss.." + ss);
		
		System.out.println("celing..."+ts.ceiling(91));
		System.out.println("floor..."+ts.floor(76));
		
		System.out.println("higher.."+ts.higher(121));
		System.out.println("higher.."+ts.lower(40));
		

		System.out.println(ts);

	}
}
