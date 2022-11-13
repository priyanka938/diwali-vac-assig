import java.util.*;
class iterateSet
{
public static void main(String args[])
{
HashSet<Integer> h1=new HashSet<Integer>();
h1.add(100);
h1.add(200);
h1.add(300);
h1.add(400);

//create an iterartor 
Iterator<Integer> it=h1.iterator();
while(it.hasNext())
{
System.out.println(it.next()+" ");
}
}
}