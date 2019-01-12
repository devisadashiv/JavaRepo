package practices;

public class NumberOfWords {

	public static void main(String[] args) {
		
		String str="hi hello";
		
		System.out.println(str.length());
		
		  String[] s=str.split(" ");
		  
		  System.out.println(s.length);
		  
		  int count=1;
		  
		 /* for(int i=0;i<str.length();i++)
		  {
			  
			 if((str.charAt(i)==' ')&& (str.charAt(i+1)) != ' ')
			 {
				 
				 count=count+1;
			 }
		  }
		  System.out.println("Number of words in the String "+count);*/

	}

}
