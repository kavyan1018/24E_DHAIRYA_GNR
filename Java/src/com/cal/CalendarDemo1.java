package com.cal;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {

	public static void main(String[] args) {

		// new key word //error
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println("YEAR..." + c.get(Calendar.YEAR));
		System.out.println("MONTH.." + c.get(Calendar.MONTH));
		System.out.println("HOURS" + c.get(Calendar.HOUR));
		System.out.println("MINs" + c.get(Calendar.MINUTE));
		System.out.println("MILS" + c.get(Calendar.MILLISECOND));

		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));// day starts with SUNDAY
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.ZONE_OFFSET));

//		System.out.println("jan..."+c.get(Calendar.JANUARY));
//		System.out.println("feb.."+c.get(Calendar.FEBRUARY));
//		System.out.println(c.get(Calendar.SUNDAY));

		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.MONTH, 1);
		System.out.println("month =" + c2.get(Calendar.MONTH));

		c.set(2022, 11, 31);
		Date date = c.getTime();
		System.out.println(date);

	}

}
