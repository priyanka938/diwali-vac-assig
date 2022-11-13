// string coding qs question no 5
import java.util.*;
class program1
{
public static boolean onlydigits(String str,int n)
{
for(int i=0;i<n;i++)
{
if(str.charAt(i)<'0' || str.charAt(i)>'9')
{
return false;
}
}
return true;
}
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter any string");
str=sc.nextLine();
int len=str.length();
boolean res=onlydigits(str,len);
if(res==true)
System.out.println("string contains only digits");
else
	System.out.println("string does not contains only digits:");


}
}