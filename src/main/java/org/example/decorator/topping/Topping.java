package org.example.decorator.topping;

import lombok.experimental.SuperBuilder;
import org.example.decorator.pizza.BasePizza;


@SuperBuilder
public abstract class Topping extends BasePizza {
    public BasePizza basePizza;
}
