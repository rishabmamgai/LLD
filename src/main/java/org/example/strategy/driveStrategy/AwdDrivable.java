package org.example.strategy.driveStrategy;


public class AwdDrivable implements Drivable {
    @Override
    public String getDriveMode() {
        return "All wheel drive.";
    }
}
