package methodoverriding;

public abstract class  AbstractTest {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();

		Rectangle r = (Rectangle) s[0];

		r.setLength(10);
		r.setWidth(20);

		System.out.println(s[0].area());
		
		Circle c = (Circle) s[1];
		c.setRadius(5);

		Triangle t = (Triangle) s[2];
		t.setBase(10);
		t.setHeight(2);    

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea += s[i].area();

		}

		System.out.println("Total Area = " + totalArea);

	}
	
	
}
