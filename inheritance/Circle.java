
public class Circle extends Point {
	private int radius;

	public Circle() // default constructor
	{
		radius = 1;
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		setRadius(r);
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public void set(int x, int y, int r) {
		super.set(x, y);
		setRadius(r);
	}

	public String toString() {
		// [x,y]
		// radius
		// area
		// perimeter

		return super.toString() + "\n" + "radius = " + this.radius + "\n" + "area = " + this.area() + "\n"
				+ "perimeter = " + this.perimeter();
	}

	public boolean equals(Object Circle2) {
		Circle c2 = (Circle) Circle2;
		return super.equals(Circle2) && this.radius == c2.radius;
	}
}
