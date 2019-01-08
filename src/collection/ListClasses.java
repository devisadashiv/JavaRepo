package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListClasses {

	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList();
		
		obj.add(123);
		obj.add("selenium");
		obj.add("mita");
		obj.add('M');
		obj.add('M');
		obj.add(null);
		
		System.out.println(obj);
		
		for(Object lst:obj)
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
