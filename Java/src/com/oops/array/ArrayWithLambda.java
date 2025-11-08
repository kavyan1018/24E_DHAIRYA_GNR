package com.oops.array;

interface Collect {

	public abstract String[] collecting(String str);

}

public class ArrayWithLambda {

	public static void main(String[] args) {

		Collect c = (str) -> {

			String ss[] = new String[5];
			ss[0]="java";
			ss[1]="node";
			ss[2]="c++";
			ss[3]="c";
			ss[4]="python";
					
			//return str.split(" ");
			return ss;
		};
		String s[] = c.collecting("hello this is java not cup of tea");
		for(String i:s) {
			
			System.out.println(i);
		}

	}
}
