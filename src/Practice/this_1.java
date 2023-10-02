package Practice;

public class this_1 extends this_2
{
	//child class 
	
	int a=20;                              //non-static global variable
	int b=30;
	public void m1()
	{
		int a=10;                          //non-static local variable
		System.out.println(a);//10         //use 'a'is local variable    
		System.out.println(this.a);//20    //use 'a' is global variable 
		System.out.println(b);             //use "this" or not only one in 'b' golbal variable
		System.out.println(this.b);        //use "this"
		System.out.println(super.a);       //another class inhritance to "extends" keywords

	}
	public static void main(String[] args)
	{
		this_1 t1=new this_1();            //craete object
		t1.m1();                           //call method 
		
	}

}
