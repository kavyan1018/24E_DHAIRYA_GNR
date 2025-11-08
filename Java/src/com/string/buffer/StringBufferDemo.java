package com.string.buffer;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		System.out.println(sb);
		
		sb.append("-python");
		System.out.println(sb);
		//sb.reverse();
		System.out.println(sb);
		System.out.println(sb.capacity());
		String ss = sb.substring(0, 5);
		System.out.println(ss);
		System.out.println(sb.substring(0,5));
		
		sb.delete(1, 5);
		System.out.println(sb);
		sb.replace(0,5, "#");
		System.out.println(sb);
		sb.insert(0, "A");
		System.out.println(sb);
		
		StringBuilder s1 = new StringBuilder();
		//String buffer class is thread safe class
		//non thread safe
		
	}
}
