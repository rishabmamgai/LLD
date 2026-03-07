package org.example.behavioural.visitor.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.behavioural.visitor.visitors.Visitor;


@Getter
@AllArgsConstructor
public class Circle implements Shape {
    private int radius;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
