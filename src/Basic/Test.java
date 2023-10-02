package Basic;

import Access_specifiers_modifiers.test;
import Access_specifiers_modifiers.test1;
import Access_specifiers_modifiers.test3;
import Access_specifiers_modifiers.test4;

public class Test extends test4
{
	//"public" Access_specifiers_modifiers 
	
	public static void main(String[] args)
	{
		//create object in--> Access_specifiers_modifier package-->test1 class
		
		    test1 t1=new test1();
		
		//call method
		
		    t1.m1();
		    
//-------------------------------------------------------------------------
		//create object "deafault" Access_specifiers_modifier package-->test3 class
		    
		    test3 t3= new test3();        //test3 cannot be resolved to type with in another package
		   // t3.
//----------------------------------------------------------------------
		//create object "protected" Access_specifiers_modifiers package -->test4 class
			test4 t4= new test4();

	   //call method
			//t4.z1();                      //test4 can not visible in pacakge
//----------------------------------------------------------------------
	   //create object "protected" Access_specifiers_modifiers package -->test4 class
			test4 t5= new test4();

      //call method
			//t5.m1();  			// test4 inheritance "extends" class Test protcted
	}
}
