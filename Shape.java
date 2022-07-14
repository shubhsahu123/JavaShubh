package com.rays.oops;

import java.io.ObjectInputStream.GetField;

public class Shape {

	private String color;
	private int borderWidth;
	private double area;

	public Shape() {

	}

	public Shape(String color, int borderWidth) {

		this.color = color;
		this.borderWidth = borderWidth;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;

	}

	public void setBorderWidth(int bw) {
		this.borderWidth = bw;

	}

	public int getBorderWidth() {
		return borderWidth;

	}

	public void setArea(double area) {
		this.area = area;

	}

	public double getArea() {
		return area;
	}

	

}
