package Practice;
public class M7
{
	//non-static regular method call from same class
	public static void main(String[] args)
	{
		//call method same class 
		//step-1 create object
		       M7 n2=new M7();                  //classname objectname=new classname();
		//step-2 call object
		       n2.s2();                   //objectname.methodname();
		       n2.s3();
		       n2.s4();
	}
	//non-static regular method 
	public void s2()
	{
		System.out.println("method s2 is running from same class");
	}
	public void s3()
	{
		System.out.println("method s3 is running from same class");
	}
	public void s4()
	{
		System.out.println("method s4 is running from same class");
	}

}
