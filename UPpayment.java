package com.in1;

class UPIPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Processing UPI Payment of: $" + amount);
        System.out.println("Status: Success (VPA: user@bank)");
    }
}