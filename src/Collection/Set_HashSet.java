package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet 
{
	public static void main(String[] args)
	{
		HashSet hs=new HashSet(); 
		
		//add information
		hs.add("Rahul");
		hs.add(100);
		hs.add('A');
		hs.add(60.25f);
		hs.add(100);    //Duplicate 
		hs.add(null);
		hs.add(null);   //Duplicate only one in null value
		
		System.out.println(hs);
		
		//verify hashset is empty or not
		System.out.println(hs.isEmpty());   //false
		
		//size
		System.out.println(hs.size());      //5
		
		//verify information is a present or not
		System.out.println(hs.contains(100));  //true
		
		//remove information
		hs.remove(100);
		System.out.println(hs);   //100 remove
		
//by using for each loop
		System.out.println("----for each loop----");
		for(Object s1:hs)
		{
			System.out.println(s1);
		}
		
//By using iterator cursor
		System.out.println("----iterator cursor-----");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
