package Logical_p;

public class fibonancy_series 
{
	public static void main(String[] args)
	{
		int no=10;
		int x=0;
		int y=1;
		int z=0;
		
		for(int i=1; i<=10; i++)
		{
			x=y;
			y=z;
			z=x+y;
			System.out.println(z);			
		}
	}

}
