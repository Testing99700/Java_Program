package Practice;

public interface interface9
{
	//Que-why did java people permission to private methods in an interface
	//Ans-code re-usability

	//super interface
	//default method
	
	default void m1() 
	{
		m3();
	}
	default void m2() 
	{
		m3();
		System.out.println("Good Afternon");
		System.out.println("Good Night");
	}
	private void m3()
	{
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("Good Morning");
	}
}
