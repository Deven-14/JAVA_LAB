package cpack;
import apack.A;

public class C
{
	A aobj;

	public C(int a, int b, int c, int d)
	{
		aobj = new A(a, b, c, d);
	}

	public void display()
	{
		System.out.println("Default var : Cannot be accessed by class C");
		System.out.println("Private var : Cannot be accessed by class C");
		System.out.println("Public var : " + aobj.pub);
		System.out.println("Protected var : Cannot be accessed by class C");
	}
}