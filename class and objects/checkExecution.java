//Java Program to Check Whether Which One is Executed First, Static Block or the Static Method
class checkExecution
{
static int a=10;
// static block 
static 
{
System.out.println("this is a static block:");
}

static void show()
{
System.out.println("this is static method ");
System.out.println(a);

}

public static void main(String args[])
{
	//show();
System.out.println("this is the main method");
show();
}
}