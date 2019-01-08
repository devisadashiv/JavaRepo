package stringclassess;

public class StringClassDemo2 {

	public static void main(String[] args) {

		
	String actual="Selenium world";
	
	String expected="selenium world";
	
	
   boolean stat=actual.equals(expected);
   boolean stat1=actual.equalsIgnoreCase(expected);
	
	
	
	
	System.out.println("the stat is  ="+ stat);
	System.out.println("the stat1 is = "+stat1);
	}

}
