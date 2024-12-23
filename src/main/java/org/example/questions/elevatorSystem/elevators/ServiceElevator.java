package org.example.questions.elevatorSystem.elevators;

import lombok.Getter;
import lombok.experimental.SuperBuilder;


@Getter
@SuperBuilder
public class ServiceElevator extends Elevator {
    private final int elevatorNumber;
    private final ElevatorType elevatorType;
    private int currentPosition = 0;
    private boolean isMoving = false;

    @Override
    public void goUp(int floor) {
        isMoving = true;
        System.out.println(elevatorType + " " + elevatorNumber + " going up to " + floor);
        currentPosition = floor;
    }

    @Override
    public void goDown(int floor) {
        isMoving = true;
        System.out.println(elevatorType + " " + elevatorNumber + " going down to " + floor);
        currentPosition = floor;
    }
}
