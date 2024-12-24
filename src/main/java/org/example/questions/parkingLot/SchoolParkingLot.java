package org.example.questions.parkingLot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.questions.parkingLot.display.Display;
import org.example.questions.parkingLot.floors.Floor;
import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.HashMap;
import java.util.List;


@Getter
@RequiredArgsConstructor
public class SchoolParkingLot implements ParkingLot {
    private final String parkingLotName;
    private final Display display;
    private final HashMap<Integer, Floor> floors;

    @Override
    public void addFloors(List<Floor> floors) {
        floors.forEach(floor -> this.floors.put(floor.getFloor(), floor));
        updateDisplay();
    }

    @Override
    public void addSpots(int floor, List<ParkingSpot> spots) {
        this.floors.get(floor).addParkingSlots(spots);
        updateDisplay();
    }

    @Override
    public ParkingSpot findParkingSpot(ParkingSpotType spotType) {
        ParkingSpot availableSpot = null;

        this.floors.forEach((floorNumber, floor) -> {
            availableSpot = floor.getParkingSpot(spotType);

            if (availableSpot != null) {
                switch (spotType) {
                    case CAR_PARKING -> floor.setCarParkingSlots(floor.getCarParkingSlots()-1);
                    case BIKE_PARKING -> floor.setBikeParkingSlots(floor.getBikeParkingSlots()-1);
                    case HANDICAP_PARKING -> floor.setHandicapParkingSlots(floor.getHandicapParkingSlots()-1);
                }

            }
        });

        return null;
    }

    @Override
    public void updateDisplay() {
        display.displayOnScreen(new HashMap<>());
    }
}
