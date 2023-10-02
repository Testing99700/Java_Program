package Conditions;

public class Test2_elseif
{
	//else_if multiple conditions
	public static void main(String[] args)
	{
		int Marks=68;
		
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
			System.out.println("Higher Second class");
		}
		else if(Marks>=50)
		{
			System.out.println("Second Class");
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
