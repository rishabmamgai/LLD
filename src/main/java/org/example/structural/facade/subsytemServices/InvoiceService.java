package org.example.structural.facade.subsytemServices;

import org.example.structural.facade.Cart;


public class InvoiceService {
    public void generate(Cart cart) {
        System.out.println("Generating invoice...\n");
        System.out.println("----------");

        cart.products().forEach(product ->
                System.out.println(product.getName() + " - " + product.getAmount())
        );

        System.out.println("----------\n");
    }
}
