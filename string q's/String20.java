class  String20
{
public static void main(String args[])
{
String str="good morning";
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='o')
continue;
System.out.print(str.charAt(i));
}
}
}