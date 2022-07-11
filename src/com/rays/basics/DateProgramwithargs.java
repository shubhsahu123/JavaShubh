package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateProgramwithargs {
public static void main(String[] args) throws ParseException {
	
	String d1=args[0];
	String d2=args[1];
	
	System.out.println(d1+"    "+d2);
	SimpleDateFormat date= new SimpleDateFormat("dd/MM/yyyy");
	
	Date date1= date.parse(d1);
	Date date2=date.parse(d2);
	
	System.out.println(date1+" &  "+date2);
	
	
	
}
	
	
}
