package com.io.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		FileReader reader;
		String data = "";
		try {
			reader = new FileReader("C:\\Users\\Samir\\Desktop\\ms.txt");
			BufferedReader br = new BufferedReader(reader);
			// br.read();
//			String data =  br.readLine();
//			System.out.println(data);

			long startTime = System.nanoTime();
			while ((data = br.readLine()) != null) {

				System.out.println(data);
			}
			long endTime = System.nanoTime();

			System.out.println("total time = " + (endTime - startTime) / 1000000000);
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
