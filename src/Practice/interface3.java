package Practice;

public interface interface3
{
	//1.8/1.9 enchancement 
	//java version 1.8--> default method + sttaic method
	//java version 1.9--> private method
	
	void m1();                   //abstract public void m1();
	
	public void m2();            //abstract public void m2();
	
	abstract void m3();         //abstract public void m3();
	
	abstract public void m4();  //abstract public void m4();
	
	//Default method
	default void m5()
	{
		m7();
		System.out.println("default method");
	}
	
	//static regular method
	public static void m6()
	{
		System.out.println("static method");
	}
	
	//main method
	public static void main(String[] args)
	{
		m6();
	}
	
	//private method
	private void m7()
	{
		System.out.println("private method");
	}
}
