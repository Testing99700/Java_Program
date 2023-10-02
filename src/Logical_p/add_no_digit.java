package Logical_p;

public class add_no_digit
{
	public static void main(String[] args)
	{
		int no=12345;  // 1+2+3+4+5=15
		int rev=0;
		int rem=0;
		
		while(no != 0)  //!= not equal
		{
			rem=no%10; // %=module
			rev=rev+rem;  //reverse=*10 , palindrome+(rem*rem*rem),    
			no=no/10;
		}
		System.out.println(rev);
	}
}
