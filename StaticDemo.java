package Welcome;

public class StaticDemo {
	static int sno =100;
	static void display() {
		System.out.println("Sttatic display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("directly" +sno);
		display();
		
		System.out.println("using classname" +StaticDemo.sno);
		StaticDemo.display();
		
		StaticDemo st = new StaticDemo();
		System.out.println("using object" +st.sno);
		st.display();
		
		StaticDemo st1 = null;
		System.out.println("using null" +st1.sno);
		st1.display();
		
		

		

	}

}
