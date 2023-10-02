package Constructor;

public class test4 {
    //Declaration of multiple constructor in smae class 
	
	//use-1 initialization of an object
	//use-2 initialization of non-static global variable
	
	//step-1: variable declaration
	int x;                       //non-static global variable
	int y;                       //non-static global variable
	String studentname;          //non-static global variable
	
	//step-2: variable initialization
	test4()                     //user defined constructor
	{
		x=20;
		y=30;
	}
	test4(int a,int b)          //user defined constructor
	{
		x=a;   //50
		y=b;   //60
	}
	test4(String sname)         //user defined constructor
	{
		studentname=sname;  //Rahul
	}
	
	//step-3: usage
	public void addition()     //non-static method
	{
		int add=x+y;
		System.out.println(add);          //50,110
	}
	public void m1()           //non-static method
	{       
		System.out.println(studentname);   //Rahul
	}
	public static void main(String[] args)         //main method
	{
		//create object
		       test4 t4=new test4();             //zero parameter/arguments
		//call method
	           t4.addition();//...........50
//-------------------------------------------------------	
		//create object
		      test4 t5=new test4(50,40);         //two (int,int) parameter/arguments
		//call method
	          t5. addition();//............90
//---------------------------------------------------------	          
	    //create object
	          test4 t6 =new test4("Rahul");      //(String parameter/arguments
	    //call method
	          t6.m1();//..................Rahul
	}
}
