package Logical_p.array;

import java.lang.reflect.Array;

public class Add_EvenNo 
{
	//1. Write a program to add only even elements in an array.
	
	//a  8  5  10  12  3  1  4
	//   0  1  2   3   4  5  6
	public static void main(String[] args)
	{	
		int[] a= {8,5,10,12,3,1,4};
		int sum=0;	
		
		for(int i=0; i<=a.length-1; i++)
		{		
			if(a[i]%2==0)
			{
				sum=sum+a[i];
				System.out.println("Even no."+a[i]);
			}
			else
			{
				System.out.println("Odd no."+a[i]);
			}
		}
		
			System.out.println("Sum Of Even No: "+sum);  //8+10+12+4=34
	}
}
