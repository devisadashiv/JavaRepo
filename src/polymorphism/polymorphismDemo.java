package polymorphism;

public class polymorphismDemo {

	public static void main(String[] args) {
		
		polymorphismDemo obj=new polymorphismDemo();
		obj.add(23, 34);
		obj.add(89, 70, 80);
		obj.add(40.7,78.9);
		obj.add(60.8,70);

			}
	
	
	public void add(double a,double b)
	{
		double sum=a+b;
		System.out.println(" the sum is  "+sum);
		
	}
	public void add(double a,int b)
	{
       double sum=a+b;//upcasting 
		System.out.println(" the sum is  "+sum);
		
	}
	
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(" the sum is  "+sum);
		
	}

	public void add(int a,int b,int d)
	{
		int sum=a+b+d;
		System.out.println(" the sum is  "+sum);
		
	}
	
	
	
	
	

}
