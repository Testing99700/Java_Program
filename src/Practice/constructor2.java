package Practice;

public class constructor2 
{
	
	String a;            //non-static global variable
	int b;               //non-static global variable
	
	constructor2 ( String A1,int B1 )
	{
		this.a=A1;
		this.b=B1;
		
		System.out.println(A1);
		System.out.println(B1);
	}
	
	public static void main(String[] args)
	{
		constructor2 u1=new constructor2("Rahul",100);
		constructor2 u2=new constructor2("virat",70);
		constructor2 u3=new constructor2("Rohit",80);
	}


}
