package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_ArrayList  
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		//Add information
		al.add("Rahul");
		al.add(100);
		al.add('A');
		al.add(60.25f);
		al.add(100);     //duplicate are allowed in arraylist
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		//verify Arraylist is empty or not
		System.out.println(al.isEmpty());  //false
		
		//size
		System.out.println(al.size());   //7
		
		//verify information is present or not
		System.out.println(al.contains('A'));   //true
		
		//Add information in between Arraylist-->Right shift operation
		al.add(1,200);
		System.out.println(al);   //200
		
		//remove information-->left shift operation
		al.remove(1);    
		System.out.println(al);   //200
		
		//update information
		al.set(3, 90.75f);
		System.out.println(al);
		
		//to find index of data
		System.out.println(al.indexOf("Rahul"));//0
		
		//to get index by providing information
		System.out.println(al.get(2));  //A
		
	//By Using For Loop:
		System.out.println("---for each loop----");
		
		for (Object s1:al) //0-->Rahul  //1-->100  //2-->A  //3-->90.75  //4-->100  //5-->null  //6-->null
		{
			System.out.println(s1);    //Rahul 100 A 90.75 100 null null
		}
		
	//By Using iterator
		System.out.println("---iterator curser----");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())  //7-->false
		{
			System.out.println(itr.next());  //rahul 100 A 90.75 100 null null
		}
		
	//By Using listIteration cursor:
		System.out.println("----listIteration cursor----");
		
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext())   //7-->false
		{
			System.out.println(ltr.next());  //Rahul 100 A 90.75 100 null null
		}
}

}
	
