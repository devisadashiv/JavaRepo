package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass4 {
	
	public static void main(String args[])
	{
		
		Set<String> obj=new HashSet<>();
		
		obj.add("Mahesh");
		obj.add("Nikil");
		obj.add("Suraj");
		obj.add("Parta");
		obj.add("Riya");
		
		System.out.println(obj);
		

		ArrayList<String>a1=new ArrayList<>(obj);
		
		//we cannot excess perticular index in set so we have to convert set to list
	
		
			System.out.println(a1.get(3));
		
		
		
		
		for(Object s:a1)
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
