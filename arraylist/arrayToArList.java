import java.util.*;
 
class arrayToArList
{
    public static void main (String[] args)
    {
        String[] geeks = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        // Conversion of array to ArrayList
        // using Arrays.asList
        List al = Arrays.asList(geeks);
 
        System.out.println(al);
    }
}