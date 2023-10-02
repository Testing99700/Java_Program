package Practice;

public class Constructor7 
{
	//step 1-variable declaration
	float marks;
	
	//step 2-varaible initialization
	Constructor7(float ms)
	{
		marks=ms;
	}
	
	//usage 
	public void m1()
	{
		//System.out.println(ms);
	}
	
	public static void main(String args)
	{
		//craete objectc 
		Constructor7 c2=new Constructor7(70.25f);
		//call method 
		c2.m1();
	}

}
