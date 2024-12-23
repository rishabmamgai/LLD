package org.example.questions.elevatorSystem;

import org.example.questions.elevatorSystem.elevators.Elevator;


public interface ElevatorSystem {
    Elevator getElevator(int fromFloor) throws Exception;
}
