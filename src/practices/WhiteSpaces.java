package practices;

public class WhiteSpaces {

	public static void main(String[] args) {
		
		String s="  geta looks good ";
		
		System.out.println(s);
		
		String str=s.replaceAll("\\s+", "");
		
		System.out.println(str);

	}

}
