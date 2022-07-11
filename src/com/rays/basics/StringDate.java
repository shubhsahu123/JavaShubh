package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringDate {
	public static void main(String[] args) throws ParseException {
		
		String s="05/10/1997";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Date today =sdf.parse(s);
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(today);
		cal.add(Calendar.DATE, 30);
		Date d=new Date();
		System.out.println(d);
		
		int cy=d.getYear();
		System.out.println(cy);
		
		Date yes=cal.getTime();
		
		System.out.println(yes);
		
		
		
	}

}
