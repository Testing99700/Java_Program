package Array;

public class Test_4 
{
	public static void main(String[] args)
	{
			//step-1:Array declaration
			float[] ar3=new float [5];
			
			//step-2:Array initialization
			ar3[0]=20.5F;
			ar3[1]=21.2f;
			ar3[2]=34.3f;
			ar3[3]=76.5f;
			ar3[4]=86.5f;
			
			//step-3:usage
			//i=0     0<=4  1   true
			        //1<=4  2   true
			        //2<=4  3   true
			        //3<=4  4   true
			        //4<=4  5   true
			        //5<=4      false
			for(int i=0;  i<=ar3.length-1;  i++)
			{
				System.out.println(ar3[i]);
			}
  
}
}
