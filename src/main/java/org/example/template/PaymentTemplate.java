package org.example.template;


public abstract class PaymentTemplate {
    public abstract void calculateFees();
    public abstract void debit();
    public abstract void credit();

    public final void pay() {
        calculateFees();
        debit();
        credit();
    }
}
