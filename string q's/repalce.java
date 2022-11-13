import java.util.*;
class replace
{
public static void main(String args[])
{
String s;
Scanner sc=new Scanner(System.in);
System.out.println("enter string :");
s=sc.nextLine();
System.out.println("before :"+s);
String replaced=s.replace('a','@');
System.out.println("after :"+replaced);
}
}