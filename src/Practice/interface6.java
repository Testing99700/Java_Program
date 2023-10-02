package Practice;

public class interface6 implements interface5 
{
	//super class
	//implementation class-1
	//void m1();
	//void m2();
	/*default void m3()
	{
		
	}*/
	public void m1()
	{
		System.out.println("Hi");
	}
	public void m2()
	{
		System.out.println("Hello");
	}
	
	 public static void main(String[] args)
	 {
		 interface6 i6=new interface6();
		 i6.m1();
		 i6.m2();
		 i6.m3();
	 }	 
}