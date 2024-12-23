package org.example.questions.parkingLot.floors;

import lombok.Getter;
import org.example.questions.parkingLot.parkingSlots.ParkingSlot;
import org.example.questions.parkingLot.parkingSlots.ParkingSlotType;

import java.util.*;


@Getter
public class Floor {
    private final String floor;
    private final Deque<ParkingSlot> parkingSlots;
    private final HashSet<ParkingSlot> reservedSlots;

    private int totalParkingSlots;
    private int carParkingSlots;
    private int bikeParkingSlots;
    private int handicapParkingSlots;

    public Floor(String floor) {
        this.floor = floor;
        this.parkingSlots = new ArrayDeque<>();
        this.reservedSlots = new HashSet<>();
    }

    public void addParkingSlots(List<ParkingSlot> slots) {
        for (ParkingSlot slot : slots) {
            parkingSlots.add(slot);

            if (slot.getParkingSlotType() == ParkingSlotType.CAR_PARKING) {
                carParkingSlots++;
            }
            else if (slot.getParkingSlotType() == ParkingSlotType.BIKE_PARKING) {
                bikeParkingSlots++;
            }
            else if (slot.getParkingSlotType() == ParkingSlotType.HANDICAP_PARKING) {
                handicapParkingSlots++;
            }
        }

        totalParkingSlots = parkingSlots.size();
        update();
    }

    public ParkingSlot getParkingSpot(ParkingSlotType slotType) {
        if (parkingSlots.isEmpty()) {
            return null;
        }

        ParkingSlot emptySlot = parkingSlots.stream()
                .filter(ParkingSlot::isAvailable)
                .map(slot -> {
                    if (slot.getParkingSlotType() == slotType) {
                        return slot;
                    }
                    return null;
                }).findFirst().orElse(null);

        parkingSlots.remove(emptySlot);
        reservedSlots.add(emptySlot);
        return emptySlot;
    }

    public void update() {

    }
}
