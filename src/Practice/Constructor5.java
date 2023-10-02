package Practice;

public class Constructor5
{
	//step 1-variable declaration
	int x;
	int y;
	//String studentname;
	
	
	//step 2- variable initialization
	Constructor5()
	{
		 x=30;
		 y=59;
	}
	
	//usage
	public void m1()
	{
		int add=x+y; //80
		System.out.println(add);
	}
	
	public static void main(String[] args)
	{
		//create object
		Constructor5 c1=new Constructor5();
		
		//call method
		c1.m1();
	}

}
