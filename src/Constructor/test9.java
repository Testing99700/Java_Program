package Constructor;

public class test9 
{	
	//constructor chaining	
	test9()
	{
		this(10);               // with parameter calling zero parameter
	}
	test9(int a)
	{
		this("virat");
		System.out.println(a);
	}
	test9(String Sname)
	{
		this('A');
		System.out.println(Sname);

	}
	test9(char x)
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		test9 t9=new test9();
	}
	

}
