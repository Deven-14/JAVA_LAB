import java.util.*;

class Book {
    int id;
    String name,author;
    int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
}

public class hashset {
    public static void main(String[] args) {
        HashSet<Book> set=new HashSet<Book>();
        HashSet<Book> set1=new HashSet<Book>();

        //Creating Books
        Book b1=new Book(101,"Let us C","Alpha",2);
        Book b2=new Book(102,"Java","Beta",4);
        Book b3=new Book(103,"Operating System","Gama",6);
        Book b4=new Book(104,"Python","Delta",8);
        Book b5=new Book(105,"Kotlin","Sigma",10);

        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for(Book b:set){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }
        System.out.println();

        set1.add(b4);
        set1.add(b5);
        set.addAll(set1);

        System.out.println();

        //Traversing HashSet
        for(Book b:set){
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.quantity);
        }
    }
}