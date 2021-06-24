import java.lang.*;

/*Consider a student examination database system that prints the mark sheet of the students.  Input the following from the command line student name and marks in 6 subjects.  These marks should be in between 0 and 50 if the marks are not in the specified range raise a Range Exception else find the total marks and print the percentage of the student.*/

class RangeException extends Exception
{
   RangeException(String s) { super(s); }
}

public class Student
{      
   public static void main(String[] args)
   {
      int[] marks = new int[6];
      double total = 0;
      String name = args[0];
      
      for(int i = 1; i < 7; ++i)
         marks[i-1] = Integer.parseInt(args[i]);
      
      try{
         
         for(int i = 0; i < 6; ++i)
         {
            if(marks[i] < 0 || marks[i] > 50)
               throw new RangeException("Marks is greater than 50 or less than 0");
               
            total += marks[i];
         }
         
         System.out.println("Total : " + total);
         
         System.out.println("Percentage : " + total/3);
               
      }
      catch(RangeException r)
      {
          System.out.println(r);
      }
      
   }   
}