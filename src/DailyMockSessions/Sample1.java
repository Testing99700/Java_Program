package DailyMockSessions;

public class Sample1 
{
	public static void main(String[] args)
	{
		//1-static method for same class
		         A1();                          //call method
		
		//2-non-static method for same class
		     //step1 object create same class
		         Sample1 H1=new   Sample1();    //classname objectname = new classname();
            //step2 call method
		         H1.A2();                      //objectname.methodname();
		     
		//3-static method for diff class   
		       Sample2.A3();                   //classname.methodname();
		       
		//4-non-static method for diff class       
		   //step1 object create diff class 
		      Sample2 H2=new Sample2();        //classname object = new classname();
		  //call method
		      H2.A4();                         //objectname.methodname();
	}
	//static regular method same class
	public static void A1()
	{
		System.out.println("method A1 same class");
	}
	//non-static method same class
	public void A2()
	{
		System.out.println("method A2 same class");

	}

}
