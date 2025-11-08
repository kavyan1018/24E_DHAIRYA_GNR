package com.date;

import java.util.Date;

//java.util.Date
//Calander --> 7 
//DateAndTime ---> 8
//mill seconds -->
//1970 
//UTC --> 5 30 -->
//enter your birth year 2000
//month 12
//date. 17
// AGE -->
public class DateDemo1 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		System.out.println("Date.." + date.getDate());
		System.out.println("time..." + date.getTime());
		System.out.println("hours" + date.getHours());
		System.out.println("min" + date.getMinutes());
		System.out.println("month" + date.getMonth());
		System.out.println("sec.." + date.getSeconds());
		System.out.println("year.." + date.getYear());

		Date date2 = new Date();
		date2.setDate(14);
		date2.setMonth(1);
		date2.setYear(95);
		date2.setHours(2);
		date.setSeconds(0);
		
		System.out.println(date2);
		
		System.out.println(date.after(date2));
		System.out.println(date2.before(date));
		

	}
}
