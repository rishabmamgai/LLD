package org.example.questions.parkingLot.display;

import org.example.questions.parkingLot.parkingSlots.ParkingSlot;
import org.example.questions.parkingLot.parkingSlots.ParkingSlotType;

import java.util.HashMap;


public class MobileDisplay implements Display {
    @Override
    public void displayOnScreen(HashMap<String, Integer> details) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ------------------- Mobile Display -------------------- ");
        System.out.println("+ Car Parking : " + details.get("carParkingSlots"));
        System.out.println("+ Bike Parking : " + details.get("bikeParkingSlots"));
        System.out.println("+ Handicap Parking : " + details.get("handicapParkingSlots"));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    public ParkingSlot reserveParkingSpot(ParkingSlotType slotType) {
        return null;
    }
}
