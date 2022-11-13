import java.util.PriorityQueue;  
  
public class Arraylist21 {  
public static void main(String[] args) {  
  
PriorityQueue<String>  p1 = new PriorityQueue<String>();  
  
p1.add("Amir");  
p1.add("Adam");  
p1.add("Chris");  
p1.add("Rafiq");  
p1.add("Ahana");  
  
System.out.println("Queue before using remove() method :");  
  
for (String str : p1) {  
  
System.out.println(str);  
        }   
System.out.println("Queue after clearing all elemnts:");  
  p1.clear();
  System.out.println(p1);

           
      }  
}  