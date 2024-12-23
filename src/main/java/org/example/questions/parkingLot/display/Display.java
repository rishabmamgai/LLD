package org.example.questions.parkingLot.display;

import org.example.questions.parkingLot.parkingSlots.ParkingSlot;
import org.example.questions.parkingLot.parkingSlots.ParkingSlotType;

import java.util.HashMap;


public interface Display {
    void displayOnScreen(HashMap<String, Integer> details);
    ParkingSlot reserveParkingSpot(ParkingSlotType slotType);
}
