package Practice;

public class constructor4
{
	//use 1- initialization of an object
	//use 2-initialization of non-static global variable
	
	//step 1-variable declaration
			int a;           //non-static global variable
			int b;           //non-static global variable
			
	//step 2-variable initialization
	constructor4()
	{
			a=20;
			b=30;
		}
	//step 3-usage
	public void addition()
	{
			int sum1=a+b;
			System.out.println(sum1);
	}
	public static void main(String[] args)
	{
		//create object
		constructor4 n1=new constructor4();
		
		//call method
		n1.addition();
	}
}
