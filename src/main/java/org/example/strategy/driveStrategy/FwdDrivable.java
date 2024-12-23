package org.example.strategy.driveStrategy;


public class FwdDrivable implements Drivable {
    @Override
    public String getDriveMode() {
        return "Front wheel drive.";
    }
}
