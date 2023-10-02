package Practice;

import java.util.Scanner;

public class scanner 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter Num2:");
		int num2=sc.nextInt();
		
		System.out.println(num1*num2);
	}

}
