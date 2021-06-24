import java.lang.*;

class Point
{
	private double x, y;
	
	Point(int a, int b)
	{
		x = a;
		y = b;
	}
	
	double getDistance(Point p2)
	{
		double dist = Math.sqrt(Math.pow((p2.x - x), 2) + Math.pow((p2.y - y), 2));
		return dist;
	}

}

class Distance
{
	public static void main(String[] args)
	{
		Point p1 = new Point(2, 2);
		Point p2 = new Point(4, 4);
		System.out.println("The distance is : " + p1.getDistance(p2));
	}
}
	