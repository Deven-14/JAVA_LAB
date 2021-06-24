import java.lang.*;

class OddNumber
{
	public static void main(String[] args)
	{
		int n = 100;
		System.out.print("The odd numbers are : ");
		for(int i = 1; i < n; i += 2)
			System.out.print(i + ", ");
	}
}