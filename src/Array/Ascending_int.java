package Array;

import java.util.Arrays;

public class Ascending_int 
{
	public static void main(String[] args)
	{
		//step-1:Array declaration
		int[] as1=new int[5];
		
		//step-2:Array initialization
		as1[0]=60;
		as1[1]=20;
		as1[2]=67;
		as1[3]=43;
		as1[4]=88;
		
		//Ascending order
		Arrays.sort(as1);
		
		//step-3:usage
		for(int i=0; i<=as1.length-1; i++)
		{
			System.out.println(as1[i]);
		}
	}

	
	
}
	