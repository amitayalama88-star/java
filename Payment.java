package interfaceDemo;

public interface Payment {
	public void makePayment();
	default void transactionlog()
	{
		receipt();
		System.out.print("trastcation operatiojs");
	}
	private void receipt() {
		System.out.print("paym,ent recepit" );
	}

}
