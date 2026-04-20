package Welcome;

public class logicalandex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=20;
		System.out.println(a>b && ++a >b);  //first condtion is false, it doesnt check second condtions //false
		System.out.println(a);
		
		System.out.println(a>b & ++a >b);  //single & lets it go //false
		System.out.println(a);
		
		System.out.println(a<b && ++a >b);  //first condtion is false, it doesnt check second condtions //false
		System.out.println(a);

	}

}
