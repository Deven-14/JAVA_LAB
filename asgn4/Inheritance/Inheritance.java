import java.lang.*;

class A
{
	private int pri1, pri2;
	public int pub1, pub2;
	protected float pro1, pro2;
	
	A()
	{
		pri1 = pri2 = pub1 = pub2 = 0;
		pro1 = pro2 = 0;
	}
	
	A(int i1, int i2, int i3, int i4, float f1, float f2)
	{
		pri1 = i1;
		pri2 = i2;
		pub1 = i3;
		pub2 = i4;
		pro1 = f1;
		pro2 = f2;
	}

	void display()
	{
		System.out.println("Class A");
		System.out.println("Private Data : " + pri1 + ", " + pri2);
		System.out.println("Public Data : " + pub1 + ", " + pub2);
		System.out.println("Protected Data : " + pro1 + ", " + pro2);
	}
}

class B extends A
{
	B() { super(); }
	
	B(int i1, int i2, float f1, float f2)
	{
		super(0, 0, i1, i2, f1, f2);
	}
	
	void display()
	{
		System.out.println("Class B");
		System.out.println("Private Data is not inherited");
		System.out.println("Public Data : " + pub1 + ", " + pub2);
		System.out.println("Protected Data : " + pro1 + ", " + pro2);
	}
}


class C extends B
{
	C() { super(); }
	
	C(int i1, int i2, float f1, float f2)
	{
		super(i1, i2, f1, f2);
	}

	void display()
	{
		System.out.println("Class C");
		System.out.println("Private Data is not inherited");
		System.out.println("Public Data : " + pub1 + ", " + pub2);
		System.out.println("Protected Data : " + pro1 + ", " + pro2);
	}
}

class D extends B
{
	D() { super(); }
	
	D(int i1, int i2, float f1, float f2)
	{
		super(i1, i2, f1, f2);
	}

	void display()
	{
		System.out.println("Class D");
		System.out.println("Private Data is not inherited");
		System.out.println("Public Data : " + pub1 + ", " + pub2);
		System.out.println("Protected Data : " + pro1 + ", " + pro2);
	}
}

class Inheritance
{
	
	public static void main(String[] args)
	{
		B b = new B(5, 6, 7.7f, 8.8f);
		b.display();
		C c = new C(15, 16, 17.7f, 18.8f);
		c.display();
		D d = new D(50, 60, 70.7f, 80.8f);
		d.display();
	}
}