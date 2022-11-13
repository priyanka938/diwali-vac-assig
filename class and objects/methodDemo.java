//12. Java Program to Create a Method without Parameters and with Return Type
//13. Java Program to Create a Method without Parameters and Return Type
class methodDemo
{
int sum,a=2,b=6;
int sum2()   //  method without parameters but return type
{
	sum=a+b;
if(sum>0)
return sum;
else
return 0;
}

void sum1(int n1,int n2)  // method having parameters but noreturn type
{
 sum=n1+n2;
 System.out.println(sum);
}

public static void main(String args[])
{
methodDemo d1=new methodDemo();
int a=d1.sum2();
System.out.println(a);
d1.sum1(10,20);
}
}