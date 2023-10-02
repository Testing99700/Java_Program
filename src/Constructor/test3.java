package Constructor;

public class test3 
{
	//use 1-initialization of an object
	//use 2-initialization of non-static global variable
	
	//step 1-variable declaration
	int a;
	int b;
	int add;
	
	//step 2- variable initialization
	test3()                          //user defined constructor
	{
		a=20;
		b=40;
	}
	  
	//step 3-usage
	public void addition()                  //non-static method -->call from same class
	{
		add=a+b;
        System.out.println(add);
	}
	public static void main(String[] args)
	{
		//step 1- create object
		   test3 t3=new test3();
		
		//step 2-call method
	   	   t3.addition();
	}

}
