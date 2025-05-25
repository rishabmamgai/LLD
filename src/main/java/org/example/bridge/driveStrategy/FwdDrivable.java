package org.example.bridge.driveStrategy;


public class FwdDrivable implements Drivable {
    @Override
    public String getDriveMode() {
        return "Front wheel drive.";
    }
}
