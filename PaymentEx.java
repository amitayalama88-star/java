package com.in1;

interface Payment1 {
    // ABSTRACT METHOD: No body. Every class MUST provide its own implementation.
    void pay(double amount);

    // DEFAULT METHOD: Has a body. Subclasses inherit this automatically.
    // Advantage: Allows adding new features to interfaces without breaking existing classes.
    default void transactionInfo(double amount) {
        validate(amount); // Reusing the validation logic
        System.out.println("Payment processing...");
    }

    // PRIVATE METHOD: Only accessible inside this interface.
    // Advantage: Prevents code duplication. Both 'pay' (if needed) and 'transactionInfo' 
    // can use this without exposing the logic to the main program.
    private void validate(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }
        System.out.println("Amount validated successfully");
    }
}

// Subclass signing the 'Payment1' contract
class CreditCard implements Payment1 {
    @Override // Explicitly tells the compiler we are fulfilling the interface requirement
    public void pay(double amount) {
        System.out.println("Paid using Credit Card: " + amount);
    }
}

class UPI implements Payment1 {
    @Override
    public void pay(double amount) {
        System.out.println("Paid using UPI: " + amount);
    }
}

// NOTE: Changed from 'public interface PaymentEx' to 'public class PaymentEx'
// In Java, the main method should typically reside in a class.
public class PaymentEx {
    public static void main(String[] args) {
        // Create an object of the concrete class
        UPI u = new UPI();
        
        // 1. Calling the inherited 'default' method
        u.transactionInfo(10000); 
        
        // 2. Calling the overridden 'abstract' method
        u.pay(5000);
    }
}