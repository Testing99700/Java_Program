package polymorphism;

public class test2 
{
	//method overloading
	//completime polymorphism: method defination / implementation
	//method declaration + method definition / implementation = compile time
	
	public void m1()                                  //method Declarartion
	{
		System.out.println("Hi");                    //method definition/implementation
	}
	public void m1(int a)                            //method Declarartion
	{
		System.out.println("Good morning");         //method definition/implementation
	}
	public void m1(String sname)                    //method Declarartion
	{
		System.out.println("Good Afternon");       //method definition/implementation
	}
	public void m1(char x)                         //method Declarartion
	{
		System.out.println("Hello");               //method definition/implementation
	}
	public void m1(int z, int y)                   //method Declarartion
	{
		System.out.println("Good luck");           //method definition/implementation
	}
	public static void main(String[] args)
	{
		test2 t2=new test2();
		t2.m1();
		t2.m1(10);
		t2.m1("Rahul");
		t2.m1('A');
		t2.m1(1,2);
	}

}
