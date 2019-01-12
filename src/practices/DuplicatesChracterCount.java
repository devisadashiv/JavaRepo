package practices;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesChracterCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String");

		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for (char c : ch) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		
		}
		//System.out.println(hm);
		
		
		
		
		Set<Character>s1=hm.keySet();
		
		
		for(Character ch1:s1)
			
		{
			if(hm.get(ch1)>1)
			{
				System.out.println(ch1+":"  + hm.get(ch1));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
