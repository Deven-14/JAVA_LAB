import java.lang.*;

class BankAccount
{
	private String name;
	private double balanceAmount;
	private int accountNumber;

	void init_val(String n, int accNo, double bal)
	{
		name = n;
		accountNumber = accNo;
		balanceAmount = bal;
	}
	
	void deposit(double amt)
	{
		balanceAmount += amt;
		System.out.println("The balance after deposit is : " + balanceAmount);
	}
	
	void withdraw(double amt)
	{
		balanceAmount -= amt;
		System.out.println("The balance after withdrawing is : " + balanceAmount);
	}
	
	void display()
	{
		System.out.println("Owner Name : " + name);
		System.out.println("Balance Amount : " + balanceAmount);
	}

	public static void main(String[] args)
	{
		BankAccount b = new BankAccount();
		b.init_val("dev", 12345, 5000);
		b.display();
		//b.deposit(1000);
		//b.withdraw(500);
		b.deposit(Integer.parseInt(args[0]));
		b.withdraw(Integer.parseInt(args[1]));
	}
}