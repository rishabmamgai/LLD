package org.example.template;


public class MerchantPayment extends PaymentTemplate {
    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for merchant.");
    }

    @Override
    public void debit() {
        System.out.println("Debit money");
    }

    @Override
    public void credit() {
        System.out.println("Credit to merchant account.");
    }
}
