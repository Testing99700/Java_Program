package Methods;

public class Demo3 
{
	//1.static regular method call from same class
	public static void main(String[] args) 
	{
		m1();   // methodName();		
		m2();   //methodName();
	}	
	    //static regular method
	    public static void m1() 
	    {
		    System.out.println("Hi");
    	}	
	    //static regular method
		public static void m2() 
		{
			System.out.println("Hello");
		}
}
