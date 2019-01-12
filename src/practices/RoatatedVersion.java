package practices;

public class RoatatedVersion {

	public static void main(String[] args) {
		
		String s="JavaJ2eeStrutsHibernate";
		
		String s1="StrutsHibernateJavaJ2ee";
		
		
		
		if(s.length()!=s1.length())
		{
			System.out.println("s1 is not roated version of s");
		}
		else
		{
			String s3=s+s;
			
			if(s3.contains(s1))
			{
				System.out.println("s1 is roated version of s");
			}
			else
			{
				System.out.println("s1 is not roated vesrion of s");
			}
		}

	}

}
