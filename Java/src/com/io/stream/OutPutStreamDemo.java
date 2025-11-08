package com.io.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutPutStreamDemo {

	public static void main(String[] args) {

		String data = "raj";
		byte b[] = data.getBytes();
		try {
			OutputStream out = new FileOutputStream(new File("xyz.txt"));
			out.write(b);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
