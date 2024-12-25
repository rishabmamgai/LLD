package org.example.decorator;

import org.example.decorator.pizza.BasePizza;
import org.example.decorator.pizza.VegDelightPizza;
import org.example.decorator.topping.CheeseToppings;
import org.example.decorator.topping.VeggieToppings;


public class Main {
    public static void main(String[] args) {
        BasePizza vegDelightVeggie = VeggieToppings.builder()
                .pizzaName("Veggie")
                .basePizza(VegDelightPizza.builder()
                        .pizzaName("Veg Delight")
                        .build())
                .build();

        System.out.println("Veg Delight pizza with extra Veggie toppings :" + vegDelightVeggie.cost());

        BasePizza vegDelightCheese = CheeseToppings.builder()
                .pizzaName("Cheese")
                .basePizza(VegDelightPizza.builder()
                        .pizzaName("Veg Delight")
                        .build())
                .build();

        System.out.println("Veg Delight pizza with extra Cheese toppings :" + vegDelightCheese.cost());
    }
}
