package org.example.questions.parkingLot.floors;

import lombok.Getter;
import lombok.Setter;
import org.example.questions.parkingLot.parkingSpots.ParkingSpot;
import org.example.questions.parkingLot.parkingSpots.ParkingSpotType;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;


@Getter
@Setter
public class Floor {
    private final int floor;
    private final Deque<ParkingSpot> availableSpots;
    private final Deque<ParkingSpot> unavailableSlots;

    private int carParkingSlots;
    private int bikeParkingSlots;
    private int handicapParkingSlots;

    public Floor(int floor) {
        this.floor = floor;
        this.availableSpots = new ArrayDeque<>();
        this.unavailableSlots = new ArrayDeque<>();
    }

    public void addParkingSlots(List<ParkingSpot> spots) {
        spots.forEach(spot -> {
            availableSpots.add(spot);

            switch (spot.getParkingSpotType()) {
                case CAR_PARKING -> carParkingSlots++;
                case BIKE_PARKING -> bikeParkingSlots++;
                case HANDICAP_PARKING -> handicapParkingSlots++;
            }
        });
    }

    public ParkingSpot getParkingSpot(ParkingSpotType spotType) {
        if (availableSpots.isEmpty()) {
            return null;
        }

        ParkingSpot emptySlot = availableSpots.stream()
                .filter(spot -> spot.getParkingSpotType() == spotType)
                .filter(ParkingSpot::isAvailable)
                .findFirst()
                .orElse(null);

        availableSpots.remove(emptySlot);
        unavailableSlots.add(emptySlot);
        return emptySlot;
    }
}
