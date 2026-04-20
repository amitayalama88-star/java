package Welcome;

public class Student {
	public static void main(String[] args) {
		int sno=10;
		String sname="shiva";
		String sadd="Hyderabad";
		float sal =250.25f;
		int a =100;
		int b =20;
		int temp;
		
		int sum=a+b;
		long mobileNumber = 2342334534456456456L;
//		System.out.println(sno+"\t" +sname+"\t"+sadd +"\t"+mobileNumber+"\t"+sal);
//		System.out.println(a+b);
		System.out.println("the sum of a + b is :" + sum);
		
		System.out.println("before the swap a"+a + "before the swap b = " + b);
		temp =a;
		a=b;
		b=temp;
		System.out.println("after the swap a=" + a +"after the swap b " + b);
		
		
		
	}

}
