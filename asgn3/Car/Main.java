import java.lang.*;

class Car
{
	private int model;
	private String make;
	private int speed;

	Car(int mod, String mak, int s)
	{
		model = mod;
		make = mak;
		speed = s;
	}

	void displaySpeed() { System.out.println("The speed is : " + speed); }
	int getSpeed() { return speed; }
	String getMake() { return make; }
	int getModel() { return model; }

	void accelerate()
	{
		System.out.println("-Accelerate-");
		speed += 5;
	}

	void Break()
	{
		System.out.println("-Break-");
		speed -= 5;
	}

}

public class Main
{
	public static void main(String[] args)
	{
		Car c = new Car(2021, "F1", 90);
		
		System.out.println("Initially : ");
		c.displaySpeed();

		for(int i = 0; i < 5; ++i)
		{
			c.accelerate();
			c.displaySpeed();
		}

		for(int i = 0; i < 5; ++i)
		{
			c.Break();
			c.displaySpeed();
		}
	}
}