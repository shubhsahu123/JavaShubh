package com.rays.oop2;

public class Rectangle extends Shape{

	private double length;
	private double width;
	public double area;
	
	
	public Rectangle() {
		
	}
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
		System.out.println(length);
		System.out.println(width);
	}
	
	public void Area() {
		System.out.println(area=length*width);
	}
	
	
}
