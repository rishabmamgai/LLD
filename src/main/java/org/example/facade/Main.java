package org.example.facade;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart("placeOrder@xyz.com", List.of(
                new Product("T-shirt", "P1", 200),
                new Product("Shirt", "P2", 500),
                new Product("Jeans", "P3", 1000)
            )
        );

        AccountDetails accountDetails = new AccountDetails("0123456789");

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder(cart, accountDetails);
    }
}
