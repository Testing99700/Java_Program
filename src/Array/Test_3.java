package Array;

public class Test_3
{
	public static void main(String[] args)
	{
		//step-1:Array declaration
		char[] ar2=new char[5];
		
		//step-2:Array initialization
		ar2[0]='A';
		ar2[1]='B';
		ar2[2]='C';
		ar2[3]='D';
		ar2[4]='E';
		
		//step-3:usage
		//i=0     0<=4   1   true
		        //1<=4   2   true
		        //2<=4   3   true 
		        //3<=4   4   true
		        //4<=4   5   true
		        //5<=4       false
		for(int i=0; i<=ar2.length-1; i++)
		{
			System.out.println(ar2[i]);
		}
	}

}
