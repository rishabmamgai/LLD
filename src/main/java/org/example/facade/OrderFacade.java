package org.example.facade;

import org.example.facade.subsytemServices.InvoiceService;
import org.example.facade.subsytemServices.NotificationService;
import org.example.facade.subsytemServices.PaymentService;


public class OrderFacade {
    private final PaymentService paymentService;
    private final InvoiceService invoiceService;
    private final NotificationService notificationService;

    public OrderFacade() {
        this.paymentService = new PaymentService();
        this.invoiceService = new InvoiceService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(Cart cart, Account account) {
        double totalAmount = 0;
        for (Product product : cart.products()) {
            totalAmount += product.getAmount();
        }

        if (paymentService.pay(account, totalAmount)) {
            invoiceService.generate(cart);
            notificationService.send(cart.email());
        }
    }
}
