
//12. Given a string, s, return the total number of substring within s that contain the same character. Note: You may assume that s only contains lowercase alphabetical characters. Ex: Given the following string s… s = "aabca", return 6 ("a" appears 3 times, "aa" appears 1 time, "b" appears 1 time, and "c" appears 1 time).

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(numberOfSubstrings(str));
    }
    public static  int numberOfSubstrings(String s) {
        int count[] = {0, 0, 0}, res = 0 , i = 0, n = s.length();
        for (int j = 0; j < n; ++j) {
            ++count[s.charAt(j) - 'a'];
            while (count[0] > 0 && count[1] > 0 && count[2] > 0)
                --count[s.charAt(i++) - 'a'];
            res += i;
        }
        return res;
    }
}



