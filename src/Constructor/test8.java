package Constructor;

public class test8
{
	//String Sname="Rahul";
	//char Sgarde='A';
	
	//calling constructor
	
	test8()
	{
		this(10);		
	}
	test8(int a)
	{
		this("Rahul");
		System.out.println(a);
	}
	test8(String Sname)
	{	
		this('A');
		System.out.println(Sname);
	}
	test8(char sgrade)
	{
		System.out.println(sgrade);
	}
	
	public static void main(String[] args)
	{
		test8 t8=new test8();
	}
	
}
