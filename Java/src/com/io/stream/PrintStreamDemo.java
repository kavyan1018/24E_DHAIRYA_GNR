package com.io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {

		try {
			PrintStream out = new PrintStream(new File("java.txt"));
			out.print("hi this is java");
			out.println();
			out.print("hi this is java 1");
			out.append("hi this line needs to be append..");
			out.flush();
			// out.write(b);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
