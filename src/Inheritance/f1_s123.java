package Inheritance;

public class f1_s123 
{
	//Hierarchical inheritance  father1 class all acquire properties son1,son2,son3 class
	
	public static void main(String[] args)
	{
		System.out.println("......father1 class ..........extends to son1,son2,son3................");
		System.out.println("...............son1................");
		
		//create object of son1 class		
		    son1 s1=new son1();	
    	//call methods
			s1.car();
			s1.money();
			s1.home();
			s1.mobile();
		
			System.out.println("...............son2................");
			
		//create object of son2 class
			son2 s2=new son2();
		//call method
			s2.car();
			s2.money();
			s2.home();
			s2.Bike();
			
			System.out.println("...............son3................");
			
		//create object of son3 class
			son3 s3=new son3();
		//call method
			s3.car();
			s3.money();
			s3.home();
			s3.laptop();		
	}

}
