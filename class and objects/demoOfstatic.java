// usage of instance variable and static variable
class demoOfstaticInstance
{
int count1;    // instance variable
static int count2;  // static variable
demoOfstaticInstance(int count1,int count2)
{
this.count1=count1;
this.count2=count2;
}
}
class demoOfstatic 
{
public static void main(String args[])
{
demoOfstaticInstance d1=new  demoOfstaticInstance(10,20);     
demoOfstaticInstance d2=new demoOfstaticInstance(30,100);
System.out.println(d1.count1);  // prints 10
System.out.println(d1.count2);  // prints 100
System.out.println(d2.count1);  //  prints 30
System.out.println(d2.count2);  // prints 100
}
}
