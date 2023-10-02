package Interface;

public interface Sample4
{
	//super interface
	//1.8 version
	//2015
	void m1();    //abstract public void m1();
	void m2();    //abstract public void m2();
	default void m3()
	{
		System.out.println("Good Luck");
	}
	default void m4()
	{
		System.out.println("Good progress");
	}
	//void m5();
	default void m5()
	{
		System.out.println("Good");
	}
	public static void m6()
	{
		System.out.println("Good Day");
	}
}
