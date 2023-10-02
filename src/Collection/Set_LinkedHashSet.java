package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashSet 
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		
		//add information
		lhs.add("Rahul");
		lhs.add(100);
		lhs.add('A');
		lhs.add(60.25f);
		lhs.add(100);     //Duplicate
		lhs.add(null);
		lhs.add(null);    //Duplicate only one null allow
		
		System.out.println(lhs);
		
		//verify LinkedHashSet is empty or not
		System.out.println(lhs.isEmpty());     //false
		
		//size
		System.out.println(lhs.size());       //5
		
		//verify information is present or not
		System.out.println(lhs.contains(60.25f));   //true
		
		//remove information
		lhs.remove(100);
		System.out.println(lhs);
		
//By using for each loop
		System.out.println("----for each loop----");
		
		for(Object s1:lhs)
		{
			System.out.println(s1);
		}
		
//By using iterator cursor
		System.out.println("----Iterator cursor");
		
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
