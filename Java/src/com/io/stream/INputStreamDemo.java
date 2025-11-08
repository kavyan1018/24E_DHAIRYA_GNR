package com.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class INputStreamDemo {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream(new File("abc.txt"));
//			int c = in.read();
//			System.out.println(c);

			// int c = in.read(new byte[65]);
			// System.out.println((char)c);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
