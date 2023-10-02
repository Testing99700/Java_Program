package Types_variable;

public class test8
{
	int a=40;              //non-static global variable
	public static void main(String[] args)
	{
		//step 1-craete object
		test8 s1 = new test8();      //classname objectname = new calssname();
		//step 2-call method
		System.out.println(s1.a);    //objectname.variablename;
	}
	public static void n1()
	{
		//step 1-craete object
				test8 s2 = new test8();      //classname objectname = new calssname();
				//step 2-call method
				System.out.println(s2.a);    //objectname.variablename;
	}
	public void n2()
	{
		System.out.println(a);
	}

}
