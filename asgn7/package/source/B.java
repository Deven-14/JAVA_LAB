package bpack;
import apack.*;

public class B extends A //public*************
{
	public B(int a, int b, int c, int d) //public*****
	{
		super(a, b, c, d);
	}

	public void display() //public************
	{
		System.out.println("Default var : Cannot be accessed by class B");
		System.out.println("Private var : Cannot be accessed by class B");
		System.out.println("Public var : " + pub);
		System.out.println("Protected var : " + pro);
	}
}