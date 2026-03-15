package org.example.structural.facade;

import java.util.List;


public record Cart(String email, List<Product> products) {
}
