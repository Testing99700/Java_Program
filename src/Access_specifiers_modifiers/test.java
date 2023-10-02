package Access_specifiers_modifiers;

public class test 
{
	//private modifiers are ---->with in class means test2 class are correct access
	
	public static void main(String[] args) 
	{
	//create object Access_specifiers_modifiers 
		test2 t2=new test2();

	//call method                 ----------->fail method because private method not
	//	t2.m1();                             //call for another class
//-----------------------------------------------------------------------
	//create object Access_specifiers_modifiers 
		test3 t3=new test3();                      //Access
		
	//call method 
		t3.m1();
//-------------------------------------------------------------------------
	//create object Access_specifiers_modifiers 
		test4 t4= new test4();                      //Acess

		//call method
		//t4.m1();
		
	}	

}
