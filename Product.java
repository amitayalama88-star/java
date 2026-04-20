package Welcome;

public class Product {
	int pid;
	String pname;
void displayDetails() {
	pid =100;
	pname ="tv";
	System.out.println(pid+"\t"+pname);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		System.out.println(p.pid + "\t" +p.pname);
		p.displayDetails();
		System.out.println(p.pid+"\t"+p.pname);
		

	}

}
