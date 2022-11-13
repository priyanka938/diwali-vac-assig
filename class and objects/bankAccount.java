class bankAccount
{

static float balance=9000;


  static class interest
{
	int accno=101;
String name="priya";
String acctype="savings";

void calcIntrest()
{
float amount=(float)(0.02*balance);
float sum=amount+balance;
System.out.println("intrest amount per year :"+amount);
System.out.println("final amount with interest :"+sum);
}

void show()
{
	System.out.println("account number is:"+accno);
	System.out.println("name :"+name);
	
	System.out.println("accounrt type is:"+acctype);
	System.out.println("accounrt type is:"+balance);
	
	
}

}

public static void main(String args[])
{
bankAccount.interest itr1=new bankAccount.interest();
itr1.show();
itr1.calcIntrest();
}
}