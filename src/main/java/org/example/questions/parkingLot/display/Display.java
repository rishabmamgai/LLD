package org.example.questions.parkingLot.display;

import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.HashMap;


public interface Display {
    void displayOnScreen(HashMap<ParkingSpotType, Integer> details);
    ParkingSpot reserveParkingSpot(ParkingSpotType slotType);
}
