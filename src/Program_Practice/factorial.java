package Program_Practice;

public class factorial 
{
	//Que=> write a program for factorial of five
	//5*4*3*2*1=120 factorial value
	
	public static void main(String[] args)
	{
		
		int fact=1;    //starting condition
		int n=5;       //ending condition
		
		for (int i=1; i<=5; i++)     // 0<=1   1      1<=2    2    2<=
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of " +n+ " is: " +fact);
	}

}
