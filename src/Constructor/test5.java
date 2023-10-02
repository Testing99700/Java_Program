package Constructor;

public class test5
{
	char Grade;
	String Name;
	test5(char x,String y)
	{
		Grade=x;
		Name=y;
	}
	public void m1()
	{
		System.out.print(Grade);
		System.out.println(Name);
	}
	
	public static void main(String[] args)
	{
		test5 t5=new test5('A', "Rahul");
		t5.m1();		
	}

}
