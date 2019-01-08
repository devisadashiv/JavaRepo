package dataTypeDemo;

public class ClassObjectDemo {

	  int  i=20;
	  static int j=100;
	  int k=10;
	  
	
	public static void main(String[] args) {
		
		
		ClassObjectDemo obj1=new ClassObjectDemo();
		obj1.sum();
		System.out.println(obj1.j);
		System.out.println(ClassObjectDemo.j);
		

	}
	
	public void sum()
	{
		int z=i+k;
		
		System.out.println(" the sum of two numbers is "+z);
		
		System.out.println(" the static variable vlaue is "+j);
	}

}
