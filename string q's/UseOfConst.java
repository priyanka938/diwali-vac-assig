class constDemo
{
int var1,var2;

constDemo(int a,int b)
{
System.out.println("this is parameterised  constructor:");
//a=this.var1;  //initial values;
//b=this.var2;
int c=a+b;

System.out.println("initial values are:"+a+","+b);
System.out.println("result is:"+c);

}
constDemo()
{
System.out.println("this is zero arg default constructor:");
}
}


class UseOfConst
{
public static void main(String args[])
{
constDemo a1=new constDemo();   // object created,calls the constructor
constDemo a2=new constDemo(10,20);  //parameterised constructor called

}
}