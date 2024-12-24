package org.example.questions.parkingLot.display;

import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.HashMap;


public class ParkingDisplay implements Display {
    @Override
    public void displayOnScreen(HashMap<String, Integer> details) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ------------------- Parking Display -------------------- ");
        System.out.println("+ Car Parking : " + details.get("carParkingSlots"));
        System.out.println("+ Bike Parking : " + details.get("bikeParkingSlots"));
        System.out.println("+ Handicap Parking : " + details.get("handicapParkingSlots"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public ParkingSpot reserveParkingSpot(ParkingSpotType slotType) {
//        return parkingLot.findParkingSpot(slotType);
        return null;
    }
}
