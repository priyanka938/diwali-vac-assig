class  Strconst
{
public static void main(String args[])
{
StringBuffer sb = new StringBuffer("Hello");
sb.append("World");
 
String s7 = new String(sb);
System.out.println(s7);
 
s7 = sb.toString(); // better approach
System.out.println(s7);
}
}