package Casting;

public class Implicit 
{
	//implicit casting
	
	public static void main(String[] args)
	{
		int a=5;                //4 byte
		System.out.println(a);  //5
		
		double b=a;             //8 byte
		System.out.println(b);  //5.0
	}

}
