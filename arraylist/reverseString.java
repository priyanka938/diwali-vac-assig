import java.util.*;
class reverseString 
{
public static void main(String args[])
{
List<String>  list1=new ArrayList<String>();
list1.add("shlok");
list1.add("priya");
list1.add("cdac");
list1.add("white");
list1.add("kolhapur");
System.out.println("list before:"+list1);
Collections.reverse(list1);
System.out.println("list after  reversing:"+list1);
}
}
