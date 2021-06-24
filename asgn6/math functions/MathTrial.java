import java.lang.*;

/*Write an interface, called MyMath, for your own Math Library functions. Create a new class called AdvancedMath that inherits standard Math class and implement MyMath interface.*/

interface MyMath
{
   void add(double a, double b);
   void mul(double a, double b);
   void ceil(double a);
   void floor(double a);
}

class AdvanceMath implements MyMath
{
   public void add(double a, double b)
   {
      System.out.println(a + " + " + b + " = " + (a+b));
   }
   
   public void mul(double a, double b)
   {
      System.out.println(a + " * " + b + " = " + (a*b));
   }
   
   public void ceil(double a)
   {
      System.out.println("ceil of a is : " + Math.ceil(a));
   }
   
   public void floor(double a)
   {
      System.out.println("floor of a is : " + Math.floor(a));
   }
}

class MathTrial
{
   public static void main(String[] args)
   {
      AdvanceMath a = new AdvanceMath();
      a.add(1.5, 2.5);
   }
}