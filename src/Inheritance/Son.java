package Inheritance;

public class Son extends father

//single level inheritance example

{
	//sub-class/child class
	//car() money() Home()
	
	public void Mobile()
	{
		System.out.println("Samsung A50");
	}
	public static void main(String[] args)
	{
		//create object of son class
		
		Son s1=new Son();
		
		s1.car();
		s1.money();
		s1.home();
		s1.Mobile();
	}

}
