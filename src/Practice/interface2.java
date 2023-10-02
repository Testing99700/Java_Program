package Practice;

public class interface2 implements interface1
{
	//1.7 version
	//implementation class
	//final public static int a=10;
	//abstract public void m1();
	//abstract  public void m2();
	
	public void m1()                      //method declaration
	{
		System.out.println("Hi");         //method definition/implementation
	}
	public void m2()                     //method declaration
	{
		System.out.println("Hello");     //method definition/implementation
	}
	public static void main(String[] args)
	{
		interface2 i2=new interface2();
		i2.m1();
		i2.m2();
	}

}
