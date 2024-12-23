package org.example.questions.elevatorSystem;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.questions.elevatorSystem.display.Panel;
import org.example.questions.elevatorSystem.elevators.Elevator;
import org.example.questions.elevatorSystem.lobby.Floor;
import org.example.questions.elevatorSystem.selectionStrategies.ElevatorSelectionStrategy;

import java.util.HashMap;
import java.util.List;


@Getter
@RequiredArgsConstructor
public class ModernElevatorSystem implements ElevatorSystem {
    private final HashMap<Integer, Floor> floors;
    private final List<Elevator> elevators;
    private final ElevatorSelectionStrategy selectionStrategy;

    @Override
    public Elevator getElevator(int fromFloor) {
        Panel panel = floors.get(fromFloor).panel();

        try {
            int destination = panel.displayScreen(floors.size());
            return selectionStrategy.getElevator(fromFloor, elevators);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
