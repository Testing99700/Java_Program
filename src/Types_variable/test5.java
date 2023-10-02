package Types_variable;

public class test5
{
	//Non-static global variable call from diff/another class
	
	public static void main(String[] args)
	{
		//step1- craete object
		test6 s2=new test6();   //classname.objectname=new classname();
		
		//step2- call variable
		System.out.println(s2.d);    //objectname.variablename;
		
	}
	

}
