//  how to sort string on their length in java

class StringSort
{
public static void main(String args[])
{
	String s1[]={"priyanka","shlok","sagar","cdac","mumbai"};
	int s2[]=new int[5];
		for(int i=0;i<s1.length;i++)
			{
			int n=s1[i].length();
			System.out.println(s1[i]+":"+n);
			s2[i]=n;
			}

bsort(s1);
display(s1);


}

static void bsort(String s1[])
{
int n=s1.length;
for(int i=0;i<n-1;i++)  // loop for passes of bubble sort    ...........for n elements n-1 passes
{
	for(int j=0;j<n-i-1;j++)  // n-i-1 for doing iterations from bubble element onwards
	{
		if(s1[j].length()>s1[j+1].length())
		{
			String  temp=s1[j];  //swapping
			s1[j]=s1[j+1];
			s1[j+1]=temp;
		}
		System.out.print("pass: "+i +" ");
		display(s1);
		System.out.println();
	}
	System.out.println("--------------------------------------");
}

}
static void display(String []s1)
{
	for(int j=0;j<s1.length;j++)
	{
		System.out.print(s1[j]+" ");
	}
}




}
