package com.rays.oops;

public class Circle extends Shape{
	
	private double radius;
	private static final double PI=3.14;
	private double area;
	
	public void setRadius(double radius) {
		this.radius=radius;
		
	}
	public double getRadius() {
		return radius;
		
	}
	public double area() {
		area=PI*(radius*radius);
		return area;
			}

	
	
	
	
	
}
