import java.util.*;

public class treeset {
    public static void main(String args[]){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(2);
        set.add(12);
        set.add(15);
        set.add(100);

        System.out.println("Initial tree set:");
        System.out.println(set);

        System.out.println();
        System.out.println("Lowest Value: "+set.pollFirst());
        System.out.println("Highest Value: "+set.pollLast());
        System.out.println();

        System.out.println("After removing highest and lowest value:");
        System.out.println(set);


    }
}