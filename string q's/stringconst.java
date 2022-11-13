import java.lang.*;
import java.util.*;
class stringconst
{
public static void main(String args[])
{
char[] chars = "String Constructors".toCharArray();
System.out.println(Arrays.toString(chars));
 
String s4 = new String(chars);
System.out.println(s4);
 
s4 = new String(chars, 2, 8);
System.out.println(s4);
}
}