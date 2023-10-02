package Practice;

public class t11 
{
	public static void main(String[] args) 
	{
		
	   int org=7;  //7/1   7/2 7/3 7/4 7/5 7/6    7/7
		
        int count=0;
        
             //i=2         2<7          3
                          //3<7         4
                          //4<7         5
                          //5<7         6
                          //6<7         7
                          //7<7
        for(int i=2;       i<org;      i++) 
        {
        	  //1==0
        	if(org % i==0) 
        	{
        		count++;
        		break;
        	}
        }

        //0==1
      if(count==1) 
      {
    	  System.out.println("Given no is not a prime no");
      }
      else 
      {
    	  System.out.println("Given no is a prime no");
      }
      	
	}	

}
