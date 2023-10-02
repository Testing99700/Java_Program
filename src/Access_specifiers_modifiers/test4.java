package Access_specifiers_modifiers;

//import Basic.Test;

public class test4
{
	//Access_specifiers_modifier ---->protected within package
	
	//protected -->package Access_specifiers_modifier -->class test //console output
		
	//protected -->package Basic -->class Test -->//can not visable compiler error show
	
	//protected -->package Basic -->class Test //console output because use in inheritance to "extends" keywords

	
	protected void z1()
	{
		System.out.println("protected modifiers");
	}
}
