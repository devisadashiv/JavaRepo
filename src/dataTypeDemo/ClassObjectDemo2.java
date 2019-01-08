package dataTypeDemo;

public class ClassObjectDemo2 {

	  int  i=20;
	  static int j=100;
	  int k=10;
	  
	
	public static void main(String[] args) {
		
		
		ClassObjectDemo2 obj1=new ClassObjectDemo2();
		obj1.sum();
		System.out.println(obj1.j);
		System.out.println(ClassObjectDemo2.j);
		

	}
	
	public static void sum()
	{
	
		
		System.out.println(" the static variable vlaue is "+j);
	}

}
