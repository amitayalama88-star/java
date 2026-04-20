package Welcome;
 
public class multiplication {
 
	int mul(int f,int s)
	{
		return f*s;
	}
	
	String div(int f,int s)
	{
		int result=f/s;
		
		return "Division of Two numbers : "+ result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication c=new multiplication();
		int result=c.mul(5,4);
		System.out.println("Multiplication of two Numbers  : "+result);
		
		String message=c.div(100, 10);
		System.out.println(message);
	}
 
}
 
 