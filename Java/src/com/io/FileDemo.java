package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	// java.io.*
	// reltive path
	// absolute path
	public static void main(String[] args) {

		File file = new File("./src/com/io/demo.txt");
		try {
			boolean flag = file.createNewFile();
			System.out.println(flag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
