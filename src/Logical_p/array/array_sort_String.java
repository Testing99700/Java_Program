package Logical_p.array;

import java.util.Arrays;

public class array_sort_String 
{
	public static void main(String[] args)
	{
		//array declaration
		char a[] =new char [5];
		
		//array initialization
		a[0]='D';
		a[1]='B';
		a[2]='A';
		a[3]='E';
		a[4]='C';
		
		//Ascending order
		Arrays.sort(a);
		
		//usage
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}
}
