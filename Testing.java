package com.rays.basics;

public class Testing {
	public static void main(String[] args) {
		
		TestExcercise t=new TestExcercise();
		t.setBorderWidth(15);
		t.setColour("red");
		
		System.out.println(t.getBorderWidth()+ "    hello    "+t.getcolour());
	}
}
