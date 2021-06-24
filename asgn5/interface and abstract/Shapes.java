import java.lang.*;

abstract class Shape
{
	String color;
	int nEdges;

	Shape(String c, int n) { color = c; nEdges = n; }

	void displayNEdges()
	{
		System.out.println("The nubmer of edges : " + nEdges);
	}
}


interface Ipoint
{
	void draw();
}


class Circle extends Shape implements Ipoint
{
	Circle(String c) { super(c, 0); System.out.println("Circle : "); }
	
	public void draw() { System.out.println("Drawing a Circle with color " + color); }
}

class Circle3D extends Circle
{
	Circle3D(String c) { super(c); System.out.println("3D Circle : "); }
	
	public void draw() { System.out.println("Drawing a 3D Circle with color " + color); }
}
	

class Triangle extends Shape implements Ipoint
{
	
	Triangle(String c) { super(c, 3); System.out.println("Triangle : "); }

	public void draw() { System.out.println("Drawing a Triangle with color " + color); }
	
}

class Hexagon extends Shape implements Ipoint
{
	Hexagon(String c) { super(c, 6); System.out.println("Hexagon : "); }

	public void draw() { System.out.println("Drawing a Hexagon with color " + color); }
}

class Shapes
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle("red");
		t.displayNEdges();
		t.draw();
		
		Circle c = new Circle("blue");
		c.displayNEdges();
		c.draw();
		
		Hexagon h = new Hexagon("green");
		h.displayNEdges();
		h.draw();
		
		Circle3D c3d = new Circle3D("yellow");
		c3d.displayNEdges();
		c3d.draw();
	}
}