package DailyMockSessions;

public class Sample3 
{
	public static void main (String[] args)
	{
		addition();
		addition();
		addition(60,70);
		addition(50,90);
		
	}
	//static regular method ....>zero parameters
	public static void addition()
	{
		int a=30;
		int b=80;
		int c=a+b;//110
		System.out.println(c);
	}
	//static regular method ...>with parameters
	public static void addition(int c,int d)
	{
		int sum2=c+d;
		System.out.println(sum2);

	}

}
