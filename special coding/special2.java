import java.util.Scanner;
class special2{
    static public boolean capitalization(String word) {
        if(word.length() < 2) return true;
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(i))) return false;
            }
        }
        else{
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
}
        return true;
    }
    public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a String");
        String str=sc.next();
        System.out.println(capitalization(str));
    }
}
