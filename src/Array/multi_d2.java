package Array;

public class multi_d2 
{
	public static void main(String[] args)
	{
		//multi-dimentional array
		     //  0    1    2
		//0     10   20   30      
		//1     40   50   60
		
		//step-1:Array Declaration
		int[][] u1=new int[2][3];
		             //int[R][C];
		
		//step-2:Array initialization
		u1[0][0]=10;
		u1[0][1]=20;
		u1[0][2]=30;
		u1[1][0]=40;
		u1[1][1]=50;
		u1[1][2]=60;
		
		//step-3:usage
		System.out.print(u1[0][0]+" ");
		System.out.print(u1[0][1]+" ");
		System.out.print(u1[0][2]+" ");
		System.out.println();
		System.out.print(u1[1][0]+" ");
		System.out.print(u1[1][1]+" ");		
		System.out.print(u1[1][2]+" ");
}
}