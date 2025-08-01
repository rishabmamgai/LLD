package org.example.visitor.shapes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.visitor.visitors.Visitor;


@Getter
@AllArgsConstructor
public class Square implements Shape {
    private int side;

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}
