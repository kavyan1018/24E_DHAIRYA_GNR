package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Student implements Serializable {

	int id;
	String name;
	Date bd;

	public Student(int id, String name, Date bd) {

		this.id = id;
		this.name = name;
		this.bd = bd;
	}

}

public class SerilizeDemo {

	// platform independent !!
	// system -->samir --> henish -> deserilize....

	public static void main(String[] args) {

		Student student1 = new Student(101, "raj", new Date());
		Student student2 = new Student(102, "parth", new Date());
		Student student3 = new Student(103, "amit", new Date());

		Student students[] = new Student[3];

		students[0] = student1;
		students[1] = student2;
		students[2] = student3;

		// serilize...
		try {
			ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("student.ser"));
			// obj.writeObject(student);
			obj.writeObject(students); // storing array of students
			obj.close();
			System.out.println("serilized done !!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
