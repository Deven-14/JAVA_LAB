/*
5b.Write code to 
i) chars arr={'a','b','c','d','e','f'}
String str= new String(arr,2,3); 
String(String strObj)
ii) str="hello world"
str2="bms college"
str=str1+str2;
iii) override toString() function to print "good morning"
iv) Assign a diiferent char at pos 2 in a string "hello"
v) Convert the string " This is java programming" to array of characters
vi) Given the strings
String s1= "hello world"
String s2="hello world"
String s3="bms college "
Write appropriate code to compare s1 with s2 and s1 with s3 for i)equal strings and also 
using compareTo function also compare given region of string s1 with string s2, 
demonstrate the difference between equals and ==. 
vii) To search a good in a string s1="good morning" and s2="morning is started"
viii) Extract a substring goo
*/

class StringDemo
{

    public String toString()
    {
        return "good morning";
    }

    public static void main(String[] args)
    {

        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s1 = new String(arr, 2, 3);
        String s2 = new String(s1);
        System.out.println("s1 " + s1);
        System.out.println("s2 " + s2);

        String s3 = "hello world";
        String s4 = "bms college";
        String s5 = s3 + s4;
        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);
        System.out.println("s5 = s3 + s4 " + s5);

        StringDemo s6 = new StringDemo();
        System.out.println(s6);

        String s7 = "hello";
        String s8 = s7.substring(0, 2) + 'A' + s7.substring(3);
        System.out.println("s7 " + s7);
        System.out.println("s8 " + s8);

        String s9 = "This is java Programming";
        char[] arr2 = s9.toCharArray();
        System.out.println("s9 " + s9);
        System.out.print("arr2 : ");
        for(char a : arr2)
            System.out.print(a);
        System.out.println();

        String s10= "hello world";
        String s11= "hello world";
        String s12= "bms college";

        System.out.println("s10 == s11 - " + (s10 == s11));
        System.out.println("s10 == s12 - " + (s10 == s12));
        System.out.println("s10.equals(s11) - " + (s10.equals(s11)));
        System.out.println("s10.equals(s12) - " + (s10.equals(s12)));
        System.out.println("s10.compareTo(s11) - " + (s10.compareTo(s11)));
        System.out.println("s10.compareTo(s12) - " + (s10.compareTo(s12)));

        String s13 = "good morning";
        String s14 = "morning is started";
        System.out.println("Find good in s13 - " + s13.indexOf("good"));
        System.out.println("Find good in s14 - " + s14.indexOf("good"));

        String s15 = s13.substring(0, 3);
        System.out.println("Substring - " + s15);

    }

}