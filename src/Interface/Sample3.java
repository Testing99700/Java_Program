package Interface;

public interface Sample3 
{
	 //e.g interface of java 1.8/1.9 version
    //Version 1.8/1.9 Enhancement
    //Java Version 1.8-->default method + static Method
    // Java Version 1.9-->private method
	
	void m1();           //abstract public void m1();
	public void m2();    //abstract public void m2();
	abstract void m3();  //abstract public void m3();
	abstract public void m4();  //abstract public void m4();
	
	  //default method 
	default void m5()
	{
		System.out.println("Hi");
		m7();
	}
	//static regular method
	public static void m6()
	{
		System.out.println("Hello");
	}
	
	//private method
	private void m7()
	{
		System.out.println("Good Afternon");
	}
	

}
