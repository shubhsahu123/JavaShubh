package com.rays.basics;

import java.text.ParseException;

public class TestPerson {
public static void main(String[] args) throws ParseException {
	
	Person p=new Person();
	
	p.setName("shubham sahu");
	p.setAdress("kalani nagar");
	p.setDate("05/10/1997");
	p.setAge(25);

	System.out.println(p.getName());
	
	System.out.println(p.getAddress());
	System.out.println(p.getDate());
	System.out.println(p.getAge());
	
	
}
	
	
}
