package polymorphism;

public class test4 extends test3
{
	//method overriding
	//sub class
	//car() money() home()
	public void bike()                            //method declaration
	{
		System.out.println("Unicorn");            //method definition / implementation
	}
	
	//override method
	public void car()                            //method declaration
	{
		System.out.println("kia selton");        //method definition / implementation
	}
	public void money()                          //method declaration
	{
		System.out.println("2 lakhs");           //method definition / implementation
	}
	public void home()                           //method declaration
	{
		System.out.println("3 BHK");             //method definition / implementation
	}
	

}
