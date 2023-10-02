package Practice;

public class M6 
{
	//non-static regular method call from same class
	public static void main(String[] args)
	{
		//call method non-static
		//step-1 create object
		         M6 n1=new M6();               //classname objectname=new classname();
		//step-2 call method
		         n1.s1();//objectname.methodname();
	}
	//non-static regular method
	public void s1()
	{
		System.out.println("good progress");
	}

}
