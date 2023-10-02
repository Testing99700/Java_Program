package Loops;

public class dowhile 
{
	//do while loop print 1 to 5
	public static void main(String [] args)
	{
		int i = 1;              //starting condition
		
		do
		{
			System.out.println(i);
			
			i=i+1;            //increment
		}
		while (i<=5);         //end condition
	}

}
