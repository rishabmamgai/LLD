package org.example.questions.elevatorSystem.selectionStrategies;

import org.example.questions.elevatorSystem.elevators.Elevator;

import java.util.List;


public interface ElevatorSelectionStrategy {
    Elevator getElevator(int toFloor, List<Elevator> elevators);
}
