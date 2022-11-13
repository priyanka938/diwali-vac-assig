//Stringg characters of the longer string at the end of the merged string. s = "abc", t = "def", return "adbecf"

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(mergeAlternately(s1, s2));
    }
    public static String mergeAlternately(String w1, String w2) {
        int n = w1.length(), m = w2.length(), i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while (i < n || j < m) {
            if (i < w1.length())
                res.append(w1.charAt(i++));
            if (j < w2.length())
                res.append(w2.charAt(j++));
        }
        return res.toString();
    }
}

