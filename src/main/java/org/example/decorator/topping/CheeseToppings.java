package org.example.decorator.topping;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class CheeseToppings extends Topping {
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
