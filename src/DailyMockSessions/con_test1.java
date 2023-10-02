package DailyMockSessions;

public class con_test1
{
	char Grade;
	con_test1(char x)
	{
		Grade=x;
		
	}
	public void m1()
	{
		System.out.println(Grade);
	}
	public static void main(String [] args)
	{
		con_test1 c1=new con_test1('A');
	
		c1.m1();
	}
	
}
