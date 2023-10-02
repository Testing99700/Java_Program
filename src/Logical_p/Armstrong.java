package Logical_p;

public class Armstrong 
{
	public static void main(String[] args)
	{
		int no=153;
		int rev=0;
		int rem=0;
		int temp=no;
		
		while(no != 0)
		{
			rem=no%10;
			rev=rev+(rem*rem*rem);
			no=no/10;
		}
		System.out.println(rev);
			if(temp==rev)
			{
				System.out.println("number is Armstrong");
			}
			else
			{
				System.out.println("number is not Armstrong");
			}
	}

}
