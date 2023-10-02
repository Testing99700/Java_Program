package Interface;

public class Sample2 implements Sample1
{

	@Override
	//implementation class
	//final public static int a=10;
	//abstract public void m1();
	//abstract public void m2();
	
	public void m1()                     //method declaration
	{
		System.out.println("Hi");        //method definition/implementation
	}

	@Override
	public void m2()                     //method declaration
	{
		System.out.println("Hello");     //method definition/implementation
	}
	
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		s2.m1();
		s2.m2();
	}
	

}
