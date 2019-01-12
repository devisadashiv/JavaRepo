package practices;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramCheck {

	public static void main(String[] args) {
		
		System.out.println("Enter the first String");
		
		Scanner sc=new Scanner(System.in);
		
		String s1=sc.nextLine();
		
		System.out.println("Enter the ScecondString");
		
		Scanner sc1=new Scanner(System.in);
		
		String s2=sc1.nextLine();
		
		
		char ch[]=s1.toLowerCase().toCharArray();
		
		char ch1[]=s2.toLowerCase().toCharArray();
		
		if(ch.length!=ch1.length)
		{
			System.out.println("its not an annagram");
		}
		else
		{
		    Arrays.sort(ch);
		    
		    System.out.println(ch);
		    
		    System.out.println(ch1);
		    
			Arrays.sort(ch1);
			
	        System.out.println(ch1);
			
			if(Arrays.equals(ch, ch1))
			{
				
				System.out.println("Its an annagram");
			}
			
			else
			{
				System.out.println("its not an annagram");
			}
				
				
		}
		

	}

}
