package Conditions;

public class Nested
{
	public static void main(String [] args)
	{
		String UN="abc";
		String PSW ="xyz";
		
		if("abc"==UN) //abc==abc-->true
			          //xyz==xyz1-->false
		{
			System.out.println("Correct UN");
		
			if("xyz1"==PSW)  //xyz==xyz-->true
			{
				System.out.println("Correct PSW");
			}
			else
				{
				System.out.println("Incorrect PSW");	
				}
		}
			else
			{
				System.out.println("INCorrect UN");
			}
	}
}
		
		
		
	


