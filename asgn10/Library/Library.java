import java.io.*;

class Book implements Serializable
{
   String authorName, title, edition;
   int price;
   
   Book() { }
   
   Book(String authorName, String title, String edition, int price)
   {
      this.authorName = authorName;
      this.title = title;
      this.edition = edition;
      this.price = price;
   }
   
   public String toString()
   {
      String s = "Author Name = " + authorName;
      s += "\nTitle = " + title;
      s += "\nEdition = " + edition;
      s += "\nPrice = " + price;
      return s;
   }
}

public class Library
{
   
   void writeToFile(String fileName, Book[] b)
   {
      try{
      
         FileOutputStream fout = new FileOutputStream(fileName, true);
         ObjectOutputStream oout = new ObjectOutputStream(fout);
         
         for(int i = 0; i< b.length; ++i) 
            oout.writeObject(b[i]);
         //oout.flush();
         
         oout.close();
         fout.close();
         
      } catch (FileNotFoundException e) {
            System.out.println("File not found");
      } catch (IOException e) {
            System.out.println("Error initializing stream");
      }
   }
   
   Book readFromFile(String fileName, String title)
   {
      Book b = new Book();
      
      try {
      
         FileInputStream fin = new FileInputStream(fileName);
         ObjectInputStream oin = new ObjectInputStream(fin);
         
         Book temp;
              
         do{
            temp = (Book) oin.readObject();
         }while(temp.title.compareTo(title) != 0);
         
         if(temp.title.compareTo(title) != 0)
            b = null;
         else
            b = temp;
         
         oin.close();
         fin.close();
      
      } catch (FileNotFoundException e) {
            System.out.println("File not found");
      } catch (IOException e) {
            System.out.println("Error initializing stream");
      } catch (ClassNotFoundException e) {
            e.printStackTrace();
      }
        
      return b;
   }
   
   public static void main(String[] args)
   {
      Library l1 = new Library();
      
      Book[] b = new Book[10];
      
      for(int i = 0; i < 10; ++i)
      {
         b[i] = new Book("Dev" + i, "book" + i, "ed" + i, 500 + i * 100);
      }
      l1.writeToFile("output.txt", b);
      
      //System.out.println(b1);
      
      // Book b2 = new Book("Dev2", "book2", "ed2", 2500);
//       l1.writeToFile(fout, b2);
//       System.out.println(b2);
      
      // Book b3 = l1.readFromFile("output.txt", "book1");
//       System.out.println(b3);
//       
//       Book b4 = l1.readFromFile("output.txt", "book2");
//       System.out.println(b4);
      
      for(int i = 0; i < 10; ++i)
      {
         Book b3 = l1.readFromFile("output.txt", "book" + i);
         System.out.println(b3);
      }
      
   }
}