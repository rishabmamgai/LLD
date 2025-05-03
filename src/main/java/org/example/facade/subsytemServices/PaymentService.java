package org.example.facade.subsytemServices;

import org.example.facade.Account;


public class PaymentService {
    public boolean pay(Account account, double amount) {
        System.out.println("Finding payment provider...");
        System.out.println("Initiating payment for amount " + amount + " from account : " + account.accountNumber());
        return true;
    }
}
