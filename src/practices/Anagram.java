package practices;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s = "geeta";

		String s1 = "teegan";

		char[] ch = s.toCharArray();

		char[] ch1 = s1.toCharArray();

		if (ch.length != ch1.length) {
			System.out.println("Its not an annagram");
		} 
		else 
		{
			Arrays.sort(ch);
			Arrays.sort(ch1);

			if (Arrays.equals(ch, ch1)) 
			{
				System.out.println("String is an annagram");
			} else
			{
				System.out.println("String is not an annagram");
			}

		}

	}

}
