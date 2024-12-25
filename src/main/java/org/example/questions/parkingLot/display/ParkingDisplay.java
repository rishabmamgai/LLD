package org.example.questions.parkingLot.display;

import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.HashMap;


public class ParkingDisplay implements Display {
    @Override
    public void displayOnScreen(HashMap<ParkingSpotType, Integer> details) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ------------------- Parking Display -------------------- ");
        System.out.println("+ Car Parking : " + details.get(ParkingSpotType.CAR_PARKING));
        System.out.println("+ Bike Parking : " + details.get(ParkingSpotType.BIKE_PARKING));
        System.out.println("+ Handicap Parking : " + details.get(ParkingSpotType.HANDICAP_PARKING));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public ParkingSpot reserveParkingSpot(ParkingSpotType slotType) {
//        return parkingLot.findParkingSpot(slotType);
        return null;
    }
}
