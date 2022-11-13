class equal
{
public static void main(String args[])
{
int a1[]={1,2,3,4,5};
int a2[]={0,2,3,4,5};
boolean b=true;
for(int i=0;i<a1.length;i++)
{
	for(int j=0;j<a2.length;j++)
	{
	if(a1[i]==a2[j])
	{
	System.out.println(a1[i]+"equal to "+a2[j]);
 b=true;
	}
 else
	 b=false;
}

}
if(b==true)
	System.out.println("two arrays are equal:");
else 
	System.out.println("not equal");
}
}