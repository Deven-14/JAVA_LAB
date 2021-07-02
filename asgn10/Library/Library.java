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
   void writeToFile(String fileName, Book b)
   {
      try{
      
         FileOutputStream fout = new FileOutputStream(fileName);
         ObjectOutputStream oout = new ObjectOutputStream(fout);
         
         oout.writeObject(b);
         
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
      
      Book b1 = new Book("Dev1", "book1", "ed1", 500);
      l1.writeToFile("output.txt", b1);
      System.out.println(b1);
      
      Book b2 = new Book();
      b2 = l1.readFromFile("output.txt", "book1");
      System.out.println(b2);
   }
}