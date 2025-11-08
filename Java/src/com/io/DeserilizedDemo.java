package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizedDemo {

	// Object class --> java most parent class
	// float --12.22
	// int x = (int) f;

	public static void main(String[] args) {

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.ser"));
			Student st = (Student) input.readObject();
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println(st.bd);
			input.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
