package Practice;

public class Constructor6
{
	//step 1-variable declearation
		String Employeename;              //non-static global variable
	
	//step 2-variable initialization
		Constructor6(String emp)
		{
			Employeename=emp;
		}
		
	//usage
	public void m2()
	{
		System.out.println(Employeename);
	}
		
	public static void main(String[] args)
	{
		//create object
		Constructor6 c1=new Constructor6("Rahul");
		//call method
		c1.m2();
	}

}
