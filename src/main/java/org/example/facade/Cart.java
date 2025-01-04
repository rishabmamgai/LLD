package org.example.facade;

import java.util.List;


public record Cart(String email, List<Product> products) {
}
