package practices;

public class CharCount {

	public static void main(String[] args) {
		
		String st="java is java";
		
		String a=st.replaceAll("a","");
		
		System.out.println(a.length());
		
		System.out.println(st.length());
		
		String str=st.replaceAll(" ","");
		
		System.out.println(str.length());
		
		int count=0;
		
		count=st.length()- st.replaceAll("j","").length();
		
		System.out.println("the char j  is"  + count);
		

	}

}
