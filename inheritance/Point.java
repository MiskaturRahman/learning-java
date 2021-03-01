
public class Point 
{
	private int x;
	private int y;
	public Point() //default constructor
	{
		x = y = 0;
	}
	public Point(int x, int y)
	{
		set(x,y);
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y  = y;
	}
	public void set(int x, int y)
	{
		setX(x);
		setY(y);
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public String toString()
	{
		return "[" + x + "," + y + "]"; //[10,20], radius, area, perimeter
	}
//	public boolean equals(Point p2)     // NOT APPLICABLE FOR INHERITANCE
//	{
//		return x == p2.x && y == p2.y;
//	}
	public boolean equals(Object p2)
	{
		Point point2 = (Point) p2; //cast p2 into point class
		
		return x == point2.x && y == point2.y;
	}
}
