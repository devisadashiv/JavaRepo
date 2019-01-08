package interfaces;

  public class Childclass implements BaseClass{
	public static void main(String[] args) {
		
		Childclass obj=new Childclass();
		obj.add();
	   obj.mul();
		obj.sub();
		
		//x=90; //final variable can not be changed

	
        
	}

	
	
	public void mul()
	
	{ 
	  
	   int y=x+2;
	   
	   System.out.println("the value of Y is "+y);
		System.out.println("the mulmethod of the childclass");
	}
	public void add() {
		
		System.out.println("the addmethod implementation in childclass");
		
	}

	
	public void sub() {
	
		System.out.println("the submethod implementation in the childlass");
		
	}

}
