package org.example.decorator.pizza;

import lombok.Getter;
import lombok.experimental.SuperBuilder;


@Getter
@SuperBuilder
public abstract class BasePizza {
    private String pizzaName;
    public abstract int cost();
}
