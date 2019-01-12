package practices;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramSpace {

	public static void main(String[] args) {
		
		System.out.println("Enter the first String");
		
		Scanner sc=new Scanner(System.in);
		
		 String fStr=sc.nextLine();
		 
		 System.out.println("Enter the Scecond String");
		
	      String seStr=sc.nextLine();
		 
		boolean res= annGram(fStr,seStr);
		
		if(res==true)
		{
			System.out.println("its an anngram");
		}
		else
		{
			System.out.println("its not an anngram");
		}
		 
	}   
		 public static boolean annGram( String fStr1, String seStr1)
		 {
			 
			 String str1=fStr1.replaceAll(" ","");
			 
			 String str2=seStr1.replaceAll(" ", "");
			 
			 if(str1.length()!=str2.length())
			 {
		          return false;
			 }
			 else
			 {
				  char ch[]=str1.toLowerCase().toCharArray();
				  
				  char ch1[]= str2.toLowerCase().toCharArray();
				  
				  Arrays.sort(ch);
				  Arrays.sort(ch1);
				  
				  return Arrays.equals(ch, ch1);
			 }
		 }
		   
		
		       

	

}
