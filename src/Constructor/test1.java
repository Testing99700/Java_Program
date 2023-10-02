package Constructor;

public class test1
{
	//constructor
	
	String cricketer;
	int Runs;
	
	test1(String C1,int R1)
	{
		this.cricketer=C1;
		this.Runs=R1;
		
		System.out.println(C1);
		System.out.println(R1);
	}
	public static void main(String [] args)
	{
		test1 p1=new test1("virat",100);      //classname objectname=new calssname();
		test1 p2=new test1("Rohit",50);
		test1 p3=new test1("Subhman",60);
	}

}
