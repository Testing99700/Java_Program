package DailyMockSessions;

public class test8 {

	//static regular method with parameters
	public static void main(String[] args)
	{
	//static regular method call same class
		   Addition(20,40,80,"Rahul");                  //methodname();
		   
	//non-static regular method call diff class	   
		   //step-1 create object
		    test9 b1= new test9();        //classname objectname=new classname();
		   //step-2 call method
		    b1.n1(50,70);                  //objectname.methodname();
    //static regular method call from same class
		    b1.n3(30, 20);
		    
	}
	public static void Addition(int a,int b,int c,String d)
	{
		int sum1=a+b+c;
		System.out.println(d);

		System.out.println(sum1);
	}
	
}
