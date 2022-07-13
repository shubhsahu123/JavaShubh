package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	private int age;
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	public void setName(String name) {
		this.name=name;
			}
	public String getName() {
		return name;		
	}
	
	public void setAdress(String address) {
		this.address=address;
		}
	public String getAddress(){
		return address;
		
	}
	
	public void setDate(String dob) throws ParseException {
		this.dob=sdf.parse(dob);
		
	}
	public String getDate() {	
		return sdf.format(dob);
		
		
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge(){
		return age;
	
		
	}
	
	
	
		
	
	
}
