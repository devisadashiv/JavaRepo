package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass3 {
	
	public static void main(String args[])
	{
		
		LinkedHashSet<Integer> obj=new LinkedHashSet<Integer>();
		
		obj.add(23);
		obj.add(345);
		obj.add(678);
		obj.add(123);
		obj.add(null);
		
		System.out.println(obj);
		
		
		for(Object s:obj)
		{
		    System.out.println(s);
		}
	Iterator itr=obj.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
		
		
	}

}
