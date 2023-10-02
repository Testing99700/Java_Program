package Methods;

public class Demo8 {

	public static void main(String[] args) 
	{ 
		//non-static regular method call from same class
		
		//step-1 create object from same class
		
		Demo8 s1= new Demo8();    //className objectName=new className();
		
		//step-2 call the method
		
		s1.m1();     //objectNmae.methodNmae();
		
	}
	        //non-static regular method
	        public void m1() 
	        {
	        	System.out.println("Non-Static Regular Method");
	        }
}
