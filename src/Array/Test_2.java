package Array;

public class Test_2 
{
	public static void main(String[] args)
	{
		//step-1:Array declaration
		int[] ar1=new int[3];
		
		//step-2:Array initiazliation
		ar1[0]=20;
		ar1[1]=30;
		ar1[2]=10;
		
		//step-3:usage
		//i=0      0<=2   1   true
		         //1<=2   2   true
		         //2<=2   3   true
		         //3<=2       false
		for(int i=0; i<=ar1.length-1; i++)
		{
			System.out.println(ar1[0]);
			System.out.println(ar1[1]);
			System.out.println(ar1[2]);
		}
	}

}
