package Practice;

public class constructor3 
{
	//Initializations of an object
	//Default constructor--->provided by compiler
	//constructor3  {  }
	
	public static void main(String[] args)
	{
		//step 1-create object for same class
		constructor3 n1=new constructor3();
		
		//step 2-call for method
		n1.multiplication();
	}
	public void multiplication()
	{
		int a=10;
		int b=20;
		
		int multivalue =a*b;
		
		System.out.println(multivalue);
	}

}
