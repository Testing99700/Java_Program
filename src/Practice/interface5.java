package Practice;

public interface interface5
{
	//super interface
	
	void m1();                 //abstract public void m1();
	
	void m2();                 //abstract public void m1();

	default void m3()
    {
		System.out.println("Default method add interface");
	}
}
