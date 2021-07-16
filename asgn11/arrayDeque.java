import java.util.*;

public class arrayDeque {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("One");
        deque.add("Two");
        deque.add("Three");
        System.out.println(deque);

        System.out.println("\nDemonstrating addFirst and addLast:");
        deque.addFirst("Zero");
        deque.addLast("Four");

        //Traversing elements
        System.out.println(deque);
        deque.clear();

        System.out.println("\nAfter clearing:");
        System.out.println(deque);
    }
}