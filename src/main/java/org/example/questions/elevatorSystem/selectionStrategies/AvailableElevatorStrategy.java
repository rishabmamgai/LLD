package org.example.questions.elevatorSystem.selectionStrategies;

import org.example.questions.elevatorSystem.elevators.Elevator;

import java.util.List;


public class AvailableElevatorStrategy implements ElevatorSelectionStrategy {
    @Override
    public Elevator getElevator(int toFloor, List<Elevator> elevators) {
        Elevator availableElevator = elevators.stream()
                .filter(elevator -> !elevator.isMoving())
                .findFirst().orElse(null);

        assert availableElevator != null;
        if (availableElevator.getCurrentPosition() < toFloor) {
            availableElevator.goUp(toFloor);
        }
        else {
            availableElevator.goDown(toFloor);
        }

        return availableElevator;
    }
}
