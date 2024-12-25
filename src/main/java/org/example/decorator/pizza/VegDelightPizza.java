package org.example.decorator.pizza;

import lombok.experimental.SuperBuilder;


@SuperBuilder
public class VegDelightPizza extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
