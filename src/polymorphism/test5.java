package polymorphism;

public class test5
{
	//method overriding
	//super class
	public static void main(String[] args)
	{
		//create object of test3 (father) class
		test3 t3=new test3();
		t3.car();
		t3.money();
		t3.home();
		
		System.out.println("...................................");
		
		//create object of test4 (son) class
		test4 t4=new test4();
		t4.bike();
		t4.car();
		t4.money();
		t4.home();
	}

}
