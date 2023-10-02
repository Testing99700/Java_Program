package Practice;

public class constructor1
{
	String cricketer;          //non-static global variable 
	int Runs;                  //non-static global variable
	
	constructor1(String c1,int r1)                 // user defined constructor 
	{
		this.cricketer=c1;
		this.Runs=r1;
		
		System.out.println(c1);
		System.out.println(r1);
	}
	public static void main(String[] args)
	{
		constructor1 p1=new constructor1("virat",100);
		constructor1 p2=new constructor1("rohhit",50);
		constructor1 p3=new constructor1("subhman",60);
	}

}
