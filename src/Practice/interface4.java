package Practice;

public class interface4 implements interface3 
{
    public void m1()                   //abstract public void m1();
    {
    	System.out.println("m1");
    }
	public void m2()                   //abstract public void m2();
	{
		System.out.println("m2");
	}
	public void m3()                  //abstract public void m3(); //remove 'abstract' keywords
	{
		System.out.println("m3");
	}
	public void m4()                  //abstract public void m4();//remove 'abstract' keywords
	{
		System.out.println("m4");
	}
	
	public static void main(String[] args)
	{
		interface4 i4=new interface4();
		i4.m1();
		i4.m2();
		i4.m3();
		i4.m4();
		i4.m5();
	}
}
