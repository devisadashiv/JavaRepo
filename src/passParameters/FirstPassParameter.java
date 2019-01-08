package passParameters;

public class FirstPassParameter {

	public static void main(String[] args) {
		
		FirstPassParameter obj=new FirstPassParameter();
		obj.add(20, 30);
		obj.sub(55.5, 44.5);
				

	}
	
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the value of c "+c);
	}
	
	public void sub(double x,double y)
	{
		double z=x-y;
		
		System.out.println("the value of z " +z);
	}

}
