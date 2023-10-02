package Array;

import java.util.Arrays;

public class Ascending_String 
{
	public static void main(String[] args)
	{
		//step-1:Array declaration
		String[] as1=new String[5];
		
		//step-2:Array initialization
		as1[0]="Bhushan";
		as1[1]="Amol";
		as1[2]="kalpesh";
		as1[3]="Ganesh";
		as1[4]="Dinesh";
		
		//Ascending order
		Arrays.sort(as1);
		
		//step-3:usage
		for(int i=0; i<=as1.length-1; i++)
		{
			System.out.println(as1[i]);
		}
	}
}