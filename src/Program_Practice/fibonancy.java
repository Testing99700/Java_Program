package Program_Practice;

public class fibonancy 
{
	//Que=> write program for fibonancy series
	
	public static void main(String[] args)
	{
		int n1=0;
		int n2=1;
		int n3,i,count=10;
		
		System.out.println(n1+" "+n2);    //print 0 to 1
		
		for(i=2; i<=10; i++)
		{
			n3=n1+n2;
			
			System.out.print("  "+n3);
			
			n1=n2;
			n2=n3;
		}
		
	}

}
