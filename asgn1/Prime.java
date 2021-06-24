import java.lang.*;

class Prime
{
	boolean isPrime(int n)
	{
		int i = 2;
		while( i < n && n % i != 0)
			++i;
		if(i == n)
			return true;// return 1; int cannot be converted to boolean type, i.e 1 is not true in java, u have to use boolean
		else
			return false;
	}
	
	public static void main(String[] args)
	{
		Prime p = new Prime();
		int count = 0;

		System.out.print("The alternate prime numbers are : ");

		for(int i = 2; i < 100; ++i)
		{
			if(p.isPrime(i))
			{
				if(count % 2 == 0)
					System.out.print(i + ", ");
				++count;
			}
		}
	}
}
				