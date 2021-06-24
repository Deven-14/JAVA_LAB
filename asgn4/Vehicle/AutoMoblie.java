import java.lang.*;

abstract class Vehicle
{
	int nTires;
	String color;

	Vehicle()
	{
		nTires = 0;
		color = "";
	}
	
	Vehicle(int n, String c)
	{
		nTires = n;
		color = c;
	}
	
	void display()
	{
		System.out.println("Number of tires : " + nTires);
		System.out.println("Color : " + color);
	}
}


class Car extends Vehicle
{
	Car() { super(); }

	Car(String c) { super(4, c); }

	void display()
	{
		System.out.println("Car : ");
		super.display();
	}
}

class Bike extends Vehicle
{
	Bike() { super(); }

	Bike(String c) { super(2, c); }

	void display()
	{
		System.out.println("Bike : ");
		super.display();
	}
}

class Auto extends Vehicle
{
	Auto() { super(); }

	Auto(String c) { super(3, c); }

	void display()
	{
		System.out.println("Auto : ");
		super.display();
	}
}

class AutoMoblie
{
	public static void main(String[] args)
	{
		Car c = new Car("red");
		c.display();
		Auto a = new Auto("blue");
		a.display();
		Bike b = new Bike("green");
		b.display();
	}
}