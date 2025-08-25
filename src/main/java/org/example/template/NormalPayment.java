package org.example.template;


public class NormalPayment extends PaymentTemplate {
    @Override
    public void calculateFees() {
        System.out.println("Calculating fees.");
    }

    @Override
    public void debit() {
        System.out.println("Debit money");
    }

    @Override
    public void credit() {
        System.out.println("Credit to personal account.");
    }
}
