package bpack;
import apack.*;

public class B extends A
{
	B(int a, int b, int c, int d)
	{
		super(a, b, c, d);
	}

	void display()
	{
		System.out.println("Default var : Cannot be accessed by class B");
		System.out.println("Private var : Cannot be accessed by class B");
		System.out.println("Public var : " + pub);
		System.out.println("Protected var : " + pro);
	}
}