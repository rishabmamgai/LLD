package org.example.decorator.topping;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class VeggieToppings extends Topping {
    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}
