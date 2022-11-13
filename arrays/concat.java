class concat
{
public static void main(String args[])
{
int left[]={2,4,6,7,8};
int right[]={7,6,5,4};
int arr[]=new int[9];


//merge two arrays
int i=0,j=0;
int k=0;

while(i<5 && j<4)
{
	if(left[i]<=right[j])
	{
		arr[k]=left[i];
		i++;
	}
	else
	{
	arr[k]=right[j];
	j++;
	}
k++;
}
//copy remaining elelements of left[] if any

while(i<5)
{
arr[k]=left[i];
i++;
k++;
}

while(j<4)
{
arr[k]=right[j];
j++;
k++;
}

for( i=0;i<9;i++)
{
	System.out.println(arr[i]+" ");
}
}
}