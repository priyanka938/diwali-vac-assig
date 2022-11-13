/*. Write a program to implement a class “student” with the following members. Name of the student. Marks of the 
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to 
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning 
of the above. */
import java.util.*;
class student{
String name;
int marks[]=new int[3];
Scanner sc=new Scanner(System.in);
/*void details(String name,int marks)
{
this.name=name;
this.marks=marks;
}*/
void getDetails()
{
	
System.out.println("enter name");
name=sc.next();
System.out.println("enter marks of 3 subject");
for(int i=0;i<3;i++)
{
	marks[i]=sc.nextInt();
	System.out.println(marks[i]);
}
}
void avg()
{
int sum=0,avg;
for(int i=0;i<3;i++)
{
sum=sum+marks[i];

}
avg=sum/3;
System.out.println(avg);
}



}

class averageCalc
{
public static void main()
{
student s=new student();
//s.details("abc",0);
s.getDetails();
s.avg();
}
}