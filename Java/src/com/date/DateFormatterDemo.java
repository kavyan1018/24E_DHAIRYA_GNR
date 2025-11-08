package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterDemo {

	// SimpleDateFormate java.text
	
	public static void main(String[] args) {
		
		
		Date date = new Date(); //current Date..
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");
		//SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy");
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd-MM-yyyy hh:mm:ss zzzz a EEEE G D F X");
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
	}
}
