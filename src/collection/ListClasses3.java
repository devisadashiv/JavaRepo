package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListClasses3 {

	public static void main(String[] args) {
		
		LinkedList<String> obj=new LinkedList<String>();
		
		obj.add("123");
		obj.add("selenium");
		obj.add("123");
		obj.add("mita");
		obj.add("M");
		obj.add(null);
		
		System.out.println(obj);
		
		for(String lst:obj)
		{
			System.out.println(lst);
		}
		
		int mylist=obj.size();
		
		for(int i=0;i<mylist;i++)
		{
			
			System.out.println(obj.get(i));
			
		}
		
	Iterator it=obj.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		

	}

}
