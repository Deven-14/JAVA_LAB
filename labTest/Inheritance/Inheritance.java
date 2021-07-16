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
		System.out.println("Private Data is not Inherited");
		System.out.println("Public Data : " + pub1 + ", " + pub2);
		System.out.println("Protected Data : " + pro1 + ", " + pro2);
	}
}


final class C extends B
{
	C() { super(); }
	
	C(int i1, int i2, float f1, float f2)
	{
		super(i1, i2, f1, f2);
	}

	final void display()
	{
		System.out.println("Class C");
		System.out.println("Private Data is not Inherited");
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
		System.out.println("Private Data is not Inherited");
		System.out.println("Public Data : " + pub1 + ", " + pub2);
		System.out.println("Protected Data : " + pro1 + ", " + pro2);
	}
}

class Inheritance
{
	
	public static void main(String[] args)
	{
		A a = new A(1, 2, 3, 4, 5.5f, 6.6f);
		a.display();
		A b = new B(7, 8, 9.9f, 10.1f);
		b.display();
		A c = new C(11, 12, 13.3f, 14.4f);
		c.display();
		A d = new D(15, 16, 17.7f, 18.8f);
		d.display();
	}
}