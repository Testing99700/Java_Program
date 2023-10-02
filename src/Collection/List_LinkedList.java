package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_LinkedList
{
	public static void main(String[] args)
	{
		LinkedList L1=new LinkedList();
		
		//Add inforamation
		L1.add("Rohit");
		L1.add(100);
		L1.add('A');
		L1.add(60.25f);
		L1.add(100);    //Duplicate
		L1.add(null);
		L1.add(null);
		
		System.out.println(L1);
		
		//verify linkedlist is empty or not
		System.out.println(L1.isEmpty());  //false
		
		//size
		System.out.println(L1.size());  //7
		
		//verify information is present or not
		System.out.println(L1.contains('A'));  //true
		
		//Add information in between linkedlist-->Right shift operation
		L1.add(1,200);
		System.out.println(L1);
		
		//remove information-->Left Shift Operation
		L1.remove(1);
		System.out.println(L1);
		
		//update information
		L1.set(3,70.25f);   //update 70.25
		
		//to find index of data
		System.out.println(L1.indexOf('A'));  //2
		
		//to get information by providing index
		System.out.println(L1.get(2));   //A
		
//By using for each loop:		
		System.out.println("----for each loop----");
		for(Object s3:L1)
		{
			System.out.println(s3);
		}
		
//By using iterator cursor
		System.out.println("----iterator cursor----");
		Iterator itr=L1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
//By using listiterator cursor:
		System.out.println("----List Iteratot cursor----");
		ListIterator ltr=L1.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
	}

	
}
