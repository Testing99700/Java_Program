package Logical_p;

public class leap_year
{
	public static void main(String[] args)
	{
		int year=2002;
		if(year%4==0 && year%100 !=0 ||year%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Laep Year");
		}
	}
}
