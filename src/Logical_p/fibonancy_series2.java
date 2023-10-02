package Logical_p;

public class fibonancy_series2 
{
	public static void main(String[] args)
	{
		int no=10;
		int x=0;
		int y=1;
		int z=0;
		
		while(z<=no)
		{
			x=y;
			y=z;
			z=x+y;
			System.out.println(z);
		}
	}

}
