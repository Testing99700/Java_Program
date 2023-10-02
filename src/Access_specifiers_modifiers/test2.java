package Access_specifiers_modifiers;

public class test2 
{
	//Access_specifiers_modifier ---->private within class
	
	//private --> package Access_specifiers_modifier -->class test //compiler error show
	
	//same class are output is show
	
	private void m1()             //non-static method
	{
		System.out.println("private modifiers");
	}
	public static void main(String[] args)
	{
		//create object Access_specifiers_modifiers 
			test2 t2=new test2();
		
		//call method
			t2.m1();
	}

}
