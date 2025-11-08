package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizeArray {

	public static void main(String[] args) {

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.ser"));

			Student[] students = (Student[]) input.readObject();
			for(Student s:students) {
				
				System.out.println(s.id);
				System.out.println(s.name);
				System.out.println(s.bd);
			}
			
			 

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
