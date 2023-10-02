package Practice;

public class interface7 implements interface5
{
	//implements class-2
	//void m1();
	//void m2();
	/*default void m3()
	{
		
	}*/
	 public void m1()
	 {
		 System.out.println("Good morning");
	 }
	 public void m2()
	 {
		 System.out.println("Good Afternon");
	 }
	 public static void main(String[] args)
	 {
		 interface7 i7=new interface7();
		 i7.m1();
		 i7.m2();
		 i7.m3();
	 }
}
