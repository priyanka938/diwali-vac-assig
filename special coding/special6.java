import java.util.Scanner;

// 6. Given an array of strings, return the longest common prefix that is shared amongst all strings
import java.util.Scanner;
public class special6 {

    static public String longestCommonPrefix(String[] arr) {
        if(arr.length<=0)   return "";
        String str=arr[0];
        
        for(int i=1;i<arr.length;i++){
            int j=0;
            for(j=0;j<str.length() && j<arr[i].length();j++){
                if(str.charAt(j)==arr[i].charAt(j)){
                    continue;
                }else{
                    break;
                }
            }
             str=str.substring(0,j);
        }
		System.out.println("common prefix is:");
        return str;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("how many strings you will enter");
        int n=sc.nextInt();
        String[] arr=new String[n];
		System.out.println("enter strings with some charactes common i will give u longest common string:");
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        System.out.println(longestCommonPrefix(arr));
    }
}
