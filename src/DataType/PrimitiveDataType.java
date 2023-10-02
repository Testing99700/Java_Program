package DataType;

public class PrimitiveDataType
{
         public static void main (String[] args) 
         { 
     		//Step-1:variable Declaration

        	 byte a;        
        	 short b;      
        	 int c;         
        	 long d;        
        	 float e;       
        	 double f;
        	 char g;
        	 boolean h;
        	 boolean i;
        	 String j;
        	 
     		//Step-2:variable Initialization

        	 a= 100;           //-128 to 127    
        	 b=30000;          //-32,768 to 32,767
        	 c=78689890;       //-2,147,483,648 to 2,147,483,647
        	 d=78976983279L;   //-9,223,372,036,854,775,808 to9,223,372,036,854,775,807
        	 e=100.37789292F;  
        	 f=200.79870283389d;
        	 g='R';
        	 h=true;
        	 i=false;
        	 j="expected the typical certification course";
        	 		
     		//Step-3:Usage

        	 System.out.println("byte:"+a);
        	 System.out.println("short:"+b);
        	 System.out.println("integer:"+c);
        	 System.out.println("Long:"+d);
        	 System.out.println("Flaot:"+e);
        	 System.out.println("Double:"+f);
        	 System.out.println("char:"+g);
        	 System.out.println("boolean:"+h);
        	 System.out.println("boolean:"+i);
        	 System.out.println("String:"+j);
         }
      
}
