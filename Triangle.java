package com.rays.oops;

public class Triangle extends Shape{
private int base;
private int height;
private double area;

	
	
	public void setBase(int base) {
		this.base=base;
		
	}
	public int getBase() {
		return base;		
	}
	public void setHeight(int height) {
		this.height=height;
		
	}
	public int getHeight() {
		return height;
		
	}
	public double area() {
		area=(base*height)/2;
		return area;
	}
	
}
