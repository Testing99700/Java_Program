package Logical_p.array;

import java.util.Arrays;

public class array_sort_no 
{             
	//0 1 2 3 4 5 6 7
	//int a[] ={1,5,3,2,7,4,8,6}
	public static void main(String[] args)
	{
		//array declaration
		int a[]=new int[8];
		//array initialization
		a[0]=1;
		a[1]=5;
		a[2]=3;
		a[3]=2;
		a[4]=7;
		a[5]=4;
		a[6]=8;
		a[7]=6;
		
		//ascending order
		Arrays.sort(a);
		
		//usage
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
