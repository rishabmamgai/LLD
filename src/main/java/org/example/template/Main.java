package org.example.template;


public class Main {
    public static void main(String[] args) {
        NormalPayment normalPayment = new NormalPayment();
        normalPayment.pay();

        MerchantPayment merchantPayment = new MerchantPayment();
        merchantPayment.pay();
    }
}
