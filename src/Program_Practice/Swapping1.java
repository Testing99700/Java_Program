package Program_Practice;

public class Swapping1 
{
	//Que =>write program for swapping of two numbers with using third variables
	public static void main(String[] args)
	{
		int n1;
		int n2;
		int n3;//null
		
		n1=10;
		n2=20;
		
		System.out.println("Before swapping n1:" +n1+ " n2:" +n2);
		
		n3=n1;  //n3=10
		n1=n2;   //n1=20
		n2=n3;  //n2=10
		
		System.out.println("After swapping n1:" +n1+ " n2:" +n2);
	}
}
