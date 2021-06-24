import java.util.Scanner;

class Matrix
{
	private int[][] a = new int[3][3];

	public void input()
	{
		System.out.println("Enter values for a 3x3 matrix:");
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; ++i)
			for(int j = 0; j < 3; ++j)
				a[i][j] = sc.nextInt();
	}

	public void display()
	{
		System.out.println("The matrix is : ");
		for(int i = 0; i < 3; ++i)
		{
			for(int j = 0; j < 3; ++j)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

	public Matrix multiply(Matrix b)
	{
		Matrix c = new Matrix();
		
		for(int i = 0; i < 3; ++i)
		{
			for(int j = 0; j < 3; ++j)
			{
				int sum = 0;
		
				for(int k = 0; k < 3; ++k)
					sum += a[i][k] * b.a[k][j];

				c.a[i][j] = sum;
			}
		}
		
		return c;
	}
}

class MultiplyMatrix extends Thread
{
	public void run()
	{
		Matrix a = new Matrix();
		Matrix b = new Matrix();
		
		System.out.println("Matrix A : ");
		a.input();
		System.out.println("\nMatrix B : ");
		b.input();

		Matrix c = a.multiply(b);
		
		System.out.println("\nA x B");
		c.display();
	}
}
		

class MultiplyDemo
{
	public static void main(String[] args)
	{
		MultiplyMatrix m = new MultiplyMatrix();		
		m.start();
	}
}