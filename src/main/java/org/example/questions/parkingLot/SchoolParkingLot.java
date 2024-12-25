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
        for (Floor floor : this.floors.values()) {
            ParkingSpot availableSpot = floor.getParkingSpot(spotType);

            if (availableSpot != null) {
                switch (spotType) {
                    case CAR_PARKING -> floor.setCarParkingSlots(floor.getCarParkingSlots()-1);
                    case BIKE_PARKING -> floor.setBikeParkingSlots(floor.getBikeParkingSlots()-1);
                    case HANDICAP_PARKING -> floor.setHandicapParkingSlots(floor.getHandicapParkingSlots()-1);
                }

                return availableSpot;
            }
        }

        updateDisplay();
        return null;
    }

    @Override
    public void updateDisplay() {
        HashMap<ParkingSpotType, Integer> displayMap = new HashMap<>();

        for (Floor floor : this.floors.values()) {
            displayMap.put(ParkingSpotType.CAR_PARKING, displayMap.getOrDefault(ParkingSpotType.CAR_PARKING, 0) + floor.getCarParkingSlots());
            displayMap.put(ParkingSpotType.BIKE_PARKING, displayMap.getOrDefault(ParkingSpotType.BIKE_PARKING, 0) + floor.getBikeParkingSlots());
            displayMap.put(ParkingSpotType.HANDICAP_PARKING, displayMap.getOrDefault(ParkingSpotType.HANDICAP_PARKING, 0) + floor.getHandicapParkingSlots());
        }

        display.displayOnScreen(displayMap);
    }
}
