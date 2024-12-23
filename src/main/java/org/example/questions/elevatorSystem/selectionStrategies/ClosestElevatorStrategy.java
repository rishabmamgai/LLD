package org.example.questions.elevatorSystem.selectionStrategies;

import org.example.questions.elevatorSystem.elevators.Elevator;

import java.util.List;


public class ClosestElevatorStrategy implements ElevatorSelectionStrategy{
    @Override
    public Elevator getElevator(int fromFloor, List<Elevator> elevators) {
        Elevator closestElevator = elevators.get(0);
        int diff = Math.abs(closestElevator.getCurrentPosition() - fromFloor);

        for (Elevator elevator : elevators) {
            if (Math.abs(elevator.getCurrentPosition() - fromFloor) < diff) {
                closestElevator = elevator;
                diff = Math.abs(elevator.getCurrentPosition() - fromFloor);
            }
        }

        if (closestElevator.getCurrentPosition() < fromFloor) {
            closestElevator.goUp(fromFloor);
        }
        else {
            closestElevator.goDown(fromFloor);
        }

        return closestElevator;
    }
}
