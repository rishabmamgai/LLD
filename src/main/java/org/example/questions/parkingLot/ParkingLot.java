package org.example.questions.parkingLot;

import org.example.questions.parkingLot.floors.Floor;
import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.List;


public interface ParkingLot {
    void addFloors(List<Floor> floors);
    void addSpots(int floorNumber, List<ParkingSpot> spots);
    ParkingSpot findParkingSpot(ParkingSpotType slotType);
    void updateDisplay();
}
