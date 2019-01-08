package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
	
	public static void main(String args[])
	{
		
		HashSet obj=new HashSet();
		
		obj.add(23);
		obj.add("ellen");
		obj.add('M');
		obj.add('M');
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
