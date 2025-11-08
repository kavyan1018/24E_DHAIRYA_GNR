package com.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {

		try {
			
			FileReader reader = new FileReader("C:\\Users\\Samir\\Desktop\\dictonry");
			int c = 0;
//			int c = reader.read();
//			System.out.println((char)c);
			long startTime = System.nanoTime();
			while ((c = reader.read()) != -1) {

				System.out.print((char) c);
			}
			
			long endTime = System.nanoTime();
			
			long totaltime = endTime-startTime;
			System.out.println("total time = "+ totaltime/1000000000);

			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
