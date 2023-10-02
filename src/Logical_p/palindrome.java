package Logical_p;

public class palindrome 
{
	public static void main(String[] args)
	{
		int no=12321;
		int rev=0;
		int rem=0;
		int temp=no;
		
		while(no != 0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}
	}
}
