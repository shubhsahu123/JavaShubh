package methodoverriding;

public abstract class Shape1 {

	private String color;
	private int borderWidth;

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

	public abstract double area() ;
		

	
}
