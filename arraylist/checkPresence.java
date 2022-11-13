import java.util.*;
public class checkPresence{
   public static void main (String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
	  int index1=list.indexOf(10);
//int index2=list.indexOf("50");
	if(index1==-1)
	System.out.println("element is not present:");
else
	System.out.println("element is at"+index1);
	  }
      
   
}