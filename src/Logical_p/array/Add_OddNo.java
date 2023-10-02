package Logical_p.array;

public class Add_OddNo 
{
	//1. Write a program to add only odd elements in an array.
	
		//a  8  5  10  12  3  1  4
		//   0  1  2   3   4  5  6
	public static void main(String[] args)
	{
		int sum=0;
		int[] b= {8,5,10,12,3,1,4};
		for(int i=0 ; i<=b.length-1; i++)
		{
			if(b[i]%2 != 0)
			{
				sum=sum+b[i];
				System.out.println("Even no."+b[i]);
			}
			else
			{
				System.out.println("Odd no."+b[i]);
			}
		}
		System.out.println("Add Odd No: "+sum);  //5+3+1=9
	}

}
