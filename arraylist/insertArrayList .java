import java.util.*;
public class insertArrayList {
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      System.out.println("Original list : " + list);
      Collections.insert(1,100); 
      System.out.println("List after inserting : " + list1);
   }
}