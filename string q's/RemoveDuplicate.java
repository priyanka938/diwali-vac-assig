import java.util.*;
class RemoveDuplicate

{
	static String str;
	//static char str1[]=str.toCharArray();
static int n=str.length();
	
public static void main(String args[]) throws NullPointerException
{
//String str;
System.out.println("enter string:");
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
char str1[]=str.toCharArray();
//int n=str.length();
System.out.println(removeDuplicate(str1,n));
}
static String removeDuplicate(char str1[], int n)

{
int index = 0;
  
        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {
  
            // Check if str[i] is present before it 
            int j;
            for (j = 0; j < i; j++) 
            {
                if (str1[i] == str1[j])
                {
                    break;
                }
            }
			// If not present, then add it to
            // result.
            if (j == i) 
            {
                str1[index++] = str1[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str1, index));
    
}
}