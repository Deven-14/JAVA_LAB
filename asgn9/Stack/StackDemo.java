class Stack<T>
{
	private Object[] node;
   private int top;
   static final int maxSize = 50;
   
   public Stack()
   {
      node = new Object[maxSize];
      top = -1;
   }
   
   public void push(T data)
   {
      if(top >= maxSize - 1)
         return;
      
      node[++top] = data;
   }
   
   public void pop()
   {
      if(top == -1)
         return;
      
      --top;
   }
   
   public T top()
   {
      if(top == -1)
         return null;
         
      return (T)node[top];
   }
   
   public void display()
   {
      System.out.print("The Stack is : ");
      for(int i = top; i >= 0; --i)
         System.out.print((T)node[i] + " ");
      System.out.println();
   }
}

class Student
{
   private int rollNo;
   private String name;
   
   Student(int r, String s)
   {
      rollNo = r;
      name = s;
   }
   
   public String toString()
   {
      return "Name = " + name + ", Roll No. = " + rollNo + " | ";
   }
}

public class StackDemo
{
   public static void main(String[] args)
   {
      Stack<Integer> s1 = new Stack<Integer>();
      s1.push(5);
      s1.push(10);
      s1.display();
      s1.pop();
      s1.display();


      Stack<Float> s2 = new Stack<Float>();
      s2.push(5.5F);
      s2.push(10.5F);
      s2.display();
      s2.pop();
      s2.pop();
      s2.pop();
      s2.display();

      Stack<Student> s3 = new Stack<Student>();
      s3.push(new Student(1, "dev"));
      s3.push(new Student(2, "dev2"));
      s3.display();
      s3.pop();
      s3.display();
   }
}      