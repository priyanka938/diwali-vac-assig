import java.util.*;
public class special8
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
System.out.println(numcalc( s1, s2));
}

static public int numcalc(String j,String k)
{
int res=0;
Set set1=new HashSet();
for(char i:j.toCharArray())
set1.add(i);
for(char p: k.toCharArray())
if(set1.contains(p))
res++;
return res;
}
}