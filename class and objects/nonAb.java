abstract class demoOfAb
{
abstract void show();
void non()
{
	System.out.println("this is non abstarct method of abstract class:");
}
static void ab()
{
	System.out.println("this is static method of abstract class:");
}

}
class nonAb extends demoOfAb
{
 void show()
{
int a=6,b=9;
System.out.println(a+b);
}
public static void main(String args[])
{
	//demoOfAb b1=new demoOfAb();    Complile error abstarct class cannot be instantiated
demoOfAb a1=new nonAb();
a1.show();
a1.non();
ab();

}
}
