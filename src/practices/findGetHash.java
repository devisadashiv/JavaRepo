package practices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class findGetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		
		hm.put(10, "suresh");
		hm.put(30, "mahesh");
		hm.put(30, "murgesh");
		
		System.out.println(hm.get(10));
		System.out.println(hm.keySet());
		   System.out.println(hm.values());
		   
		   Set s=hm.entrySet();
		   
		Iterator itr =s.iterator();
		
		if(itr.hasNext())
		{
			Map.Entry e=(Map.Entry)itr.next();
			
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		   

	}

}
