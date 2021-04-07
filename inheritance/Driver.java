package inheritance;

public class Driver {

	public static void main1(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(50, 80);
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(150, 180, 20, 50);
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		System.out.println("==========================");

		System.out.println(c1 + "\n");
		System.out.println(c2);

		System.out.println((c1.equals(c2)) ? "\nEquals Circles" : "\nNot Equals Circles");
		System.out.println("==========================");

		System.out.println(cy1 + "\n");
		System.out.println(cy2);

		System.out.println((cy1.equal(cy2)) ? "\nEquals Cylinders" : "\nNot Equals Cylinders");
		System.out.println("==========================");

	}

	public static void main(String s[]) {
		Point p1 = new Point();
		Circle c1 = new Circle();
		Cylinder cy1 = new Cylinder();

		// Polymorphysm
		print(p1);
		print(c1);
		print(cy1);
	}

	public static void print(Point p) {
		System.out.println(p);
	}
}
