package Array;

public class Test_1
{
	public static void main(String[] args)
	{
		//step-1:Array Declaration
		String[] str1=new String[4];       //index = size-1
		                                   //index = 4-1  =3
		//step-2:Array initialization
		str1[0]="Rohit";
		str1[1]="virat";
		str1[2]="Hardik";
		str1[3]="msd";
		
		//step-3:usage
		//i=0         0<=3     1   true
		            //1<=3     2   true
		            //2<=3     3   true
		            //3<=3     4   true
		            //4<=3         false
		for(int i=0; i<=str1.length-1; i++)
		{
			System.out.println(str1[i]);
		}
				
	}

}
