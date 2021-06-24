class Array<T extends Comparable<T>>
{
    T[] arr;
    
    Array(T[] a)
    {
        arr = a;
    }
    
    T findLargest()
    {
        T max = arr[0];
        for(int i = 1; i < arr.length; ++i)
            if(arr[i].compareTo(max) > 0)
                max = arr[i];
        
        return max;
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Integer b[] = {1, 5, 6, 3, 2};
        Array<Integer> a = new Array<Integer>(b);
        System.out.println(a.findLargest());
        
        Double c[] = {1.5, 6.3 , 6.2, 7.5};
        Array<Double> d = new Array<Double>(c);
        System.out.println(d.findLargest());
    }
}