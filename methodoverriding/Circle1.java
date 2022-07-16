package methodoverriding;

public class Circle1 extends Shape1{
	public static final double PI = 3.14;
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
