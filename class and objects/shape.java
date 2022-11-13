//interface program implementation

interface twoD
{
public void rectangle();
}
interface  threeD extends twoD
{
void cube();
}

class shape implements threeD
{
// this class will have to implement three methods fun1,fun2,fun3
int len=5,br=6;
float area=0;
public void rectangle()
{
area=len*br;
System.out.println("area of rectangle:"+area);
System.out.println("interface 2D");
}
 public void cube()
{
	float area1=len*len*len;
	System.out.println("area of cube:"+area1);
	System.out.println("interface 3D");
}
public static void main(String args[])
{
shape s=new shape();
s.rectangle();
s.cube();
}

}
