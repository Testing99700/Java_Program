package Methods;

public class Sample3
{
	public static void main(String[] args)
	{
		addition();                  //call method without parameters
		addition( 30, 60) ;          //call method with parameters
		addition( 50, 80) ;          //call method with parameters
		addition( 35, 70) ;          //call method with parameters
	}
	
	//without parameters method
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;     //10+20
		System.out.println(sum);
	}
	
	//with parameters method
	public static void addition(int c,int d) 
	{
		int sum1 = c+d;
				System.out.println(sum1);
	}

}
