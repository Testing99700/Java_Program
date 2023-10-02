package This_Super_Keyword;

public class test1 extends test2
{
	int a=20;
	int b=30;
	public void m1()
	{
	int a=10;	
		System.out.println(a);  //10
		System.out.println(a);  //10
		System.out.println(this.a);   //20
		System.out.println(b);  //30
		System.out.println(this.b);  //30
		System.out.println(this.a);  //20
		System.out.println(super.a);   //40
	}
	public static void main(String[] args)
		{
			test1 t1=new test1();
			t1.m1();
	    }

}
