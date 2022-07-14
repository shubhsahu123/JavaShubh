package com.rays.oops;

public class TestShape {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.setColor("red");
		System.out.println("colour of the circle will be   " + c.getColor());
		c.setBorderWidth(15);
		System.out.println("Border of the circle will be   " + c.getBorderWidth());

		c.setRadius(5);
		System.out.println("radius is===" + c.getRadius());

		System.out.println("area of the circle will be" + c.area());
		System.out.println(" -------------------------------------------------");

		Reectangle r = new Reectangle();
		r.setColor("blue");
		System.out.println("colour of reectangle will be   " + c.getColor());
		r.setBorderWidth(5);
		System.out.println("Border of the circle will be " + c.getBorderWidth());

		r.setLength(5);
		System.out.println("length of the rectangle" + r.getLength());

		r.setWidth(10);
		System.out.println("width of the rectangle " + r.getWidth());

		r.area();
		System.out.println("area of rectangle  " + r.area());

		System.out.println("-----------------------------------------------------------");

		Triangle t = new Triangle();
		t.setColor("blue");
		System.out.println("colour of triangle will be   " + c.getColor());
		t.setBorderWidth(5);
		System.out.println("Border of the Triangle will be " + c.getBorderWidth());

		t.setBase(5);
		System.out.println("base of the Trainagle" + t.getBase());

		t.setHeight(10);
		System.out.println("Height  of the Triangle " + t.getHeight());

		t.area();
		System.out.println("area of Triangle  " + t.area());

		Shape s = new Shape();
		Shape s1 = new Shape("Red", 10);
		System.out.println(s1.getColor());

	}
}
