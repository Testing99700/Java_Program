package String_class;

public class Test4
{
	public static void main(String[] args)
	{
		//String object are immutable in nature/can't changed
		
		String S1= new String("velocity");
		
		S1.concat("classes");                   //velocity classes
		
		System.out.println(S1);                 //velocity
	}

}
