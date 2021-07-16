import java.util.*;

public class arraylist {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("One");//Adding object in arraylist
        list.add("Two");
        list.add("Three");
        list.add("Four");
        //Printing the arraylist object
        System.out.println(list);

        System.out.println();

        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(1);//Adding object in arraylist
        list1.add(2);
        list1.add(3);
        list1.add(4);
        //Traversing list through Iterator
        Iterator itr=list1.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }
    }
}