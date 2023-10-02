package Methods;

public class Demo10 
{
      // non static regular method call from different class
	public static void main(String[] args)
	{
		//step-1 create object of same class
		Demo10 L1=new Demo10();
		//step-2 call method 
		L1.s1();
		L1.s2();
		L1.s3();
	}
	//non-static regular method
	public void s1()
	{
		System.out.println("method s1 is runing from same class");
	}
	public void s2()
	{
		System.out.println("method s2 is runing from same class");
	}
	public void s3()
	{
		System.out.println("method s3 is runing from same class");
	}
}
