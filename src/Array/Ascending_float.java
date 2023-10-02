package Array;

import java.util.Arrays;

public class Ascending_float
{
	public static void main(String[] args)
	{
		//step-1:Array declaration
		float[] as4=new float[5];
		
		//step-2:Array initialization
		as4[0]=75.44456580f;     //float maintain point digit 5 to 6 only
		as4[1]=88.43345588f;
		as4[2]=89.33334589f;
		as4[3]=38.58998878f;
		as4[4]=67.74888989f;
		
		//Ascending order
		Arrays.sort(as4);
		
		//step-3:usage
		for(int i=0; i<=as4.length-1; i++)
		{
			System.out.println(as4[i]);
		}
	}


}
