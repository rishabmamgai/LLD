package org.example.questions.elevatorSystem.display;


public class InternalPanel implements ControlScreen {
    @Override
    public void toFloor(int destination) {
        System.out.println("Finding lift");
    }
}
