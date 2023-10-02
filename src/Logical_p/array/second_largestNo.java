package Logical_p.array;

public class second_largestNo
{
	//5  write a program to find second highest number in an array 
	//a  6  8  2  4  3  1  5  7
	//   0  1  2  3  4  5  6  7

	public static void main(String[] args)
	{
		int[] a= {6,8,2,4,3,1,5,7};
		
		int temp;
		
		for(int i=0;  i<=a.length-1;  i++)       //index=size-1  8-1=7
		{
			for(int j=i;  j<=a.length-1;  j++)
			{
				if(a[i] < a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second highest number: "+a[1]);
	}
}
