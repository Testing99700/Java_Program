package Constructor;

public class test7
{
	//method vs constructor
	
	test7()                  //do not call the constructor in main method
	{                        //Constructor is not return type 
		System.out.println("Have a nice day");      
	}
	
	public void m1()        //method is call in main method
	{                       //method return type
		System.out.println("Good day");
	}
	
	public static void main(String[] args)
	{
		test7 t7=new test7();
	}

}
