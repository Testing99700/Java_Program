package Loops;

public class Test1
{
	public static void main (String[] args)
	{
		//print 1,2,3,4,5
		
		//i=1 1<=5 i=2 //1+1
		//i=2 2<=5 i=3 //2+1
		//i=3 3<=5 i=4 //3+1
		//i=4 4<=5 i=5 //4+1
		//i=5 5<=5 i=6 //5+1
		//i=6 6<=5 ------------------------>false
		//for (Starting codition; End codition; increment/Decrement)
		for(int i=1; i<=100; i=i+2 )
		{
			System.out.println(i);
		}
	}

}
