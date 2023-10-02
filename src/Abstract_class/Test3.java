package Abstract_class;

import polymorphism.test6;

public class Test3 extends Test2
{
	//concrete class
	//sub class
	//m1() m2() m3() m4()
	//complete method
	public void  m3()                                 //method declaration        
	{
		System.out.println("Good Morning");           //method definition/implements
	}
	//complete method
	public void m4()                                  //method declaration
	{
		System.out.println("Good Afternon");           //method definition/implements
	}
	
	public static void main(String[] args)
	{
		//create object
		Test3 T3= new Test3();
		T3.m1();     //already complete method
		T3.m2();     //already complete method
		T3.m3();     //current class complete method
		T3.m4();     //current class complete method
		
		test6 t6=new test6();
		
		t6.car();    //car method another class access to public modifiers use access project
	}
}
