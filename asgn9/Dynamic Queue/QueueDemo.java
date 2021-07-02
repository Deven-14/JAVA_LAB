class Queue<T>
{
   private Object[] node;
   private int front;
   private int rear;
   private int size;
   private int capacity;
   
   public Queue()
   {
      size = 0;
      capacity = 0;
      front = -1;
      rear = -1;
   }
   
   private void resize()
   {
      if(capacity == 0)
         capacity = 1;
      else
         capacity *= 2;
      
      Object[] newNode = new Object[capacity];
      
      for(int i = 0; i < size; ++i)
         newNode[i] = node[i];
      
      node = newNode;
   }
   
   public void enQueue(T data)
   {
      if(size == capacity)
         resize();
      
      if(front == -1)
         front = rear = 0;
      else
         ++rear;
      
      node[rear] = data;
      ++size;
   }
   
   public void deQueue()
   {
      if(front == -1)
         return;
      else if(front == rear)
         front = rear = -1;
      else
         ++front;
   }
   
   public T front()
   {
      if(front == -1)
         return null;
      else
         return (T)node[front];
   }
   
   public T rear()
   {
      if(rear == -1)
         return null;
      else
         return (T)node[rear];
   }
   
   public String toString()
   {
      String s = "The Queue is : ";
      if(front == -1)
         return ( s + "Empty");
      for(int i = front; i <= rear; ++i)
      {
         s += (T)node[i];
         s += ", ";
      }
      return s;
   }
}

public class QueueDemo
{
   public static void main(String[] args)
   {
      System.out.println("Integer: ");
      Queue<Integer> qI = new Queue<Integer>();
      qI.enQueue(5);
      qI.enQueue(10);
      System.out.println(qI);
      qI.deQueue();
      System.out.println(qI);
      qI.deQueue();
      System.out.println(qI);
      qI.enQueue(5);
      qI.enQueue(10);
      System.out.println(qI);
      
      System.out.println("Double: ");
      Queue<Double> qD = new Queue<Double>();
      qD.enQueue(5.5);
      qD.enQueue(10.5);
      qD.enQueue(11.5);
      qD.enQueue(12.5);
      qD.enQueue(13.5);
      qD.enQueue(14.5);
      qD.enQueue(15.5);
      System.out.println(qD);
      qD.deQueue();
      qD.deQueue();
      qD.deQueue();
      qD.deQueue();
      System.out.println(qD);
      qD.deQueue();
      qD.deQueue();
      qD.deQueue();
      System.out.println(qD);
   }
}