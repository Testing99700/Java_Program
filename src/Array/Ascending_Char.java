package Array;

import java.util.Arrays;

public class Ascending_Char {

	public static void main(String[] args)
	{
		//step-1:Array declaration
		char[] as2=new char[5];
		
		//step-2:Array initialization
		as2[0]='B';
		as2[1]='A';
		as2[2]='C';
		as2[3]='E';
		as2[4]='D';
		
		//Ascending order
		Arrays.sort(as2);
		
		//step-3:usage
		for(int i=0; i<=as2.length-1; i++)
		{
			System.out.println(as2[i]);
		}
	}

}
