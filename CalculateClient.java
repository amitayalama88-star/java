package interfaceDemo;

public class CalculateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implements
		//annonomous class
		//lambda
		Addtion a=()->
		{
			int fno=100;
			int sno=200;
			int result=fno+sno;
			System.out.println("Addtion of two numbers : " +result);
		};
		a.add();
		
		Substraction s=(f,s1)->
		{
			int result=f-s1;
			System.out.println("Subtraction of two numbers : "+result);
		};
		
		s.Sub(100, 20);
		
		Multiplication m=(a1,d)->
		{
			int result=a1*d;
			return result;
		};
		
		System.out.println("Multiplication of Two Numbers : "+ m.mul(5, 4));
		
		
		
		
	}
 
}
 