package Interface;

public interface Version_9 
{
	//super interface
	
	//Default method
	default void m1()
	{
		m3();
	}
	//Default method
	default void m2()
	{
		m3();
		System.out.println("Good Afternon");
		System.out.println("Good Night");
	}
	//private method
	private void m3()
	{
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Good morning");
	}

}
