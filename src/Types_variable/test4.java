package Types_variable;

public class test4 
{
	
	//Non-static global variable call from same class
	
	int c= 30;
	
	public static void main (String[] args)
	{
		//step 1-create object 
		test4 s1= new test4();      //classname objectname=new classname();
		
		//step 2-call variable
		System.out.println(s1.c);   //objectname.variablename;
	}
	public static void m1()
	{
		
	}

	

}
