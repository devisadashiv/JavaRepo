package stringclassess;

public class StringClassDemo4 {

	public static void main(String[] args) {

		
	String actual="Selenium world";
	

	
	String expected="Selenium";
	
	
  boolean stat=actual.contains(expected);
  
  System.out.println(stat);
     
        
  String value="234$567$456";
  
  String value1[]=value.split("$");
  
  System.out.println("the length of the string "+value1.length);
  
  for(int i=0;i<value1.length;i++)
  {
	  
	  System.out.println("the values are "+value1[i]);
	  
	  if(value1[i].equals("234"))
	  {
		  System.out.println("test passed");
		  
		  break;
	  }
  }
  
  
  
String name="selenium-qtp-hp";

String name1[]=name.split("-");

System.out.println("the length of the string "+name1.length);

for(int i=0;i<name1.length;i++)
{

System.out.println("the values are " +name1[i]);

if(name1[i].equals("qtp"))
{
	  System.out.println("test passed");
	  
	  //break;
}
}

  
        
        
        
	}       
     
}
