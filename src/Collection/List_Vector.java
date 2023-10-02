package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class List_Vector
{
	//  0     1   2    3     4    5     6
	//virat  100  A  60.25  100  null  null
	
	public static void main(String[] args)
	{
		Vector v1=new Vector(); 
		
		//Add information
		v1.add("virat");  //0
		v1.add(100);      //1
		v1.add('A');      //2
		v1.add(60.25f);   //3
		v1.add(100);      //4
		v1.add(null);     //5
		v1.add(null);     //6
		
		System.out.println(v1);
		
		//verify vector is empty or not
		System.out.println(v1.isEmpty()); //false
		
		//size
		System.out.println(v1.size()); //7
		
		//verify information is present or not
		System.out.println(v1.contains('A'));  //true
		
		//add information in between vector-->Right shift operation
		v1.add(1,200);
		System.out.println(v1);    //200
		
		//remove information -->left shift operation
		v1.remove(1);
		System.out.println(v1);    //remove 200
		
		//update information
		v1.set(3, 80.15f);
		System.out.println(v1);   //update 80.15f
		
		//to find index of data
		System.out.println(v1.get(0));  //virat
		
//By Using For Each Loop:
		System.out.println("----for each loop----");
		for (Object s2:v1) 
		{
			System.out.println(s2);
		}
		
//By using Iteration curser:
		System.out.println("----iteration curser----");
		Iterator itr=v1.iterator();
		
		while(itr.hasNext())   //7-->false
		{
			System.out.println(itr.next()); 
		}
		
//By using Listiteration curser:
		System.out.println("----Listiteration curser----");
		ListIterator ltr=v1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
//By using enumeration curser:
		System.out.println("----enumeration curser----");
		Enumeration enu=v1.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
