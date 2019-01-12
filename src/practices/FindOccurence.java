package practices;

import java.util.HashMap;
import java.util.Scanner;

public class FindOccurence {

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
		System.out.println(hm);
		
		
		

	}

}
