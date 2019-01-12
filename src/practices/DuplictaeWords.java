package practices;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplictaeWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String s=sc.nextLine();
		
		String[] str=s.split(" ");
		
		HashMap<String,Integer>hm= new HashMap<String,Integer>();
		
		
	for(String s1:str){
		
		if(hm.containsKey(s1))
		{
			
			hm.put(s1.toLowerCase(), hm.get(s1.toLowerCase())+1);
	   }
		else
		{
			hm.put(s1.toLowerCase(), 1);
		}

	}
	
         System.out.println(hm);
         
         
       Set<String> st =hm.keySet();
       
       for(String st1:st)
       {
    	   
    	   if(hm.get(st1)>1)
    	   {
    		   
    		   System.out.println(st1+":"+   hm.get(st1));
    	   }
       }

}
}
