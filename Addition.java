package Welcome;

public class Addition {
	void add(int sno, int fno) {
		int result =fno+sno;
		System.out.println("addition of two numbers: " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad = new Addition();
		ad.add(100,200);

	}

}
