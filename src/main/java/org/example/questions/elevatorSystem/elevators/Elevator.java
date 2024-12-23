package org.example.questions.elevatorSystem.elevators;

import lombok.experimental.SuperBuilder;
import org.example.questions.elevatorSystem.display.InternalPanel;


@SuperBuilder
public abstract class Elevator {
    private final InternalPanel panel;

    public abstract int getCurrentPosition();
    public abstract boolean isMoving();
    public abstract void goUp(int floor);
    public abstract void goDown(int floor);
}
