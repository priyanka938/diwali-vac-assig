//constructor chaining 
class base
{
int roll;
String name;
base()
{
this(12,"priyanka");    // two arg const of same class called
System.out.println("this is default constructor:");
}
base(int a,String s)
{
System.out.println("this is paramerised constructor");
System.out.println("name and roll :"+a+","+s);

}

}
class chaining
{
chaining()
{
super();  //base parent class constructor called
System.out.println("default constructor of chaining class:");
}
public static void main(String args[])
{
base b1=new base();
base b2=new base(20,"priya");
chaining c1=new chaining();
}

}