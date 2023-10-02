package Program_Practice;

public class swapping 
{
	//Que =>write program for swapping of two numbers without using third variables
	
	public static void main(String[] args)
	{
		int n1;
		int n2;
		n1=10;
		n2=20;
		
		System.out.println("Before swapping n1:" +n1+ "  n2:"+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("After swapping n1:" +n1+ "  n2:"+n2);		
	}

}
