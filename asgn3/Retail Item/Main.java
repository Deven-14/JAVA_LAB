import java.lang.*;
import java.util.Scanner;

class ReatilItem
{
	private String description;
	private int units;
	private double price;

	ReatilItem(String des, int u, double p)
	{
		description = des;
		units = u;
		price = p;
	}

	void setDescription(String des){ description = des; }
	void setUnits(int u) { units = u; }
	void setPrice(double p) { price = p; }
	
	String getDescription() { return description; }
	int getUnits() { return units; }
	double getPrice() { return price; }

}

public class Main
{
	public static void main(String[] args)
	{
		ReatilItem[] r = new ReatilItem[3];
		r[0] = new ReatilItem("pen", 5, 10);
		r[1] = new ReatilItem("pencil", 10, 5);
		r[2] = new ReatilItem("book", 7, 25);
		
		String description;
		int units;
		double price;
		
		//not needed to input values from user, not there in question, just do, r[0].setDes("Pen"), r[1].setUnits(5), r[2].setpri(45);
		//instead of this forloop
		for(int i = 0; i < 3; ++i)
		{
			System.out.println("Reatil Item " + (i+1) + " : ");
			System.out.println("The old Description is : " + r[i].getDescription());
			System.out.print("Enter the new Description : ");
			Scanner sc = new Scanner(System.in);
			description = sc.next();
			r[i].setDescription(description);
			
			System.out.println("The old Units is : " + r[i].getUnits());
			System.out.print("Enter the new Units : ");
			units = sc.nextInt();
			r[i].setUnits(units);

			System.out.println("The old Price is : " + r[i].getPrice());
			System.out.print("Enter the new Price : ");
			price = sc.nextDouble();
			r[i].setPrice(price);
			System.out.println();
		}


		System.out.println("Details : \n");
		
		for(int i = 0; i < 3; ++i)
		{
			System.out.println("Reatil Item " + (i+1) + " : ");
			System.out.println("The Description is : " + r[i].getDescription());
			System.out.println("The Units is : " + r[i].getUnits());
			System.out.println("The Price is : " + r[i].getPrice());
			System.out.println();
		}
	}
}