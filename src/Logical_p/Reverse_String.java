package Logical_p;

public class Reverse_String 
{
	public static void main(String[] args)
	{
		String name="rahul";      //r a h u l
		String rev="";		      //0 1 2 3 4
		
		int a=name.length();
		
		for(int i=a-1; i>=0; i--)
		{
	       rev = rev+name.charAt(i);	    
		}
		System.out.println(name+"  "+ rev);
	}
}
