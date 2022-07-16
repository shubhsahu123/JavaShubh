package methodoverriding;

public class Circle extends Shape {

	public static final double PI = 3.14;
	private int radius;
	private double area;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		return PI * radius * radius;

	}
}
