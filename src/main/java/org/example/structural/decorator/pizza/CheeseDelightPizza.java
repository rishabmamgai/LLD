package org.example.structural.decorator.pizza;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class CheeseDelightPizza extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
