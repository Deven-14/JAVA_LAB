package dpack;
import bpack.B;
import cpack.C;

public class ProtectedDemo
{
	public static void main(String[] args)
	{
		B bobj = new B(5, 10, 15, 20);
		C cobj = new C(6, 11, 16, 21);
		
		System.out.println("B class");
		bobj.display();
		
		System.out.println("\nC class");
		cobj.display();
	}
}