package org.example.questions.elevatorSystem.display;

import java.util.Scanner;


public class ExternalPanel implements Panel {
    @Override
    public void toFloor(int destination) {
        System.out.println("Finding lift");
    }

    @Override
    public int displayScreen(int totalFloors) throws Exception {
        System.out.println("++++++++++ Select Floor ++++++++++");

        for (int i=1; i<=totalFloors; i+=3) {
            String display = String.format("[%d] [%d] [%d]", i, i+1, i+2);
            System.out.println(display);
        }

        System.out.println("++++++++++ Enter Floor Number ++++++++++");
        Scanner sc = new Scanner(System.in);
        int destination = sc.nextInt();

        if (destination > totalFloors) {
            throw new Exception("Invalid floor");
        }

        return destination;
    }
}
