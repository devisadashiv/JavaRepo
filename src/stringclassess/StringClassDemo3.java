package stringclassess;

public class StringClassDemo3 {

	public static void main(String[] args) {

		
	String actual="Selenium world";
	
	int s1=actual.length();
	
	String expected="Selenium";
	
	
  // boolean stat=actual.contains(expected);
        String s[]=actual.split(" ");
        
        
        
        
        
        
        for(int i=0;i<s.length;i++)
        {
        	
        	System.out.println(s[i]);
        }
 
	
	
	
	System.out.println("the length of the character in the string  ="+ s1);
	System.out.println(" the length of the srting  ="+ s.length);
	

	


	}

}
