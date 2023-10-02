package DailyMockSessions;

public class test_1
{
	//step 1-variable declaration
	int A;
	String studentname;
	//step 2-varible initialization
	test_1()
	{
		A=10;
		
	}
	test_1(String sn)
	{
		studentname=sn;
	}
	//step 3-usage
	public void m1()
	{
		System.out.println(studentname);
		System.out.println(A);
	}
	
	public static void main(String[] args)
	{
		//create object
		test_1 t1=new test_1("Rahul");
		//call method
		t1.m1();
	}

}
