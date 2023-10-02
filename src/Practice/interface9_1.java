package Practice;

public class interface9_1 implements interface9
{
	//implements class
	//m1()   m2()
	
	public void m1()
	{
	//	interface9_1.super.m3();           //intrfaceName.super.methodNmae();
	}
	public void m() {
		// TODO Auto-generated method stub
		
	}
	public void m2()
	{
	//	interface9_1.super.m2();           //intrfaceName.super.methodNmae();
	}

	public static void main(String[] args)
	{
		interface9_1 t9=new interface9_1();
		t9.m1();
		t9.m2();
	}
}
