import java.lang.*;

class Fibonacci
{
	int fibonacci(int n)
	{
		if(n == 1)
			return 0;
		if(n == 2)
			return 1;
		return (fibonacci(n-1) + fibonacci(n-2));
	}

	public static void main(String[] args)
	{
		Fibonacci f = new Fibonacci();
		for(int i = 1; i < 11; ++i)
			System.out.println("The " + i + "th fibonacci number is : " + f.fibonacci(i));
	}
}