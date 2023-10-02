package Interface;

public class Test9 implements Version_9
{
	//implementation class
	//m1()   m2()
	
	public void m1()
	{
		Version_9.super.m1();            //interfaceName.super.methodName();
		System.out.println("Good Day");
	}
	public void m2()
	{
		Version_9.super.m2();         	//interfaceNmae.super.methodName();
	}
	public static void main(String[] args)
	{
		System.out.println("...................M1();.......................");
		Test9 T9=new Test9();
		T9.m1();
		System.out.println("...................M2();.......................");
		T9.m2();
	}

}
