package String_class;

public class String_methods 
{
	public static void main(String[] args)
	{
		String s1="velocity";//0v 1e 2l 3o 4c 5i 6t 7y
		String s2="";
		String s3="ABCD";
		String s4="VELOCITY";
		String s5="city";
		String s6="abcabab";
		String s7="classes";
		String s8="manual classes";
		
		//to get size capcity
		System.out.println(s1.length());
		
		//to verify s1 are empty or not
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		//to convert uppercase
		System.out.println(s1.toUpperCase());
	
		//to convert lower case
		System.out.println(s4.toLowerCase());
		
		//compare s1 & s4
		System.out.println(s1.equals(s4));
		
		//compare s1 & s4
		System.out.println(s1.equalsIgnoreCase(s4));//true
		
		//compare s1 & s5
		System.out.println(s1.contains(s5));
		
		//to get charters by providing index 
		System.out.println(s1.charAt(7));
		
		//to verify string s1 starts with "ve"
		System.out.println(s1.startsWith("ve"));
		
		//to verify string s1 ends with "ty"
				System.out.println(s1.endsWith("ty"));
				
		//to get index of charater
				System.out.println(s1.indexOf('i'));
				
		//to get last index of charaters
				System.out.println(s6.lastIndexOf('a'));
				
		//to get sub string
				System.out.println(s1.substring(4,7));
				
				//to get sub string
				System.out.println(s1.substring(4));		
				
				//to get concat s1 and s7
				//to get sub string
				System.out.println(s1+s7);
				System.out.println(s1.concat(s7));
				
				//to replace
				System.out.println(s8.replace("manual","Automation"));
				
				
	}

}
