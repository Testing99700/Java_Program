package Collection;

import java.util.TreeSet;

public class Set_TreeSet 
{
	public static void main(String[] args)
	{
		TreeSet tr=new TreeSet();
		
		//add information
		tr.add(100);
		tr.add(200);
		tr.add(400);
		tr.add(300);
		tr.add(500);    
		tr.add(600);
		//tr.add(null);
		
		System.out.println(tr);
		
		//verify tree set is empty or not
		System.out.println(tr.isEmpty());   //false
		
		//size
		System.out.println(tr.size());   //6
		
		//verify information is present or not 
		System.out.println(tr.contains(200));  //true
		
		//remove information
		tr.remove(400);    //remove 100
		System.out.println(tr);
		
		//print first information
		System.out.println(tr.first());   //find 1st 100
		
		//print last information
		System.out.println(tr.last());   //find last 600
		
		//remove first information
		tr.pollFirst();
		System.out.println(tr);          //remove first value
		
		//remove last information
		tr.pollLast();
		System.out.println(tr);          //remove last value
	}

}
