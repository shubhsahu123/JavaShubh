package methodoverriding;

public class Triangle1 extends Shape1{
	private int base;
	private int height;
	private double area;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double area() {
		return (base * height) / 2;
	}


}
