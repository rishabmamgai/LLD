package org.example.questions.parkingLot;

import lombok.Getter;
import org.example.questions.parkingLot.display.Display;
import org.example.questions.parkingLot.floors.Floor;
import org.example.questions.parkingLot.parkingSlots.ParkingSlot;
import org.example.questions.parkingLot.parkingSlots.ParkingSlotType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


@Getter
public class SchoolParkingLot implements ParkingLot {
    private final String parkingLotName;
    private final HashSet<Floor> floors;
    private final Display display;

    private int totalParkingSlots;
    private int carParkingSlots;
    private int bikeParkingSlots;
    private int handicapParkingSlots;

    public SchoolParkingLot(String parkingLotName, Display display) {
        this.parkingLotName = parkingLotName;
        this.display = display;
        this.floors = new HashSet<>();
    }

    @Override
    public void addFloors(List<Floor> floors) {
        for (Floor floor : floors) {
            carParkingSlots += floor.getCarParkingSlots();
            bikeParkingSlots += floor.getBikeParkingSlots();
            handicapParkingSlots += floor.getHandicapParkingSlots();

            this.floors.add(floor);
        }

        totalParkingSlots = carParkingSlots + bikeParkingSlots + handicapParkingSlots;
        updateDisplay();
    }

    @Override
    public ParkingSlot findParkingSpot(ParkingSlotType slotType) {
        return floors.stream()
                .map(floor -> floor.getParkingSpot(slotType))
                .findFirst().orElse(null);
    }

    @Override
    public void updateDisplay() {
        HashMap<String, Integer> displayMap = new HashMap<>();

        displayMap.put("carParkingSlots", carParkingSlots);
        displayMap.put("bikeParkingSlots", bikeParkingSlots);
        displayMap.put("handicapParkingSlots", handicapParkingSlots);

        display.displayOnScreen(displayMap);
    }
}
