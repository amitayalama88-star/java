package interfaceDemo;

public interface CreditCardPayment extends Payment {
	public void makePayment() {
		System.out.println("upi  payment");
	}

}
