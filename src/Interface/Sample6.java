package Interface;

public class Sample6 implements Sample4
{
	//2023
	//Implementation Class-II
    //void m1();  //abstract public void m1();
    //void m2();  //abstract public void m2();
	//default void m3() {  }
			
		public void m1() 
		{
			System.out.println("good Morning");
		}
		
		public void m2() 
		{
			System.out.println("good Afternoon");
		}
		public static void main(String[] args)
		{
			Sample6 s6=new Sample6();
			s6.m1();
			s6.m2();
			s6.m3();
			s6.m4();
			s6.m5();
			
			
		}
}
