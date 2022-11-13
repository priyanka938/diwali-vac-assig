class staticNested
{
static String str="priyanka";
static class inner
{
void msg()   //instance method
{
System.out.println("string is  :"+str);
}
}
public static void main(String args[])
{
staticNested.inner obj1=new staticNested.inner();    ///reference for inner class
obj1.msg();
}
}