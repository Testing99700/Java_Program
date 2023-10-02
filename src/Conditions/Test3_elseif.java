package Conditions;

public class Test3_elseif
{
	public static void main(String[] args)
	{
		int Marks=30;
		System.out.println("Sagar Marks:"+Marks);

		if(Marks>=65)
		{
			System.out.println("Distinction");
		}
		else if(Marks>=60)
		{
			System.out.println("First class");
		}
		else if(Marks>=55)
		{
			System.out.println("Higher Second Class");
		}
		else if(Marks>=50)
		{
			System.out.println("Second class");
		}
		else if(Marks>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}


}
