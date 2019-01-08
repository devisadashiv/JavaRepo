package passParameters;

public class PassParameter {

	public static void main(String[] args) {
		
		PassParameter obj=new PassParameter();
		int c=obj.add(20, 30);
		System.out.println(" the return c value is" +c);
		
	
	double z=obj.sub(55.5, 44.5);
	
		System.out.println("the return z value is" +z);		

	}
	
	public int  add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public double sub(double x,double y)
	{
		double z=x-y;
		
		return z;
	}

}
