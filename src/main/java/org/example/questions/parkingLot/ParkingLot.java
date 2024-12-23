package org.example.questions.parkingLot;

import org.example.questions.parkingLot.floors.Floor;
import org.example.questions.parkingLot.parkingSlots.ParkingSlot;
import org.example.questions.parkingLot.parkingSlots.ParkingSlotType;

import java.util.List;


public interface ParkingLot {
    void addFloors(List<Floor> floors);
    ParkingSlot findParkingSpot(ParkingSlotType slotType);
    void updateDisplay();
}
