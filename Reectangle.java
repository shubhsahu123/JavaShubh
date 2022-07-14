package com.rays.oops;

public class Reectangle extends Shape{
private int length;
private int width;
private double area;


	
	
	public void setLength(int length) {
		this.length=length;
		
	}
	public int getLength() {
		return length;
		
	}

	public void setWidth(int width) {
		this.width=width;
		
	}
	public int getWidth() {
		return width;
		}
	
	public double area() {
		area=length*width;
		return area;
		
	}
	
}
