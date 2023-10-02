package Methods;

public class Demo9
{
        // non static regular method call from same class
	public static void main (String[] args) 
	{
		//step-1 create object of same class
		Demo9 f1=new Demo9();      //classname objectname= New classname();
		
		//step-2 call the method 
		f1.R1();        //objectname.methodname();
		f1.R2();
	}
	// non static regular method
	public void R1()
	{
		System.out.println("non static regular method");
	}
	public void R2()
	{
		System.out.println("2nd method");
	}
}
