package org.example.questions.elevatorSystem;

import org.example.questions.elevatorSystem.display.ExternalPanel;
import org.example.questions.elevatorSystem.display.InternalPanel;
import org.example.questions.elevatorSystem.elevators.Elevator;
import org.example.questions.elevatorSystem.elevators.ElevatorType;
import org.example.questions.elevatorSystem.elevators.PassengerElevator;
import org.example.questions.elevatorSystem.elevators.ServiceElevator;
import org.example.questions.elevatorSystem.lobby.Floor;
import org.example.questions.elevatorSystem.selectionStrategies.AvailableElevatorStrategy;
import org.example.questions.elevatorSystem.selectionStrategies.ClosestElevatorStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        // Floors
        HashMap<Integer, Floor> floors = new HashMap<>();
        Stream.of(1, 2, 3, 4, 5)
                .forEach(floor -> floors.put(floor, new Floor(floor, new ExternalPanel())));

        // Elevators
        List<Elevator> elevators = List.of(
//                ServiceElevator.builder()
//                        .elevatorNumber(1).elevatorType(ElevatorType.SERVICE_ELEVATOR)
//                        .panel(new InternalPanel())
//                        .build(),
                PassengerElevator.builder()
                        .elevatorNumber(1).elevatorType(ElevatorType.PASSENGER_ELEVATOR)
                        .panel(new InternalPanel()).currentPosition(6).isMoving(true)
                        .build(),
                PassengerElevator.builder()
                        .elevatorNumber(2).elevatorType(ElevatorType.PASSENGER_ELEVATOR)
                        .panel(new InternalPanel()).currentPosition(3).isMoving(true)
                        .build(),
                PassengerElevator.builder()
                        .elevatorNumber(3).elevatorType(ElevatorType.PASSENGER_ELEVATOR)
                        .panel(new InternalPanel()).currentPosition(7).isMoving(false)
                        .build()
        );

        ElevatorSystem elevatorSystem = new ModernElevatorSystem(floors, elevators, new ClosestElevatorStrategy());

        try {
            Elevator elevator = elevatorSystem.getElevator(5);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
