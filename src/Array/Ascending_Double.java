package Array;

import java.util.Arrays;

public class Ascending_Double
{
	public static void main(String[] args)
	{
		//step-1:Array declaration
		double[] as3=new double[5];
		
		//step-2:Array initialization
		as3[0]=20.34686996877;            //Double Accuracy maintain point digit long time
		as3[1]=74.38789790767;
		as3[2]=78.88797767768;
		as3[3]=72.33546575473;
		as3[4]=24.2323277979797667;
		
		//Ascending order
		Arrays.sort(as3);
		
		//step-3:usage
		for(int i=0; i<=as3.length-1; i++)
		{
			System.out.println(as3[i]);
		}
	}


}
