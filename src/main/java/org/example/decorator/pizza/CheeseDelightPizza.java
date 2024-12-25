package org.example.decorator.pizza;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class CheeseDelightPizza extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
