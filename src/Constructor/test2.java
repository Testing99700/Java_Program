package Constructor;

public class test2 
{
	//use 1-initialization of an object
	//Default constructor --->provided by compiler
	//test2  {  }
	
	public static void main(String[] args)
	{
		//step 1-create object
		test2 t2=new test2();    //test()--> default constructor
		
		//step 2-call method
		t2.multiplication();
	}
	public void multiplication() 
	{
		int a=20;
		int b=30;
		
		int mul =a*b;
		
		System.out.println(mul);
		
	}

}
