package Interface;

public class Sample3_1 implements Sample3
{
	public void m1()           //abstract public void m1();
	{
		System.out.println("m1");
	}
	public void m2()    //abstract public void m2();
	{
		System.out.println("m2");
	}
	public void m3()  //abstract public void m3();
	{
		System.out.println("m3");
	}
	public void m4()  //abstract public void m4();
	{
		System.out.println("m4");
	}
	public static void main(String[] args)
	{
		Sample3.m6();            //Static method
		Sample3_1 s3=new Sample3_1();
		s3.m1();
		s3.m2();
		s3.m3();
		s3.m4();
		s3.m5();            //default method
		
	}

}
