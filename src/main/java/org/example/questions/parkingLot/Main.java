package org.example.questions.parkingLot;

import org.example.questions.parkingLot.display.ParkingDisplay;
import org.example.questions.parkingLot.floors.Floor;
import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Floor> floorMap = new HashMap<>();
        floorMap.put(1, new Floor(1));
        floorMap.put(2, new Floor(2));
        floorMap.put(3, new Floor(3));
        floorMap.put(4, new Floor(4));

        floorMap.values().forEach(floor -> {
            int spotNumber = 100 + floor.getFloor();

            List<ParkingSpot> parkingSlots = List.of(
                    new ParkingSpot(spotNumber, ParkingSpotType.CAR_PARKING),
                    new ParkingSpot(spotNumber, ParkingSpotType.CAR_PARKING),
                    new ParkingSpot(spotNumber, ParkingSpotType.BIKE_PARKING),
                    new ParkingSpot(spotNumber, ParkingSpotType.HANDICAP_PARKING)
            );

            floor.addParkingSlots(parkingSlots);
        });

        SchoolParkingLot parkingLot = new SchoolParkingLot("School Parking", new ParkingDisplay(), floorMap);
    }
}
