package Practice;

public class nested1
{
	public static void main(String[] args)
	{
		String UN="abc";
		String PSW="xyz";
		
		if("abc"==UN)
		{
			System.out.println("correct UN");
		
			if("xyz1"==PSW)
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
			System.out.println("Incorrcet UN");
		}
	 }
}
