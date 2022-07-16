package methodoverriding;

public class Shape {

	private String color;
	private int borderWidth;

	public Shape() {

	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public double area() {
		return 0;

	}

}
