import java.io.*;

class DemoException
{
	public static void main(String args[])
	{
		try {
			int a = 30/0;
		}
		catch(ArithmeticException e) {
			System.out.println (e);
		}
		try{
			File file = new File("file.txt");
			FileReader fr = new FileReader(file);
        	}
		catch(FileNotFoundException e) {
           		System.out.println(e);
        	}
	}
}