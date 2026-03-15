package org.example.structural.decorator.topping;

import lombok.experimental.SuperBuilder;
import org.example.structural.decorator.pizza.BasePizza;


@SuperBuilder
public abstract class Topping extends BasePizza {
    public BasePizza basePizza;
}
