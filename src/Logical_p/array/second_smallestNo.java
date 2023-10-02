package Logical_p.array;

public class second_smallestNo 
{
	//5  write a program to find second lowest number in an array 
		//a  6  8  2  4  3  1  5  7
		//   0  1  2  3  4  5  6  7
	
	public static void main(String[] args)
	{
		int[] a= {6,8,2,4,3,1,5,7};
		int temp;
		
		for(int i=0; i<=a.length-1; i++)
		{
			for(int j=i; j<=a.length-1; j++)
			{
				if(a[i] > a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second lowest number:"+a[1]);    //a[1] means index 0 1=second numbers
	}

}
