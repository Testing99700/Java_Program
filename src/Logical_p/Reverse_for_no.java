package Logical_p;

public class Reverse_for_no 
{
	 public static void main(String[] args) 
	    {
	        int n=1234;
	        int rev=0;
	        int rem=0;
	        for(int i=1; i<=4; i++)
	        {
	            rem=n%10;
	            rev=rev*10+rem;
	            n=n/10;
	        }
	      System.out.println(rev);
	    }
	}


