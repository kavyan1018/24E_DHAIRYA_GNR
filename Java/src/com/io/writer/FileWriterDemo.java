package com.io.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {

		File file = new File("abc.txt");
		try {
			// FileWriter writer = new FileWriter(file,true);
			FileWriter writer = new FileWriter("abc.txt",true); // w a
			writer.write("Hello this is my first file to write Data !!");
			writer.close();
			System.out.println("Data has been write successfully..");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
