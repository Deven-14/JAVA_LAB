import java.lang.*;

/*Create a class temperature with member variable temp. Implement exception handling to test if temperature is equal to zero.*/

class TemperatureZeroException extends Exception
{
   TemperatureZeroException(String s) { super(s); }
}

public class Temperature
{
	private double temp;
   
   Temperature(double t) { temp = t; }
   
   void checkTemperature()
   {
      try{
      
         if(temp == 0)
            throw new TemperatureZeroException("Temperature is Zero");//new keyword ************ very important
         System.out.println("The temperature is : " + temp);
       
      }
      catch(TemperatureZeroException t)
      {
         System.out.println(t);
      }
   }
   
   public static void main(String[] args)
   {
      Temperature t1 = new Temperature(5);
      Temperature t2 = new Temperature(0);
      Temperature t3 = new Temperature(90);
      t1.checkTemperature();
      t2.checkTemperature();
      t3.checkTemperature();
   }
   
}