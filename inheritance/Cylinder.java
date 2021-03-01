
public class Cylinder extends Circle {
	private int height;

	public Cylinder() {
		this.height = 1;
	}

	public Cylinder(int x, int y, int r, int h) {
		super(x, y, r);
		setHeight(h);
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public int getHeight() {
		return height;
	}

	public void set(int x, int y, int r, int h) // OVERLOADING DUE TO DIFFERENT SIGNATURE
	{
		super.set(x, y, r);
		setHeight(h);
	}

	public double lateralSurface() {
		return super.perimeter() * this.height;
	}

	public double surfaceArea() {
		return 2 * super.area() + this.lateralSurface();
	}

	public double volume() {
		return super.area() * this.height;
	}

	public String toString() {
		return super.toString() + "\nlateral surface = " + this.lateralSurface() + "\nsurface area = "
				+ this.surfaceArea() + "\nvolume = " + this.volume();
	}

	public boolean equal(Object cy) {
		Cylinder cylinder2 = (Cylinder) cy; // casting
		return super.equals(cy) && this.height == cylinder2.height;
	}
}
