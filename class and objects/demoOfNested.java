//  instance inner class
class instanceInner
{
class inner{   //  instance inner class
void display(){
	System.out.println("this is method from inner class");}
}

void show()
{
inner in1=new inner();
in1.display();
}
}
public class demoOfNested
{
public static void main(String args[])
{
instanceInner  obj1=new instanceInner();
obj1.show();
}
}