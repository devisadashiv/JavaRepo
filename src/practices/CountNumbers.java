package practices;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="java";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					count=count+1;
				}
			}
			
			System.out.println(s.charAt(i)+"  "+count);
			
			count=0;
			
		
		}
			

	}

}
