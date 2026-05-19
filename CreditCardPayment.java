package com.in1;

class CreditCardPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Processing Credit Card Payment of: $" + amount);
        System.out.println("Status: Success (Auth Code: 8829)");
    }
}