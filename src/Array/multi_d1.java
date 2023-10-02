package Array;
public class multi_d1
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
		
		//"For" loop for raw (outer for loop)
		
		for(int i=0;   i<=1;   i++)
		{
			//"For" loop for columns (inner for loop)

			for(int j=0;   j<=2;   j++)
			{
				System.out.print(u1[i][j]+" ");
			}
		 	System.out.println();
		}
	}

}
