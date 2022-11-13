final class finaluse  // final class which cannot be extended 
{
public void use()
{
System.out.println("this is the use method of final class:");
}

}
class demoOfFinal
{
public static void main(String args[])
{
final int a=100;   // final variable, we cannot change its value
//a=a+100;     gives complie time error 
variable();
finaluse  a1=new finaluse();     reference of final class
a1.use();
}
static void variable()
{
System.out.println("this is static method of demoOfFinal class");
}
}