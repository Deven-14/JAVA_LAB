import java.lang.*;

class Factorial
{
	int factorial(int n)
	{
		int fact = 1;
		for(int i = 1; i <= n; ++i)
			fact = fact * i;
		return fact;
	}

	public static void main(String[] args)
	{
		Factorial f = new Factorial();

		for(int i = 0; i <= 10; ++i)
			System.out.println(i + "! = " + f.factorial(i));
	}
}