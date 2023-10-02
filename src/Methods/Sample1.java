package Methods;

public class Sample1 
{
	public static void main(String[] args)
	{
		//1-static regular method call from same class
		       B1();           //methodname();
		       
		//2-non-static regular method call from same class
		       //step-1 create object same class
		       Sample1 m1=new Sample1(); 
		       //step-2 call the method
		       m1.B2();
		       
		//3-static regular method call from diff class
              Sample2.B3(); //classname.methodname()
              
        //4-non-static regular method call from diff class
               //step-1 create object diff class
                  Sample2 m2=new Sample2();     // classname objectname=new calssname();
              //step-2 call the method
                  m2.B4();
              
	}
    //static regular method
	public static void B1()
	{
		System.out.println("method B1 is running from same class");
	}
	
	//non-static regular method
	public void B2()
	{
		System.out.println("method B2 is running from same class");
	}
}
