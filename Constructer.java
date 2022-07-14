package com.rays.oops;

public class Constructer {
	private String color;
	private int borderWithd;
	public  Constructer(String c, int b) {
		color=c;
		borderWithd=b;
		System.out.println(color+borderWithd);
		
	}public static void main(String[] args) {
		
		Constructer c=new Constructer("shubham", 15);
		System.out.println(c);
	}

}
