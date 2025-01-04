package org.example.facade.subsytemServices;


import org.example.facade.AccountDetails;

public class PaymentService {
    public boolean initiatePayment(AccountDetails accountDetails, double amount) {
        System.out.println("Finding payment provider...");
        System.out.println("Initiating payment for amount " + amount + " from account : " + accountDetails.accountNumber());
        return true;
    }
}
