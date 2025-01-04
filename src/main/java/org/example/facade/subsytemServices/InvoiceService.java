package org.example.facade.subsytemServices;


import org.example.facade.Cart;

public class InvoiceService {
    public void generateInvoice(Cart cart) {
        System.out.println("Generating invoice...\n");
        System.out.println("----------");

        cart.products().forEach(product ->
                System.out.println(product.getName() + " - " + product.getAmount())
        );

        System.out.println("----------\n");
    }
}
