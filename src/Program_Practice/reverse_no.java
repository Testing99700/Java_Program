package Program_Practice;

public class reverse_no 
{
	//Que=> write progarm to reverse a number
	
	public static void main(String[] args)
	{
		int n=12345;
	    int reverse =0;
		
	    for(;n!=0 ; n=n/10)
	    {
	    	int reminder = n % 10;
	    	reverse = reverse * 10 + reminder;
	    }
	    System.out.println("The reverse * 10 + reminder: "+reverse);
	}

}
