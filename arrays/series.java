import java.util.*;
class series
{
public static void main(String args[])
{

int n=100;
int a[]=new int[n];
for(int i=0;i<4;i++)
{
if((i%2)==1)
{
a[i]=a[i*i];
System.out.println(a[i]);
}
else if((i%2)==0)
{
	a[i]=a[i*i*i];
System.out.println(a[i]);

}
}
}
}