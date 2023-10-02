package Main_Method;

public class overloading 
{
	//method overloading --> applicable to the main method 
	//method overriding --> not applicable to the main method 

	public static void main(String[] args)
	{
		System.out.println("rahul");
	}
	public static void main(int[] args)
	{
		System.out.println(10);
	}
	public static void main(char[] args)
	{
		System.out.println('A');
	}
	public static void main(float[] args)
	{
		System.out.println(45.78f);
	}
	public static void main(int[] args, int[] m1)
	{
		System.out.println(20);
		System.out.println(30);

	}
}
 