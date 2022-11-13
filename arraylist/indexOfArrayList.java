//Write a Java program to insert elements into the linked list at the first and last position
import java.util.*;
public class indexOfArrayList{
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println("Original list : " + list);
      int n=list.size();
	  for(int i=0;i<n;i++)
	  {
	  System.out.println("element :"+list.get(i)+" at :"+i);
	  }
      
   }
}